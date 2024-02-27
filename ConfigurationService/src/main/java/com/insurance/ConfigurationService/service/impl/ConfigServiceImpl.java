package com.insurance.ConfigurationService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.ConfigurationService.model.Configuration;
import com.insurance.ConfigurationService.repository.MfeRepository;
import com.insurance.ConfigurationService.service.ConfigService;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private MfeRepository repository; 

	@Override
	public List<Configuration> getMfeDetails() {
		return this.repository.findAll();
	}

}
