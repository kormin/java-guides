package designpatterns.structural.decorator.coffee;

public class SimpleCoffee implements Coffee {

	@Override
	public float getCost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

}
