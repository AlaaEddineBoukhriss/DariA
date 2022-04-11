package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import tn.esprit.spring.entities.Role;



@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	@Enumerated(EnumType.STRING)
    private Role Role;
	private String name;
	private String email;
	private String password;
	private String num;
	private boolean statut;
	
	private String favoris;


	
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
	
		
		
}
