/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalDate;
import java.time.Month;
import model.Employee;
import dao.EmployeeDataAccess;

/**
 *
 * @author nikolaos
 */
public class JavaDAOView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeDataAccess employeeDao = new EmployeeDataAccess();

        System.out.println("Before any operation, employees are:");
        employeeDao.getAll().forEach(employee -> System.out.println(employee.toString())); // new lambdas notation
        System.out.println("------------------------------------------------");

        Employee emp1 = employeeDao.get(0).orElseGet(() -> new Employee("non-existing ssn", "non-existing employee first name", "non-existing employee first name", null)); // new lambdas notation
        System.out.println("Updating " + emp1.toString());
        employeeDao.update(emp1, new String[]{"689900", "Lyndon", "Johnson", LocalDate.of(1989, Month.JULY, 4).toString()});

        Employee emp2 = employeeDao.get(1).orElseGet(() -> new Employee("non-existing ssn", "non-existing employee first name", "non-existing employee first name", null)); // new lambdas notation
        System.out.println("Deleting " + emp2.toString());
        employeeDao.delete(emp2);
        Employee emp = new Employee("629567", "Julie", "Robinson", LocalDate.of(1985, Month.JANUARY, 10));
        System.out.println("Creating and saving new employee " + emp.toString());
        employeeDao.save(emp);

        System.out.println("After previous operations, employees are:");
        employeeDao.getAll().forEach(employee -> System.out.println(employee.toString())); // new lambdas notation
    
    }
    
}
