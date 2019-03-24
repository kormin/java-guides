package designpatterns.structural.composite.employee;

public class Designer implements Employee {
	protected float salary;
	protected String name;
	
	public Designer(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public float getSalary() {
		return salary;
	}

}
