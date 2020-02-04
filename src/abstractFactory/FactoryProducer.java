package abstractFactory;

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

}
