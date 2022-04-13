package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Abonnement implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// relation

	@ManyToOne
	private User user;
	
=======
import javax.persistence.OneToOne;



@Entity
public class Abonnement implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	//relation 
	@OneToOne(cascade = CascadeType.ALL, mappedBy="Abonnement")
	private Immobilier Immobilier;

>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8
}
