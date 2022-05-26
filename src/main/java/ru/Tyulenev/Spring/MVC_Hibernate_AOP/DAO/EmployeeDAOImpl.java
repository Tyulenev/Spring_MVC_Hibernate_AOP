package ru.Tyulenev.Spring.MVC_Hibernate_AOP.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.Tyulenev.Spring.MVC_Hibernate_AOP.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
//    @Transactional //Spring открывает и закрывает транзакции
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();

        //        List<Employee> allEmployees = session.createQuery("from Employee"
//                , Employee.class)
//                .getResultList();

        Query query =  session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee emp) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(emp);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee emp = session.get(Employee.class, id);

        return emp;
    }
}
