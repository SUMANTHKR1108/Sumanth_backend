package com.excel.freelance_finder.dto;

import java.time.LocalDate;

import com.excel.freelance_finder.enums.ApplicationStatus;

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
public class JobApplicationDto {
	private ApplicationStatus status;
	private LocalDate appliedAt;
}
