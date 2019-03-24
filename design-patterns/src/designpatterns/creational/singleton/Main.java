package designpatterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		President president1 = President.getInstance();
		President president2 = President.getInstance();
		
		if (president1 == president2) {
			System.out.println("Same President");
		}
	}

}
