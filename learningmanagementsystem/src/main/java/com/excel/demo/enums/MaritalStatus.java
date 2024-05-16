package com.excel.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MaritalStatus {
 
	MARRIED("MARRIED"),UNMARRIED("UNMARRIED");
		private final String maritalStatusType;
	
	
}
