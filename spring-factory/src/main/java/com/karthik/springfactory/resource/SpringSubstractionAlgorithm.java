package com.karthik.springfactory.resource;

import org.springframework.stereotype.Component;

@Component
public class SpringSubstractionAlgorithm implements SpringAlgorithm {
	
	@Override
	public String getAlgorithm() {
		return "SUBSTRACTION";
	}
	
	@Override
	public int performAlgorithm(int a, int b) {
		return a - b;
	}
	
}
