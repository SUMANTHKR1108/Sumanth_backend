package com.excel.freelance_finder.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApplicationStatus {

	PENDING("PENDING"),ACCEPT("ACCEPT"),DECLINED("DECLINED");
	private final String applicationStatus;
	
}
