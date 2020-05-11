package com.karthik.springfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.springfactory.service.SpringAlgoFactory;

@RestController
public class SpringAlgoController {
	
	@Autowired
	private SpringAlgoFactory springAlgoFactory;
	
	@RequestMapping("/algoexpert")
	public void calculate() {
		System.out.println(springAlgoFactory.getAlgorithm("ADDITION").performAlgorithm(7, 5));
		System.out.println(springAlgoFactory.getAlgorithm("SUBSTRACTION").performAlgorithm(7, 5));
	}
}
