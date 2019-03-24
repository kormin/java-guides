package designpatterns.structural.decorator.coffee;

/**
 * @author tom
 *
 *         Description: Lets take coffee for example. First of all we have a
 *         simple coffee implementing the coffee interface
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-decorator
 */
public class Main {

	public static void main(String[] args) {
		Coffee someCoffee = new SimpleCoffee();
		System.out.println(someCoffee.getCost());
		System.out.println(someCoffee.getDescription());
		
		someCoffee = new MilkCoffee(someCoffee);
		System.out.println(someCoffee.getCost());
		System.out.println(someCoffee.getDescription());
		
		someCoffee = new WhipCoffee(someCoffee);
		System.out.println(someCoffee.getCost());
		System.out.println(someCoffee.getDescription());
		
		someCoffee = new VanillaCoffee(someCoffee);
		System.out.println(someCoffee.getCost());
		System.out.println(someCoffee.getDescription());
	}

}
