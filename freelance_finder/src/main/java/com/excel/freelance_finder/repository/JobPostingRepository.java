package com.excel.freelance_finder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.freelance_finder.entity.JobPosting;

public interface JobPostingRepository extends JpaRepository<JobPosting , Integer>{
	Optional<JobPosting> findByEmail(String Email);
	
   
	
}
