package designpatterns.structural.facade.computer;

/**
 * @author tom
 *
 *         Description: A facade is an object that provides a simplified
 *         interface to a larger body of code, such as a class library.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-facade
 */
public class Main {

	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade(new Computer());
		computer.turnOn();
		computer.turnOff();
	}

}
