package abstractFactory;

import abstractFactory.color.Blue;
import abstractFactory.color.Green;
import abstractFactory.color.Red;
import abstractFactory.shape.Circle;
import abstractFactory.shape.Rectangle;
import abstractFactory.shape.Square;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {
		switch (type) {
		case "shape":
			return new ShapeFactory();
		case "color":
			return new ColorFactory();
		default:
			return null;
		}
	}	
	
	public static Item getItem(AllObjects type) {
		Item ret = null ; 
		
		switch (type) {
		case CIRCLE:
			ret = new Circle();
			break ;
		case SQUARE:
			ret = new Square();
			break ;
		case RECTANGLE:
			ret = new Rectangle();
			break ;
		case RED:
			ret = new Red();
			break ;
		case GREEN:
			ret = new Green();
			break ;
		case BLUE:
			ret = new Blue();
			break ;
		
		default:
			return ret;
		}
		return ret;
		
		
	}

}
