package ru.Tyulenev.Spring.MVC_Hibernate_AOP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.Tyulenev.Spring.MVC_Hibernate_AOP.DAO.EmployeeDAO;
import ru.Tyulenev.Spring.MVC_Hibernate_AOP.entity.Employee;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
