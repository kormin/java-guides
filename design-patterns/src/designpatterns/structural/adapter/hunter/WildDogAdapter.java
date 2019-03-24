package designpatterns.structural.adapter.hunter;

/**
 * @author tom
 *
 *         Description: Adapter around wild dog to make it compatible with our
 *         game
 */
public class WildDogAdapter implements Lion {
	protected WildDog dog;

	public WildDogAdapter(WildDog dog) {
		this.dog = dog;
	}

	@Override
	public void roar() {
		dog.bark();
	}

}
