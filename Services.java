package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;

public class Services {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Employee Id");
  String empId = sc.next();
  System.out.println("Enter Employee Name");
  String empName = sc.next();
  System.out.println("Enter Employee Salary");
  double salary = sc.nextDouble();
  System.out.println("Enter Employee Designation");
  String designation = sc.next();
  System.out.println("------------------------------------");
  EmployeeServiceImpl obj2 = new EmployeeServiceImpl();
  obj2.setValues(empId,empName,salary,designation);
  obj2.display();
  obj2.findInsuranceScheme(salary);
 }
}
