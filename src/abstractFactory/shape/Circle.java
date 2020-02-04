package abstractFactory.shape;

import abstractFactory.Item;

public class Circle implements Shape , Item {

	@Override
	public void draw() {
		System.out.println("Ceci est un rond.");
	}

	@Override
	public String getName() {return "circle" ;	}

}
