package abstractFactory;

import abstractFactory.color.Color;
import abstractFactory.shape.Circle;
import abstractFactory.shape.Rectangle;
import abstractFactory.shape.Shape;
import abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
	
	public Shape getShape(String type) {
		switch (type) {
		case "circle":
			return new Circle() ; 
		case "square":
			return new Square() ; 
		case "rectangle":
			return new Rectangle() ; 
			
		default:
			return null ; 
		}
	}
//	public Item getShape(AllObjects type) {
//		switch (type) {
//		case CIRCLE:
//			return new Circle() ; 
//		case SQUARE:
//			return new Square() ; 
//		case RECTANGLE:
//			return new Rectangle() ; 
//			
//		default:
//			return null ; 
//		}
//	}

	@Override
	public Color getColor(String string) {
		return null;
	}

}
