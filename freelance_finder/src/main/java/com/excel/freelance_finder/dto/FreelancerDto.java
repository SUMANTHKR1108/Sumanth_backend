package com.excel.freelance_finder.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreelancerDto {
	private Integer freelancerId;
	private String firstName;
	private String lastName;
	private long phoneNo;
	private String email;
	private String gender;
	private LocalDate dateOfBirth;
	private String password;
	private String reEnterdPassword;
}
