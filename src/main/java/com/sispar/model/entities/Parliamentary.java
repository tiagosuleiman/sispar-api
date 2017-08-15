package com.sispar.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "PARLIAM_SEQ", sequenceName = "PARLIAMENTARY_SEQ", initialValue = 1, allocationSize = 1)
public class Parliamentary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PARLIAM_SEQ")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    private String nome;
    private String solicitante;
    private String partido;
    private boolean enabled;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
