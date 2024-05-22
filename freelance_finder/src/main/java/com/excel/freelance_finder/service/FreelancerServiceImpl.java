package com.excel.freelance_finder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.dto.JobPostingDto;
import com.excel.freelance_finder.entity.Client;
import com.excel.freelance_finder.entity.Freelancer;
import com.excel.freelance_finder.entity.JobPosting;
import com.excel.freelance_finder.repository.ClientRepository;
import com.excel.freelance_finder.repository.FreelancerRepository;
import com.excel.freelance_finder.repository.JobPostingRepository;
import com.excel.freelance_finder.util.UserUtil;

@Service
public class FreelancerServiceImpl implements FreelancerService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private FreelancerRepository freelancerRepository;

//	@Autowired
//	private JobPostingRepository jobPostingRepository;
//	
	@Override
	public String addClient(ClientDto dto) {
		Optional<Client> clientOptional=clientRepository.findByEmail(dto.getEmail());
		
		
		if (!clientOptional.isPresent()) {
			Client clientss = UserUtil.ClientDtoToEntity(dto);
			return clientRepository.save(clientss).getEmail();
		}
		return null;	
	}

	@Override
	public String addFreelancer(FreelancerDto dto) {
		Optional<Freelancer> Optional=freelancerRepository.findByEmail(dto.getEmail());
		
		if(!Optional.isPresent()) {
			Freelancer freelancerss =UserUtil.FreelancerDtoToEntity(dto);
			return freelancerRepository.save(freelancerss).getEmail();
		}
		return null;
	}	
		@Override
		public String addJobPosting(JobPostingDto dto) {
			Optional<JobPosting> Optional=JobPostingRepository.findByEmail(dto.getEmail());
			
			if(!Optional.isPresent()) {
				JobPosting jobPostings=UserUtil.JobPostingDtoToEntity(dto);
				return JobPostingRepository.save(jobPostings).getEmail();
			}
				return  null;	
}
}