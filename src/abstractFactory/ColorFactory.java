package abstractFactory;

import abstractFactory.color.Blue;
import abstractFactory.color.Color;
import abstractFactory.color.Green;
import abstractFactory.color.Red;

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

}
