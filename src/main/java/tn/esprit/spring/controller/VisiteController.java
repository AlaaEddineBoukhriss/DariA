package tn.esprit.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Visite;
import tn.esprit.spring.services.IvisiteService;


@RestController

public class VisiteController {

@Autowired
private IvisiteService myvisiteService;
@PostMapping("/visites")
public Visite saveVisite(
     @RequestBody Visite visite)
{
    return myvisiteService.saveVisite(visite);
}

// Read operation
@GetMapping("/visites")
public List<Visite> fetchList()
{
    return myvisiteService.getAllVisits();
}

// Update operation
@PutMapping("/visites/{id}")
public Visite
updateDepartment(@RequestBody Visite visite,
                 @PathVariable("id") Long id)
{
    return myvisiteService.updateVisite(
        visite, id);
}

// Delete operation
@DeleteMapping("/Visites/{id}")
public String deleteVisite(@PathVariable("id")
                                   Long id)
{
    myvisiteService.deleteVisite(
        id);

    return "Deleted Successfully";
}
	
}
