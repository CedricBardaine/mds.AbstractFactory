package abstractFactory.color;

import abstractFactory.Item;

public class Red implements Color , Item{

	@Override
	public void fill() {
		System.out.println("Et voila c'est rouge !");

	}

	@Override
	public String getName() {return "red" ;	}

}
