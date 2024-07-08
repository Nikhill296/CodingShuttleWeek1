package com.homeWork.Alice_and_Bakery.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.homeWork.Alice_and_Bakery.Interfaces.Frosting;
import com.homeWork.Alice_and_Bakery.Interfaces.Syrup;
@Component
public class CakeBaker {
	
	@Autowired
	Frosting frost;
	
	@Autowired
	Syrup syrup;
	
	public void bakeCake() {
		System.out.println(" ------------ In the function bakeCake ----------- ");
		
//		This code will list down all the options present in backery
		
		String frostType = frost.getFrostingType();
		
		String syrupType = syrup.getSyrupType();
		
		System.out.println("\n Your Yammy cake is ready with frosting of --> "+frostType+" and syrup of -->"+syrupType+ "\n");
	}

}
