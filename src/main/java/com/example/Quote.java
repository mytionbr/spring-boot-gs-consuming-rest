package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	private String type;
	private Value value;
	
	public Quote() {
		
	}
}
