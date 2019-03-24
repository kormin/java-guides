package designpatterns.structural.composite.employee;

/**
 * @author tom
 *
 *         Description: Every organization is composed of employees. Each of the
 *         employees has the same features i.e. has a salary, has some
 *         responsibilities, may or may not report to someone, may or may not
 *         have some subordinates etc.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-composite
 */
public class Main {

	public static void main(String[] args) {
		Employee john = new Developer("John Doe", 1200);
		Employee jane = new Designer("Jane Doe", 1500);

		Organization organization = new Organization();
		organization.addEmployee(john);
		organization.addEmployee(jane);

		System.out.println("Net salaries: " + organization.getNetSalaries());
	}

}
