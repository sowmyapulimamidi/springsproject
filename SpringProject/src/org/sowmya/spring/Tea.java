package org.sowmya.spring;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Dear Customer...Your Tea is getting ready!!!!!");

	}

}
