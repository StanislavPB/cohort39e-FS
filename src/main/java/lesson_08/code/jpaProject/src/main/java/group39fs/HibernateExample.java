package group39fs;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {

        // настройка конфигурации Hibernate

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // создадим сотрудника

        Employee employee = new Employee("John","IT");

        // сохранить сотрудника в базу данных

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
        session.close();

        // читаем сотрудника из базы данных

        session = sessionFactory.openSession();
        Employee readEmployeeFromDatabase = session.get(Employee.class, 1);

        System.out.println("Прочитанные данные из базы: " + readEmployeeFromDatabase);
        session.close();




    }
}
