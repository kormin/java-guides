package designpatterns.creational.factorymethod.car;

/**
 * @author tom
 *
 *         Description: Another example in PHP follows, this time using
 *         interface implementations as opposed to subclassing (however the same
 *         can be achieved through subclassing). It is important to note that
 *         the factory method can also be defined as public and called directly
 *         by the client code (in contrast with the Java example above).
 * 
 *         Link: https://en.wikipedia.org/wiki/Factory_method_pattern#PHP
 */
public class Main {

	public static void main(String[] args) {
		CarFactory factory = new SedanFactory();
		Car car = factory.makeCar();
		System.out.println(car.getType());
	}

}
