package ru.Tyulenev.Spring.MVC_Hibernate_AOP.Service;

import ru.Tyulenev.Spring.MVC_Hibernate_AOP.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee emp);

    public Employee getEmployee(int id);
}
