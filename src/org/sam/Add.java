package org.sam;


public class Add {
	
	private void employeeId(boolean status, int id) {
		System.out.println("employee id is 12345" + status);
	}

	private void employeeId(int no, boolean cond) {
		System.out.println("employee id is 12345" + no +cond);
	}
	private void employeeId(String name) {
		System.out.println("employee id is -12345" + name);
	}
	private void employeeId(float salary) {
		System.out.println("employee id is 12345" + salary);
		sysout("employeee");
	}
	public static void main(String[] args) {
		
		Add a = new Add();
		a.employeeId(false, 123);
		a.employeeId(123);
		a.employeeId("java");
		a.employeeId(12345.234f);
	}
	
	
	
	
	
}
