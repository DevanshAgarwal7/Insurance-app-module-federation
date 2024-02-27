package com.insurance.ConfigurationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.insurance.ConfigurationService.model.Configuration;

@Repository
@EnableJpaRepositories
public interface MfeRepository extends JpaRepository<Configuration, String> {

}
