package designpatterns.creational.abstractfactory.door;

/**
 * @author tom
 *
 * Description: Wooden factory to return carpenter and wooden door
 */
public class WoodenDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new WoodenDoor();
	}

	@Override
	public DoorFittingExpert makeFittingExpert() {
		return new Carpenter();
	}

}
