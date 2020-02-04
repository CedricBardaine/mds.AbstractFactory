package abstractFactory;

import abstractFactory.color.Blue;
import abstractFactory.color.Color;
import abstractFactory.color.Green;
import abstractFactory.color.Red;
import abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory{
	
	public Color getColor(String type) {
		switch (type) {
		case "red":
			return new Red() ; 
		case "green":
			return new Green() ; 
		case "blue":
			return new Blue() ; 
			
		default:
			return null ; 
		}
	}
	public Item getColor(AllObjects type) {
		switch (type) {
		case RED:
			return new Red() ; 
		case GREEN:
			return new Green() ; 
		case BLUE:
			return new Blue() ; 
			
		default:
			return null ; 
		}
	}

	@Override
	public Shape getShape(String string) {
		return null;
	}


}
