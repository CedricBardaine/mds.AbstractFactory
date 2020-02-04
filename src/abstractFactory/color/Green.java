package abstractFactory.color;

import abstractFactory.Item;

public class Green implements Color , Item{

	@Override
	public void fill() {
		System.out.println("Et voila c'est vert !");

	}

	@Override
	public String getName() {return "green" ;}

}
