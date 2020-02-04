package abstractFactory;

import abstractFactory.shape.Shape;

public class ShapeFactory extends AbstractFactory {
	public Shape getShape() {return new Shape() ;}
}
