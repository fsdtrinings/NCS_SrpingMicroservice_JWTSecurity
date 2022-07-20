package com.ncs.abc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/work")
	public String demoEmployee(@RequestHeader(name = "Authorization") String token)
	{
		//"http://NCS-MOVIE-REVIEW-SERVICE/api/review/rating/"
		String work = "No Work";
		
		String endPoint = "http://NCS-LOGIN-SERVICE/public/validate";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", token);
		headers.set("userType","admin");

		HttpEntity<String> header = new HttpEntity<String>(headers);
		ResponseEntity<Boolean> result = restTemplate.exchange(endPoint, HttpMethod.GET, header, Boolean.class);
		//boolean result = restTemplate.getForObject(endPoint, header, Boolean.class);
		
		boolean jwtStatus = result.getBody();
		
		if(jwtStatus)
		{
			work = "Admin works on project";
		}
		return work;
	}
}
