package com.example.demo.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.EmpresaEntity;
import com.example.demo.models.service.IEmpresaService;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api")
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;

	@GetMapping("/empresa")
	public List<EmpresaEntity> index() {
	return empresaService.findAll();
		}

}