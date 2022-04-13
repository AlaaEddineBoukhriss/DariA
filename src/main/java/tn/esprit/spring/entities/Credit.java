package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Credit implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private double autoFinancement;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getAutoFinancement() {
		return autoFinancement;
	}
	public void setAutoFinancement(double autoFinancement) {
		this.autoFinancement = autoFinancement;
	}
	public Credit(Long id, double autoFinancement) {
		super();
		this.id = id;
		this.autoFinancement = autoFinancement;
	}
	public Credit() {
		super();
	}
	
	
}
