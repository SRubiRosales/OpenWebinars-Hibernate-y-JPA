package com.openwebinars.hibernate.primerproyectohbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 * Primer proyecto con Hibernate
 * @author SRubiRosales
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Codigo legacy
        //SessionFactory sf = new Configuration().configure().buildSessionFactory();

        //Inicalizacion del session factory
        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
        //Apertura de la sesion
        Session session = sf.openSession();
        //Construccion de objetos
        User user = new User();
        user.setId(1);
        user.setUserName("Sharon");
        user.setUserMessage("Hello world Sharon");
        
        User user1 = new User();
        user1.setId(2);
        user1.setUserName("Rubí");
        user1.setUserMessage("Hello world Rubí");
        
        //Comenzar nueva transaccion
        session.getTransaction().begin();
        
        //Persistimos los objetos
        session.persist(user);
        session.persist(user1);
        
        //Commit de la transaccion
        session.getTransaction().commit();
        
        //Cierre de la sesion
        session.close();
        sf.close();
    }
}
