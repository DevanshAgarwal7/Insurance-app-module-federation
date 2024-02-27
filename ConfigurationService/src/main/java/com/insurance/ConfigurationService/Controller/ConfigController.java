package com.insurance.ConfigurationService.Controller;

import com.insurance.ConfigurationService.service.ConfigService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "http://localhost:4200")
@RestController
public class ConfigController {

	@Autowired
	private ConfigService configService;

	@GetMapping(value = "/getConfig")
	public ResponseEntity<?> getConfigurations() {
		return new ResponseEntity<>(this.configService.getMfeDetails(), HttpStatus.OK);
	}
}
