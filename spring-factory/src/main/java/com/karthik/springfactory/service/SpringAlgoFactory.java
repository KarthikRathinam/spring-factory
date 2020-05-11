package com.karthik.springfactory.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.springfactory.resource.SpringAlgorithm;

@Service
public class SpringAlgoFactory {
	
	@Autowired
	List<SpringAlgorithm> algos;
	
	Map<String, SpringAlgorithm> algoMap = new HashMap<>();
	
	@PostConstruct
	public void initAlgorithmService() {
		for(SpringAlgorithm s : algos) {
			algoMap.put(s.getAlgorithm(), s);
		}
	}
	
	public SpringAlgorithm getAlgorithm(String algoType) {
		return algoMap.get(algoType);
	}
}
