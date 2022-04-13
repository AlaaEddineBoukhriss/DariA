package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
=======
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8

@Entity
public class Credit implements Serializable {
	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@ManyToOne
	private User user;
=======
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
>>>>>>> 2ae34a2fec26249b7828f9dbf3c66fe83d18d2a8
}
