package com.sispar.model.vo;

import java.util.Date;

public class RequestVO {
	private String partido;
	private String cargo;
	private String parlamentar;
	private Date data;
	private Long oficio;
	private String exame;
	private String consulta;
	private String cirurgia;
	private String outros;
	private Long tid;
	
	public RequestVO(
			String partido,
			String cargo,
			String parlamentar,
			Date data,
			Long oficio,
			String exame,
			String consulta,
			String cirurgia,
			String outros,
			Long tid) {
		this.partido = partido;
		this.cargo = cargo;
		this.parlamentar = parlamentar;
		this.data = data;
		this.oficio = oficio;
		this.exame = exame;
		this.consulta = consulta;
		this.cirurgia = cirurgia;
		this.outros = outros;
		this.tid = tid;
	}
	
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getParlamentar() {
		return parlamentar;
	}
	public void setParlamentar(String parlamentar) {
		this.parlamentar = parlamentar;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Long getOficio() {
		return oficio;
	}
	public void setOficio(Long oficio) {
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
