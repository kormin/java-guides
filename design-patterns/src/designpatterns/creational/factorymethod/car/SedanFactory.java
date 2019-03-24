package designpatterns.creational.factorymethod.car;

public class SedanFactory implements CarFactory {

	@Override
	public Car makeCar() {
        return new Sedan();
	}

}
