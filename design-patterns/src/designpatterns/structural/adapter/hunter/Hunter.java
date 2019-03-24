package designpatterns.structural.adapter.hunter;

public class Hunter {
	public void hunt(Lion lion) {
		System.out.println("Let the hunt begin!");
		lion.roar();
	}
}
