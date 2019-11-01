package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Employee;
import lk.ijse.hibernate.entity.Order;
import lk.ijse.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;

public class OneToMany {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession()) {
            session.beginTransaction();

//
//            Customer alisa = new Customer("C001", "Alisa", "Pinwatta");
//            Order od001 = new Order("OD001", Date.valueOf("2019-10-01"), alisa);
//            Order od002 = new Order("OD002", Date.valueOf("2019-10-02"), alisa);
//
//            Customer leel = new Customer("C002", "Leel", "Aluthgama");
//            Order od003 = new Order("OD003", Date.valueOf("2019-10-02"), leel);
//
//            Customer kasba = new Customer("C003", "kesba", "Aluthgama");
//
//            session.save(alisa);
//            session.save(od001);
//            session.save(od002);
//
//            session.save(leel);
//            session.save(od003);
//
//            session.save(kasba);

//            Customer alisa = session.get(Customer.class, "C001");
//            alisa.getOrders().forEach(System.out::println);
//            Order od004 = new Order("OD004", Date.valueOf("2019-10-03"), alisa);
//            session.save(od004);
//            System.out.println("=========================");
//            alisa.getOrders().forEach(System.out::println);

            Order od001 = session.get(Order.class, "OD001");
            Order od002 = session.get(Order.class, "OD002");

            Customer alisa = session.get(Customer.class, "C001");
            Customer leel = session.get(Customer.class, "C002");

//            od002.setCustomer(leel);


            session.getTransaction().commit();
        }

    }
}
