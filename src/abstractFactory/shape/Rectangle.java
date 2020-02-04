package abstractFactory.shape;

import abstractFactory.Item;

public class Rectangle implements Shape , Item{

	@Override
	public void draw() {
		System.out.println("Ceci est un rectangle.");

	}

	@Override
	public String getName() {return "rectangle" ;}

}
