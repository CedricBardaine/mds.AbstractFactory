package abstractFactory;

import abstractFactory.color.Color;
import abstractFactory.shape.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String string) ;

	public abstract Color getColor(String string) ;

}
