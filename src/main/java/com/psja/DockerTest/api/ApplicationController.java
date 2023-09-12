package com.psja.DockerTest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ApplicationController {

	private static Logger logger = LoggerFactory.getLogger(ApplicationController.class);
	
	@RequestMapping(value = "/getData")
	public ResponseEntity<String> getData(){
		logger.info( "Hi i am inside method9" );
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body( "HII PSJA TEST" );
	}
	
}
