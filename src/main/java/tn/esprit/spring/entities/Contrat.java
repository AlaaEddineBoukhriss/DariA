package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

<<<<<<< HEAD
@Entity
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// relation
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "Contrat")
=======


@Entity
public class Contrat implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	
	//relation
	@ManyToMany(cascade = CascadeType.ALL, mappedBy="Contrat")
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8
	private Set<User> User;
}
