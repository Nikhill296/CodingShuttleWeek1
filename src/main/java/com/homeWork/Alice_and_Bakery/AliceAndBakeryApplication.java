package com.homeWork.Alice_and_Bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.homeWork.Alice_and_Bakery.classes.CakeBaker;

@SpringBootApplication
public class AliceAndBakeryApplication implements CommandLineRunner  {
	

	@Autowired
	CakeBaker cakeBaker;
	
	public static void main(String[] args){
	
		SpringApplication.run(AliceAndBakeryApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}

}
