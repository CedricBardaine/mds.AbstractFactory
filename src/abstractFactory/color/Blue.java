package abstractFactory.color;

import abstractFactory.Item;

public class Blue implements Color , Item{

	@Override
	public void fill() {
	System.out.println("Et voila c'est bleu !");
	}

	@Override
	public String getName() { return "blue" ; }

}
