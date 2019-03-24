package designpatterns.creational.abstractfactory.door;

/**
 * @author tom
 *
 * Description: Iron door factory to get iron door and the relevant fitting expert
 */
public class IronDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new IronDoor();
	}

	@Override
	public DoorFittingExpert makeFittingExpert() {
		return new Welder();
	}

}
