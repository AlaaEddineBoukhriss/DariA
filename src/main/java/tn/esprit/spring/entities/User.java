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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	private String username;
	private String email;
	@Enumerated(EnumType.STRING)
	private  Role role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
		public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

		public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
   
	public Set<Annonce> getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Set<Annonce> annonce) {
		this.annonce = annonce;
	}
	public Set<Reclamation> getReclamation() {
		return Reclamation;
	}
	public void setReclamation(Set<Reclamation> reclamation) {
		Reclamation = reclamation;
	}
	public Set<Contrat> getContrat() {
		return Contrat;
	}
	public void setContrat(Set<Contrat> contrat) {
		Contrat = contrat;
	}
	public Set<Credit> getCredit() {
		return Credit;
	}
	public void setCredit(Set<Credit> credit) {
		Credit = credit;
	}
	public Set<SouscriptionAssurance> getSouscriptionAssurance() {
		return SouscriptionAssurance;
	}
	public void setSouscriptionAssurance(Set<SouscriptionAssurance> souscriptionAssurance) {
		SouscriptionAssurance = souscriptionAssurance;
	}
	public Visite getVisite() {
		return visite;
	}
	public void setVisite(Visite visite) {
		this.visite = visite;
	}
	public Set<Assurance> getAssurance() {
		return Assurance;
	}
	public void setAssurance(Set<Assurance> assurance) {
		Assurance = assurance;
	}

	

   @JsonIgnore
	public Abonnement getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}




	// relation
	@JoinTable(
    joinColumns = @JoinColumn(name = "user_id"))        
	@ManyToMany
	private Set<Annonce> annonce;

	// relation

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Reclamation> Reclamation;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Contrat> Contrat;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Credit> Credit;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<SouscriptionAssurance> SouscriptionAssurance;
	@OneToOne(cascade = CascadeType.ALL)
	private Visite visite ;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Assurance> Assurance;
	@ManyToOne
	private Abonnement abonnement;
	

}
