package tn.esprit.spring.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Visite;
import tn.esprit.spring.repository.VisiteRepository;

@Service
public class VisiteService implements IvisiteService {
	
@Autowired
private VisiteRepository visiteRepo;

@Override
public Visite saveVisite(Visite visite)
{
return visiteRepo.save(visite);
}

@Override
public Visite updateVisite(Visite visite, Long id)
{
	Visite vis
    = visiteRepo.findById(id)
          .get();

if (Objects.nonNull(visite.getDate())
    && !"".equals(
        visite.getDate())) {
    vis.setDate(
        visite.getDate());
}
return visiteRepo.save(vis);	
}
@Override
public List<Visite> getAllVisits()
{return (List<Visite>)
        visiteRepo.findAll();
	}
@Override
public void deleteVisite(long id)
{
    visiteRepo.deleteById(id);
}

}
