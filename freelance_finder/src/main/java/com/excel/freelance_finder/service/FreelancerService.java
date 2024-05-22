package com.excel.freelance_finder.service;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.dto.JobPostingDto;

public interface FreelancerService {

	String addClient(ClientDto dto);
	
	String addFreelancer(FreelancerDto dto);
	
	String addJobPosting(JobPostingDto dto);
}
