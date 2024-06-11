package com.excel.freelance_finder.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FreelancerDto {

	private String firstName;
	private String lastName;
	private Long phone;
	private String freelancerEmail;
	private String gender;
	private LocalDate dateOfBirth;
	private String password;
}
