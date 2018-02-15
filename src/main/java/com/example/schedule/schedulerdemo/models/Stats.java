package com.example.schedule.schedulerdemo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.domain.Persistable;

@Entity
@Table(name = "stats")
public class Stats implements Serializable, Persistable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String libelle;
	private Date heureDeb;
	private Date heureFin;

	@Transient
	private boolean isNew = false;

	public Stats() {

	}

	public Stats(Long id, String libelle, Date heureDeb, Date heureFin,
			boolean isNew) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.heureDeb = heureDeb;
		this.heureFin = heureFin;
		this.isNew = isNew;
	}

	public Stats(String libelle, Date heureDeb, Date heureFin) {
		super();
		this.libelle = libelle;
		this.heureDeb = heureDeb;
		this.heureFin = heureFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getHeureDeb() {
		return heureDeb;
	}

	public void setHeureDeb(Date heureDeb) {
		this.heureDeb = heureDeb;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	@Override
	public String toString() {
		return "Stats [id=" + id + ", libelle=" + libelle + ", heureDeb="
				+ heureDeb + ", heureFin=" + heureFin + "]";
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return isNew;
	}

}
