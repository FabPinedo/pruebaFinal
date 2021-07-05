package com.example.demo.models.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.entity.EmpresaEntity;
import com.example.demo.models.service.IEmpresaService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*" )
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping("/empresa")
	public List<EmpresaEntity> index() {
	return empresaService.findAll();
		}
	
	@GetMapping("/empresa/{cod_Empresa}")
	public EmpresaEntity show(@PathVariable String cod_Empresa){
	return empresaService.findById(cod_Empresa);
		}
	
	@PostMapping("/empresa")
	@ResponseStatus(HttpStatus.CREATED)
	public EmpresaEntity insertar(@RequestBody EmpresaEntity empresa) {
		List<EmpresaEntity> lista=empresaService.findAll();
		int cod=lista.size()+1;
		empresa.setCod_Empresa("00"+Integer.toString(cod));
		//empresa.setCod_Empresa("0014");
		//System.out.print(empresa.toString());
		this.empresaService.save(empresa);
		return empresa;
		}
	
	
	@DeleteMapping(value="/empresa/{cod_Empresa}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable("cod_Empresa") String cod_Empresa) {
			empresaService.deleteID(cod_Empresa);
		}
	@PutMapping("/empresa/{cod_Empresa}")
	public EmpresaEntity update(@RequestBody EmpresaEntity empresa,@PathVariable String cod_Empresa) {
		EmpresaEntity empresaActual=empresaService.findById(cod_Empresa);
		empresaActual.setDes_direccion(empresa.getDes_direccion());
		empresaActual.setDes_nombre_Comercial(empresa.getDes_nombre_Comercial());
		empresaActual.setDes_razon_social(empresa.getDes_razon_social());
		empresaActual.setDes_repres_legal(empresa.getDes_repres_legal());
		empresaActual.setNum_doc_repres(empresa.getNum_doc_repres());
		empresaActual.setNum_RUC_empresa(empresa.getNum_RUC_empresa());
		empresaService.save(empresaActual);
		return empresaActual;
		
		
	}
	
	

}