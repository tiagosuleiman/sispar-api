package com.sispar.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Request")
@SequenceGenerator(name = "REQ_SEQ", sequenceName = "REQUEST_SEQ", initialValue = 1, allocationSize = 1)
public class Request {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="REQ_SEQ")
    @Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	private String solicitante;
		
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data;
	
	private String oficio;
	private String exame;
	private String consulta;
	private String cirurgia;
	private String outros;
	private Long tid;
			
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public String getCirurgia() {
		return cirurgia;
	}
	public void setCirurgia(String cirurgia) {
		this.cirurgia = cirurgia;
	}
	public String getOutros() {
		return outros;
	}
	public void setOutros(String outros) {
		this.outros = outros;
	}
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	
	
}
