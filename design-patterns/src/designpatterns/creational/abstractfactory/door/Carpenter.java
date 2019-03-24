package designpatterns.creational.abstractfactory.door;

public class Carpenter implements DoorFittingExpert {

	@Override
	public void getDescription() {
		System.out.println("I can only fit wooden doors");
	}

}
