package designpatterns.creational.abstractfactory.door;

public class Welder implements DoorFittingExpert {

	@Override
	public void getDescription() {
		System.out.println("I can only fit iron doors");
	}

}
