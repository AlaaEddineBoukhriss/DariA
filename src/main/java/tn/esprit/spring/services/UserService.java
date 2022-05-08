package tn.esprit.spring.services;


import tn.esprit.spring.entities.User;

public interface UserService {
	User retrieveUser(Long id);
}
