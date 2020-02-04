package abstractFactory.shape;

import abstractFactory.Item;

public class Square implements Shape , Item {

	@Override
	public void draw() {
		System.out.println("Ceci est un carr�. Carr�.");

	}

	@Override
	public String getName() {return "square" ;}

}
