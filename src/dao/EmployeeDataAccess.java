/*
 * To change employeehis license header, choose License Headers in Project Properties.
 * To change employeehis employeeemplate file, choose Tools | Templates
 * and open employeehe employeeemplate in employeehe editor.
 */
package dao;

import dao.DataAccess;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.Employee;

/**
 *
 * @author nikolaos
 */
public class EmployeeDataAccess implements DataAccess<Employee> {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeDataAccess() {
        employees.add(new Employee("789112", "John", "Farmer", LocalDate.of(1990, Month.MARCH, 20)));
        employees.add(new Employee("673452", "Mary", "Livingston", LocalDate.of(1985, Month.AUGUST, 2)));
        employees.add(new Employee("892323", "Michael", "Wilson", LocalDate.of(1995, Month.SEPTEMBER, 26)));
        employees.add(new Employee("640900", "Sean", "Biggerstaff", LocalDate.of(1987, Month.MAY, 15)));
        employees.add(new Employee("694566", "Luise", "McArthur", LocalDate.of(1989, Month.JULY, 4)));
        employees.add(new Employee("895652", "Anne", "Johnson", LocalDate.of(1997, Month.DECEMBER, 12)));
    }
    
    @Override
    public Optional<Employee> get(long employeeListIndex) {
        return Optional.ofNullable(employees.get((int) employeeListIndex));
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(Employee employee, String[] params) {
        employee.setSsn(Objects.requireNonNull(params[0], "SSN cannot be null"));
        employee.setFname(Objects.requireNonNull(params[1], "First name cannot be null"));
        employee.setLname(Objects.requireNonNull(params[2], "Last name cannot be null"));
        employee.setDob(Objects.requireNonNull(LocalDate.parse(params[3]), "Date of birth cannot be null"));
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }
    
}
