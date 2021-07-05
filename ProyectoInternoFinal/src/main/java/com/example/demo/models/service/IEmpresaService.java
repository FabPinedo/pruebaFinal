package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.EmpresaEntity;

public interface IEmpresaService {
	public List<EmpresaEntity> findAll();

	public void save(EmpresaEntity empresa);

	public void deleteID(String cod_Empresa);

	public EmpresaEntity findById(String cod_Empresa);
	
}
