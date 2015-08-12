package org.sowmya.spring;

public class Restuarant {
	
	IHotDrink hotDrink;
	Restuarant(IHotDrink hotDrink)
	{
		this.hotDrink =hotDrink;
	}
	public void prepareHotDrink(){
		
 hotDrink.prepareHotDrink();
}
}