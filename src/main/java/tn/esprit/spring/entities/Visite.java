package tn.esprit.spring.entities;

import java.io.Serializable;

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
	//relation
	@OneToOne(cascade = CascadeType.ALL)
	private Annonce Annonce;
}
