package tn.esprit.spring.services;

import tn.esprit.spring.entities.Annonce;

import java.util.List;

public interface AnnonceService {

	// save operation
	Annonce saveAnnonce(Annonce annonce);

	// read operation
	List<Annonce> fetchAnnonceList();

	// update operation
	Annonce updateAnnonce(Annonce annonce, Long annonceId);

	// delete operation
	void deleteAnnonceById(Long annonceId);
}
