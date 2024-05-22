package com.excel.freelance_finder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.dto.JobApplicationDto;
import com.excel.freelance_finder.dto.JobPostingDto;
import com.excel.freelance_finder.service.FreelancerService;



@RestController
@RequestMapping(path ="/api", method = {RequestMethod.POST, RequestMethod.PUT})
public class FreelancerController {
	@Autowired
	private FreelancerService freelancerService;
	
	@PostMapping(path ="/freelancer/add")
	public ResponseEntity<String>addFreelancer(@RequestBody FreelancerDto freelancerDto){
	 String freelancerId=freelancerService.addFreelancer(freelancerDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(freelancerId);
	}
	
	@PostMapping(path ="/client/add")
	public ResponseEntity<String>addClient(@RequestBody ClientDto clientDto) {
		String  clientId=freelancerService.addClient(clientDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(clientId);
	}
	
//	@PostMapping(path="/application/add")
//	public ResponseEntity<String>addJobApplication(@RequestBody JobApplicationDto jobApplicationDto) {
//		String freelancerId=freelancerService.addJobApplication(jobApplicationDto);
//		return ResponseEntity.status(HttpStatus.CREATED).body(freelancerId);
//	}
//	
//	@PostMapping(path="/posting/add")
//	public ResponseEntity<String>addJobPosting(@RequestBody JobPostingDto jobPostingDto) {
//		String freelancerId=freelancerService.addJobPosting(jobPostingDto);
//		return ResponseEntity.status(HttpStatus.CREATED).body(freelancerId);
//	}
//	
//	@PostMapping(path="/message/add")
//	public ResponseEntity<String>addMessage(@RequestBody MessageDto messageDto) {
//		String freelancerId=freelancerService.addMessage(messageDto);
//		return ResponseEntity.status(HttpStatus.CREATED).body(freelancerId);
//	}
	
	
}
