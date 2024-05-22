package com.excel.freelance_finder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.excel.freelance_finder.entity.Freelancer;

public interface FreelancerRepository extends JpaRepository<Freelancer, Integer>{
	Optional<Freelancer> findByEmail(String email);

}
