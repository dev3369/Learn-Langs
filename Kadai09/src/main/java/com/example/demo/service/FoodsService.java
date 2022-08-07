package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Foods;
import com.example.demo.repository.FoodsCrudRepo;

@Service
public class FoodsService {
	@Autowired
	FoodsCrudRepo repo;
	
	public Iterable<Foods> findAll(){
		return repo.findAll();
	}
}
