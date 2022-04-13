package tn.esprit.spring.entities;

import java.io.Serializable;
<<<<<<< HEAD
import java.sql.Date;
import java.util.Arrays;
=======
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Annonce implements Serializable {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private String[] images;
	private double prix;
	private Transaction transaction ;
	private TypeBien typedebien; 
	private Etat etat;
	private String localisation ;
	private double superficie ;
	private int nbrchambre ; 
	private int age ;
	private int etage;
	private int numero;
	private Date datecreation;

	
	public Annonce() {
		super();
	}




	public Annonce(Long id, String titre, String description, String[] images, double prix, Transaction transaction,
			TypeBien typedebien, Etat etat, String localisation, double superfice, int nbrchambre, int age, int etage,
			int numero, Date datecreation,
			tn.esprit.spring.entities.Visite visite) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.images = images;
		this.prix = prix;
		this.transaction = transaction;
		this.typedebien = typedebien;
		this.etat = etat;
		this.localisation = localisation;
		this.superficie = superfice;
		this.nbrchambre = nbrchambre;
		this.age = age;
		this.etage = etage;
		this.numero = numero;
		this.datecreation = datecreation;
		Visite = visite;
	}




	@Override
	public String toString() {
		return "Annonce [id=" + id + ", titre=" + titre + ", description=" + description + ", images="
				+ Arrays.toString(images) + ", prix=" + prix + ", transaction=" + transaction + ", typedebien="
				+ typedebien + ", etat=" + etat + ", localisation=" + localisation + ", superficie=" + superficie
				+ ", nbrchambre=" + nbrchambre + ", age=" + age + ", etage=" + etage + ", numero=" + numero
				+ ", datecreation=" + datecreation + ", Visite=" + Visite + "]";
	}




	public String getLocalisation() {
		return localisation;
	}




	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}




	public double getSuperficie() {
		return superficie;
	}




	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}




	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public TypeBien getTypedebien() {
		return typedebien;
	}

	public void setTypedebien(TypeBien typedebien) {
		this.typedebien = typedebien;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public int getNbrchambre() {
		return nbrchambre;
	}

	public void setNbrchambre(int nbrchambre) {
		this.nbrchambre = nbrchambre;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Visite getVisite() {
		return Visite;
	}

	public void setVisite(Visite visite) {
		Visite = visite;
	}

	

	// relation

	@ManyToOne
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "Annonce")
=======
import javax.persistence.OneToOne;



@Entity
public class Annonce implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	
	
	//relation
	@OneToOne(cascade = CascadeType.ALL, mappedBy="Annonce")
	private Immobilier Immobilier;
	@OneToOne(cascade = CascadeType.ALL, mappedBy="Annonce")
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8
	private Visite Visite;
}
