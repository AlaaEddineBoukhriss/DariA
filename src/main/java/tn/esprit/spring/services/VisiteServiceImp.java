package tn.esprit.spring.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Annonce;
import tn.esprit.spring.entities.Visite;
import tn.esprit.spring.repository.VisiteRepositroy;


@Service
public class VisiteServiceImp implements VisiteService {

	@Autowired
	private VisiteRepositroy visiteRepo;

	@Override
	public Visite addVisite(Visite visite) {
		
		return visiteRepo.save(visite) ;
	}

	@Override
	public List<Visite> retrieveAllVisites() {
		
		List<Visite> RDV= (List<Visite>) visiteRepo.findAll() ;
		return RDV;
	}

	@Override
	public Visite updateVisite(Visite visite, Long id) {
		
		Visite visiteDB = visiteRepo.findById(id).orElse(null);
		  visiteDB.setClient(visite.getClient());
		  visiteDB.setDateVisite(visite.getDateVisite());
   return visiteRepo.save(visiteDB);
	}

	@Override
	public void deleteVisiteById(Long id) {
		visiteRepo.deleteById(id);
		
	}

	@Override
	public List<Visite> findvisiteByuser(Long id)
    {
        return (List<Visite>) visiteRepo.findvisiteByuser(id);

    }
	
	@Override
	public List<Visite> findvisiteByannonce(Long id)
    {
        return (List<Visite>) visiteRepo.findvisiteByannonce(id);

    }
	
}
