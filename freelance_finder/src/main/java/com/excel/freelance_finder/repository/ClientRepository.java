package com.excel.freelance_finder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.freelance_finder.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	Optional<Client>  findByEmail(String email);

	
}
