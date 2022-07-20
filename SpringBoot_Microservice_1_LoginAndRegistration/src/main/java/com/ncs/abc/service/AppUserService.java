package com.ncs.abc.service;

import org.springframework.stereotype.Service;

import com.ncs.abc.model.AppUsers;

import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public interface AppUserService extends UserDetailsService{
	public AppUsers saveUsers(AppUsers appUsers);  // business related method : functional requirement

	public AppUsers getAllUsersByRole(String role);
	
}
