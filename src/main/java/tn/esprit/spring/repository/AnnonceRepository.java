package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long> {

}
