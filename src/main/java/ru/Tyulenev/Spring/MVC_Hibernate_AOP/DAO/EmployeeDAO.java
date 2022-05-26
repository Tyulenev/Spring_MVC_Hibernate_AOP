package ru.Tyulenev.Spring.MVC_Hibernate_AOP.DAO;

import ru.Tyulenev.Spring.MVC_Hibernate_AOP.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    Employee getEmployee(int id);
}
