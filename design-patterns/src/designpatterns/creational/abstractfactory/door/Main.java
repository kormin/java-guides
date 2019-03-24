package designpatterns.creational.abstractfactory.door;

/**
 * @author tom
 *
 *         Description: Extending our door example from Simple Factory. Based on
 *         your needs you might get a wooden door from a wooden door shop, iron
 *         door from an iron shop or a PVC door from the relevant shop. Plus you
 *         might need a guy with different kind of specialities to fit the door,
 *         for example a carpenter for wooden door, welder for iron door etc. As
 *         you can see there is a dependency between the doors now, wooden door
 *         needs carpenter, iron door needs a welder etc.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-abstract-factory
 */
public class Main {

	public static void main(String[] args) {
		DoorFactory woodenFactory = new WoodenDoorFactory();
		Door door = woodenFactory.makeDoor();
		DoorFittingExpert expert = woodenFactory.makeFittingExpert();
		
		door.getDescription();
		expert.getDescription();

		// Same for Iron Factory
		DoorFactory ironFactory = new IronDoorFactory();
		door = ironFactory.makeDoor();
		expert = ironFactory.makeFittingExpert();
		
		door.getDescription();
		expert.getDescription();
	}

}
