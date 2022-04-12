package tn.esprit.spring.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;





@Entity
public class Visite implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	@OneToOne(cascade = CascadeType.ALL)
	private Annonce Annonce;
	private LocalDate Date;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Annonce getAnnonce() {
		return Annonce;
	}

	public void setAnnonce(Annonce annonce) {
		Annonce = annonce;
	}

	//relation
	

	public Visite(tn.esprit.spring.entities.Annonce annonce, LocalDate date) {
		super();
		Annonce = annonce;
		setDate(date);
	}

	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}
	
}
