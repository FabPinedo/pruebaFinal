package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.models.entity.EmpresaEntity;


@SpringBootApplication
public class ProyectoInternoFinalApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoInternoFinalApplication.class, args);
	}
	@Override
	public void run (String ...ars) throws Exception{
		String sql="Select * From MAE_EMPRESAS";
		List<EmpresaEntity>empresas= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(EmpresaEntity.class));
		System.out.print(empresas.get(1).getDes_nombre_Comercial());
		empresas.forEach(System.out:: println);
	}
}
