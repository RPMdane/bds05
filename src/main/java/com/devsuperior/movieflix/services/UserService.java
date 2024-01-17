package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthService authService;

    public UserDTO getProfile() {
        User user = authService.authenticated();
        return new UserDTO(user);
    }
    
}
