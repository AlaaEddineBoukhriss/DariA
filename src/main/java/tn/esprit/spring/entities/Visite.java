package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

<<<<<<< HEAD
@Entity
public class Visite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// relation
=======


@Entity
public class Visite implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	//relation
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8
	@OneToOne(cascade = CascadeType.ALL)
	private Annonce Annonce;
}
