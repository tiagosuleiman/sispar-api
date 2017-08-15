package com.sispar.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SPEC_SEQ", sequenceName = "SPECIALTY_SEQ", initialValue = 1, allocationSize = 1)
public class Specialty {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SPEC_SEQ")
    @Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	private String procedimento;
	private String description;
	private boolean enabled;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
