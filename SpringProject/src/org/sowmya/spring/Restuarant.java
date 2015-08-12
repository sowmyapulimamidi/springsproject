package org.sowmya.spring;
//changed the thingsss...reddy
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