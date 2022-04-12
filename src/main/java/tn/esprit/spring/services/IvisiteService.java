package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Visite;

public interface IvisiteService {
	public Visite saveVisite(Visite visite);
	public Visite updateVisite(Visite visite, Long id);
	public List<Visite> getAllVisits();
	public void deleteVisite(long id);



}
