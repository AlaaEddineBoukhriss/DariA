package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Credit;

public interface IcreditService {
	public Credit saveCredit(Credit cred);
	public List<Credit> getAllCredits();
	public void deleteCredit(long id);


}
