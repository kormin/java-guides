package designpatterns.structural.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	List<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public float getNetSalaries() {
		float netSalary = 0;
		for (Employee employee : employees) {
			netSalary += employee.getSalary();
		}
		return netSalary;
	}
	
}
