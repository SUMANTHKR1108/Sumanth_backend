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
public class JobPostingDto {

	private Integer postingId;
	private String titale;
	private String description;
	private String skillsRequerd;
	private String budget;
	private LocalDate createdAt;
}
