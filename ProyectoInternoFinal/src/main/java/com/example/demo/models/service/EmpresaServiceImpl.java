package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.EmpresaDAO;
import com.example.demo.models.entity.EmpresaEntity;


@Service
public class EmpresaServiceImpl implements IEmpresaService{
	
	@Autowired
	private EmpresaDAO EmpresaDAO;

	@Override
	@Transactional(readOnly = true)
	public List<EmpresaEntity> findAll() {
		return (List<EmpresaEntity>) EmpresaDAO.findAll();
	}

	@Override
	@Transactional
	public void save(EmpresaEntity empresa) {
		this.EmpresaDAO.save(empresa);
	}

	@Override
	@Transactional
	public void deleteID(String cod_Empresa) {
		// TODO Auto-generated method stub
		EmpresaDAO.deleteById(cod_Empresa);
	}

	@Override
	@Transactional(readOnly = true)
	public EmpresaEntity findById(String cod_Empresa) {
		// TODO Auto-generated method stub
		return EmpresaDAO.findById(cod_Empresa).orElse(null);
	}
	
}
