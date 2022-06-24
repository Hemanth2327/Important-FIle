package com.POJO.co;

public class EmployeeDetails extends Employee{
	public static void main(String[] args) {
		
		EmployeeDetails ed= new EmployeeDetails();
		ed.setAge(22);
		ed.setAddress("Panruti");
		ed.setPhoneNo(805675996023l);
		
		System.out.println(ed.getAge());
		System.out.println(ed.getAddress());
		System.out.println(ed.getPhoneNo());
	}

}
