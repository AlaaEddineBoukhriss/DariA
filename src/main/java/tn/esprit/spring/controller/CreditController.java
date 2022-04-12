package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Credit;
import tn.esprit.spring.services.IcreditService;

@RestController
public class CreditController {
	
	@Autowired
	private IcreditService myCredService ;
	
	@PostMapping("/credit")
	public Credit saveCredit(
	     @RequestBody Credit credit)
	{
	    return myCredService.saveCredit(credit);
	}

	// Read operation
	@GetMapping("/credit")
	public List<Credit> fetchList()
	{
	    return myCredService.getAllCredits();
	}

	// Update operation
	

	// Delete operation
	@DeleteMapping("/credit/{id}")
	public String deleteCredit(@PathVariable("id")
	                                   Long id)
	{
	    myCredService.deleteCredit(
	        id);

	    return "Deleted Successfully";
	}

}
