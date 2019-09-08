package spring.org.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring.org.hibernate.entity.User;

public class App {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                                    .configure()
                                    .addAnnotatedClass(User.class)
                                    .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            //Create object of entity class type
            User user = new User("Myuser", "MyPassword", "Mike", "Johnson");
            //Start Transaction
            session.beginTransaction();
            //Perform Operation
            session.save(user);
            //Commit the transaction
            session.getTransaction().commit();
            System.out.println("Row added...");

        } finally {
            session.close();
            factory.close();
        }
    }
}
