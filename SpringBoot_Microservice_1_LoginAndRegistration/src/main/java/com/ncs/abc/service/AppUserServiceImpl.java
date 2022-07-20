package com.ncs.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ncs.abc.model.AppUsers;
import com.ncs.abc.model.MyUserDetails;
import com.ncs.abc.repository.AppUsersRepository;




@Service
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private AppUsersRepository userRepo;

	@Override  // from UserDetailsService
	public UserDetails loadUserByUsername(String username) throws 
	      UsernameNotFoundException {
		
		AppUsers user =  userRepo.getUsersByUsername(username);
		System.out.println(" ");
		System.out.println("--------Inside App User Service IMP ---------- ");
		System.out.println(" Arg :- "+username);
		System.out.println(" From Database "+user);
		
		return new MyUserDetails(user);
		
		
		
		//User user1 = new User("raja","abc",Arrays.asList(new SimpleGrantedAuthority("admin")));
		//return user1;
	}
	
	@Override
	public AppUsers saveUsers(AppUsers appUsers)
	{
		return userRepo.save(appUsers);
	}

	@Override
	public AppUsers getAllUsersByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


