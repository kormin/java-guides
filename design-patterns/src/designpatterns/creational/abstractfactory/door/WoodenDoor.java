package designpatterns.creational.abstractfactory.door;

public class WoodenDoor implements Door {

	@Override
	public void getDescription() {
		System.out.println("I am a wooden door");
	}

}
