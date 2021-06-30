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
	
}
