package designpatterns.structural.composite.employee;

public class Developer implements Employee {
	protected float salary;
	protected String name;
	
	public Developer(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public float getSalary() {
		return salary;
	}

	@Override
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
