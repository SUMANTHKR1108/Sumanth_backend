package com.excel.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EducationType {

	GRADUATE("GRADUATE"),POSTGRADUATE("POSTGRADUATE");
	private final String educationType;
}
