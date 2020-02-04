package abstractFactory;

import abstractFactory.color.Color;
import abstractFactory.shape.Shape;

public class AbstractFactory {

	public Shape getShape(String string) {
		System.out.println("getting null");
		return null;
	}

	public Color getColor(String string) {
		System.out.println("getting null");
		return null;
	}

}
