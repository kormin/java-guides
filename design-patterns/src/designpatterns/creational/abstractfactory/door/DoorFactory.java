package designpatterns.creational.abstractfactory.door;

public interface DoorFactory {
	Door makeDoor();
	DoorFittingExpert makeFittingExpert();
}
