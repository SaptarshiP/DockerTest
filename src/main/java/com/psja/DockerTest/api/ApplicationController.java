package com.psja.DockerTest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApplicationController {

	@RequestMapping(value = "/getData")
	public ResponseEntity<String> getData(){
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body( "HII PSJA" );
	}
	
}
