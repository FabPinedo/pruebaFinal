package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAE_EMPRESAS")
public class EmpresaEntity implements Serializable{
	@Id
	//@Column(name="COD_EMPRESA")
	String cod_Empresa;
	//@Column(name="DES_RAZON_SOCIAL")
    String des_razon_social;
//	@Column(name="DES_NOMBRE_COMERCIAL")
    String des_nombre_Comercial;
	//@Column(name="DES_DIRECCION")
    String des_direccion;
	//@Column(name="NUM_RUC_EMPRESAL")
    String num_RUC_empresa;
	//@Column(name="NUM_DOC_REPRES")
    String num_doc_repres;
	//@Column(name="DES_REPRES_LEGAL")
    String des_repres_legal;
	public String getCod_Empresa() {
		return cod_Empresa;
	}
	public void setCod_Empresa(String cod_Empresa) {
		this.cod_Empresa = cod_Empresa;
	}
	public String getDes_razon_social() {
		return des_razon_social;
	}
	public void setDes_razon_social(String des_razon_social) {
		this.des_razon_social = des_razon_social;
	}
	public String getDes_nombre_Comercial() {
		return des_nombre_Comercial;
	}
	public void setDes_nombre_Comercial(String des_nombre_Comercial) {
		this.des_nombre_Comercial = des_nombre_Comercial;
	}
	public String getDes_direccion() {
		return des_direccion;
	}
	public void setDes_direccion(String des_direccion) {
		this.des_direccion = des_direccion;
	}
	public String getNum_RUC_empresa() {
		return num_RUC_empresa;
	}
	public void setNum_RUC_empresa(String num_RUC_empresa) {
		this.num_RUC_empresa = num_RUC_empresa;
	}
	public String getNum_doc_repres() {
		return num_doc_repres;
	}
	public void setNum_doc_repres(String num_doc_repres) {
		this.num_doc_repres = num_doc_repres;
	}
	public String getDes_repres_legal() {
		return des_repres_legal;
	}
	public void setDes_repres_legal(String des_repres_legal) {
		this.des_repres_legal = des_repres_legal;
	}
	@Override
	public String toString() {
		return "EmpresaEntity [cod_Empresa=" + cod_Empresa + ", des_razon_social=" + des_razon_social
				+ ", des_nombre_Comercial=" + des_nombre_Comercial + ", des_direccion=" + des_direccion
				+ ", num_RUC_empresa=" + num_RUC_empresa + ", num_doc_repres=" + num_doc_repres + ", des_repres_legal="
				+ des_repres_legal + "]";
	}
	
	
	
}
