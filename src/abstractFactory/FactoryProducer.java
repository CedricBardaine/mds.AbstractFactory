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

//	public static Item getItem(AllObjects type) {
//	Item ret = null ; 
//	
//	switch (type) {
//	case CIRCLE:
//	case SQUARE:
//	case RECTANGLE:
//		ret = new ShapeFactory().getShape(type) ;
//		break ;
//	case RED:
//	case GREEN:
//	case BLUE:
//		ret = new ColorFactory().getColor(type);
//		break ;
//	
//	default:
//		return ret;
//	}
//	return ret;
// }

	public static Item getItem(String type) {
		Item ret = null;

		switch ( type ) {
		case "circle":
		case "square":
		case "rectangle":
			ret = (Item) new ShapeFactory().getShape(type);
			break;
		case "red":
		case "green":
		case "blue":
			ret = (Item) new ColorFactory().getColor(type);
			break;

		default:
			return ret;
		}
		return ret;

	}

}
