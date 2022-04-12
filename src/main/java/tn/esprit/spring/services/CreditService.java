package tn.esprit.spring.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Credit;
import tn.esprit.spring.repository.CreditRepository;


@Service
public class CreditService implements IcreditService{
	@Autowired
	private CreditRepository CredRepo;

	@Override
	public Credit saveCredit(Credit cred)
	{
	return CredRepo.save(cred);
	}

	@Override
	public List<Credit> getAllCredits()
	{return (List<Credit>)
	        CredRepo.findAll();
		}
	@Override
	public void deleteCredit(long id)
	{
	    CredRepo.deleteById(id);
	}


}
