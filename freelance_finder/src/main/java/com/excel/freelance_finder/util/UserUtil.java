package com.excel.freelance_finder.util;

import java.util.List;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.dto.JobPostingDto;
import com.excel.freelance_finder.entity.Client;
import com.excel.freelance_finder.entity.Freelancer;
import com.excel.freelance_finder.entity.JobPosting;

public class UserUtil {
  
//	public static Client clientDtoToEntity(ClientDto dto) {
//		return Client.builder().
//				firstName(dto.getFirstName()).
//				lastName(dto.getLastName()).
//				phoneNo(dto.getPhoneNo()).
//				email(dto.getEmail()).
//				gender(dto.getGender()).
//				dateOfBirth(dto.getDateOfBirth()).
//				password(dto.getPassword()).
//				reEnterdPassword(dto.getReEnterdPassword()).
//				build();	
//				}
	
	public static Freelancer FreelancerDtoToEntity(FreelancerDto dto) {
		
		return Freelancer.builder().
				freelancerId(dto.getFreelancerId()).
				firstName(dto.getFirstName()).
				lastName(dto.getLastName()).
				phoneNo(dto.getPhoneNo()).
				email(dto.getEmail()).
				gender(dto.getGender()).
				dateOfBirth(dto.getDateOfBirth()).
				password(dto.getPassword()).
				reEnterdPassword(dto.getReEnterdPassword()).
				build();
	}

	public static Client ClientDtoToEntity(ClientDto dto) {
		
		return Client.builder().
				firstName(dto.getFirstName()).
				lastName(dto.getLastName()).
				phoneNo(dto.getPhoneNo()).
				email(dto.getEmail()).
				gender(dto.getGender()).
				dateOfBirth(dto.getDateOfBirth()).
				password(dto.getPassword()).
				reEnterdPassword(dto.getReEnterdPassword()).
				build();
	}

	public static JobPosting JobPostingDtoToEntity(JobPostingDto dto) {
		
		return JobPosting.builder().
				titale(dto.getTitale()).
				description(dto.getDescription()).
				skillsRequerd(dto.getSkillsRequerd()).
				budget(dto.getBudget()).
				createdAt(dto.getCreatedAt()).
				build();
	}
}
