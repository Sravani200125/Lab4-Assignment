package com.cg.eis.service;

import com.cg.eis.bean.*;
import java.util.Scanner;

interface EmployeeService{
 void findInsuranceScheme();
 void setValues();
 void display();
}

public class EmployeeServiceImpl {
	
 Employee obj = new Employee();
	
 public void setValues(String empId,String empName ,double salary,String designation) {
  obj.setEmpId(empId);
  obj.setEmpName(empName); 
  obj.setSalary(salary); 
  obj.setDesignation(designation); 
 }
	
 public void display() {
  System.out.println("Employee ID : "+obj.getEmpId());
  System.out.println("Name : "+obj.getEmpName());
  System.out.println("Salary : "+obj.getSalary());
  System.out.println("Designation : "+obj.getDesignation());
 }
 public void findInsuranceScheme(double salary) {
  salary = obj.getSalary();
  if (salary>=10000 && salary<30000 ) {
   System.out.println("Scheme 1");
  }
  else if (salary>=30000 && salary<40000 ) {
   System.out.println("Scheme 2");
  }
  else if (salary>=40000 && salary<60000 ) {
   System.out.println("Scheme 3");
  }
  else if (salary>=60000) {
   System.out.println("Scheme 4");
  }
 }
}