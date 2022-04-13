package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Annonce;
import tn.esprit.spring.repository.AnnonceRepository;

import java.util.List;
import java.util.Objects;

@Service
public class AnnonceServiceImpl implements AnnonceService  {
	
	@Autowired
    private AnnonceRepository annonceRepository;
  
    // save operation
    @Override
    public Annonce saveAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }
  
    // read operation
    @Override
    public List<Annonce> fetchAnnonceList() {
        return (List<Annonce>) annonceRepository.findAll();
    }
  
    // update operation
    @Override
    public Annonce updateAnnonce(Annonce annonce, Long annonceId) {
    	Annonce annonceDB = annonceRepository.findById(annonceId).get();
  
        if (Objects.nonNull(annonce.getTitre()) && !"".equalsIgnoreCase(annonce.getTitre())) {
            annonceDB.setTitre(annonce.getTitre());
        }
  
        if (Objects.nonNull(annonce.getPrix()) && !"".equals(annonce.getPrix())) {
            annonceDB.setPrix(annonce.getPrix());
        }
  
        if (Objects.nonNull(annonce.getDescription()) && !"".equalsIgnoreCase(annonce.getDescription())) {
            annonceDB.setTitre(annonce.getDescription());
        }
  
        
  
        return annonceRepository.save(annonceDB);
    }
  
    // delete operation
    @Override
    public void deleteAnnonceById(Long annonceId) {
        annonceRepository.deleteById(annonceId);
    }
  
}
	
	