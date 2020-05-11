package com.karthik.springfactory.resource;

import org.springframework.stereotype.Component;

@Component
public class SpringAdditionAlgorithm implements SpringAlgorithm {
	
	@Override
	public String getAlgorithm() {
		return "ADDITION";
	}
	
	@Override
	public int performAlgorithm(int a, int b) {
		return a + b;
	}
	
}
