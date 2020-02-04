package abstractFactory;

import abstractFactory.color.Color;
import abstractFactory.shape.Shape;

public class AbstractFactoryPatternDemo {
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("### Ex 1 : ");
		
		// get shape factory    
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		// get an object of Shape Circle   
		Shape shape1 = shapeFactory.getShape("circle");
		
		// call draw method of Shape Circle
		shape1.draw();
		
		// get an object of Shape Rectangle  
		Shape shape2 = shapeFactory.getShape("rectangle");
		
		// call draw method of Shape Rectangle
		shape2.draw();
		
		// get an object of Shape Square    
		Shape shape3 = shapeFactory.getShape("square");
		
		// call draw method of Shape Square
		shape3.draw();
		
		// get color factory   
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		// get an object of Color Red   
		Color color1 = colorFactory.getColor("red");
		
		// call fill method of Red
		color1.fill();
		// get an object of Color Green    
		Color color2 = colorFactory.getColor("green");
		
		// call fill method of Green
		color2.fill();
		
		// get an object of Color Blue  
		Color color3 = colorFactory.getColor("blue");
		
		// call fill method of Color Blue
		color3.fill();
		
		// get an object of Shape Circle   
		Shape myShape = FactoryProducer.getFactory("shape").getShape("circle");
		
		// call draw method of Shape Circle
		myShape.draw();
		
		
		
		System.out.println("### Ex 2 : ");
		
		//get directly an item with factory auto selecting
		Item item = FactoryProducer.getItem(AllObjects.BLUE.toString().toLowerCase() );   
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.GREEN.toString().toLowerCase() );  
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.RED.toString().toLowerCase() );  
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.SQUARE.toString().toLowerCase() );   
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.RECTANGLE.toString().toLowerCase() );  
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.CIRCLE.toString().toLowerCase() );   
		System.out.println("this is a " + item.getName());

	}
}
