package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Visite;
@Repository
public interface VisiteRepository extends JpaRepository<Visite,Long> {

}
