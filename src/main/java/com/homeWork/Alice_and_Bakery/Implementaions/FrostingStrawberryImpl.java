package com.homeWork.Alice_and_Bakery.Implementaions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.homeWork.Alice_and_Bakery.Interfaces.Frosting;

@Component
@ConditionalOnProperty(name="frostingType", havingValue="Strawberry")
public class FrostingStrawberryImpl implements Frosting {

	@Override
	public String getFrostingType() {

		System.out.println(" ************** getting Frosting Type ******** ");

		return "Strawberry";

	}

}
