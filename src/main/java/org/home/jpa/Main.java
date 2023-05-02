package org.home.jpa;

import org.home.jpa.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
        private static long emp_id = 0;
        public static void main(String[] args)  {
           new Main().run();

        }

    private void run() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAPersistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(createEmployee("Dorcia", "Wasiljew", 3400d));
        entityManager.persist(createEmployee("Tolek", "Banan", 2400d));
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }


    private static Employee createEmployee(String name, String lastName, double salary) {
            Employee employee = new Employee();
            //employee.setId(++emp_id);
            employee.setName(name);
            employee.setLastName(lastName);
            employee.setSalary(salary);
            employee.setProvision(BigDecimal.valueOf(salary * 0.20d));
            return employee;
        }
    }


