package com.app;

public class Employee {
private String empName;

public Employee() {
	super();
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

@Override
public String toString() {
	return "Employee [empName=" + empName + "]";
}

}
