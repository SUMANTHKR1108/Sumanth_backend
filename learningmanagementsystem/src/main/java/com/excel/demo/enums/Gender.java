package com.excel.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Gender {
	MALE("MALE"),FEMALE("FEMALE"),OTHER("OTHER");
	
	private final String genderType;

}
