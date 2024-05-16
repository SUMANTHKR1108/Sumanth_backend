package com.excel.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Designation {
	TRAINER("TRAINER"),MENTOR("MENTOR"), DEVELOPER("DEVELOPER"),TESTOR("TESTOR");
	
	private final String designationType;

	
}
