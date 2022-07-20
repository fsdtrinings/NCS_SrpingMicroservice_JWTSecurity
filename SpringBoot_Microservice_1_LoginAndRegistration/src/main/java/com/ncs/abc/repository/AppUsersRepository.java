package com.ncs.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ncs.abc.model.AppUsers;


@Repository
public interface AppUsersRepository extends JpaRepository<AppUsers, Integer> 
{
	@Query("from AppUsers where username = :username")
	public AppUsers getUsersByUsername(String username);
}
