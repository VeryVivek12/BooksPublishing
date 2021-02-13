package com.bookspublishing.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bookspublishing.model.User;
import com.bookspublishing.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}
