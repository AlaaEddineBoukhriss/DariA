package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

<<<<<<< HEAD
@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// relation
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Annonce> Annonce;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Reclamation> Reclamation;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Contrat> Contrat;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Credit> Credit;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<SouscriptionAssurance> SouscriptionAssurance;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Assurance> Assurance;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Abonnement> Abonnement;
=======


@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	
	//relation
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Annonce> Annonce;
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Reclamation> Reclamation;
		@ManyToMany(cascade = CascadeType.ALL)
		private Set<Contrat> Contrat;
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Credit> Credit;
		@OneToMany(cascade = CascadeType.ALL)
		private Set<SouscriptionAssurance> SouscriptionAssurance;
	
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8
}
