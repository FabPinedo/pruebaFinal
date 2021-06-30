package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.EmpresaEntity;

@Repository
public interface EmpresaDAO extends CrudRepository<EmpresaEntity,String>{

}
