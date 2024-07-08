package com.homeWork.Alice_and_Bakery.Implementaions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.homeWork.Alice_and_Bakery.Interfaces.Syrup;

@Component
@ConditionalOnProperty(name="SyrupType", havingValue="Chocolate")
public class SyrupChocolate implements Syrup {

	@Override
	public String getSyrupType() {

		System.out.println(" ************** getting Frosting Syrup ******** ");
		return "Chocolate";
	}

}
