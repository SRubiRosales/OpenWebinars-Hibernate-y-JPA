package com.openwebinars.hibernate.primerproyectohbn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 * Primer proyecto con Hibernate y JPA
 * @author SRubiRosales
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimerProyectoHbn");
        EntityManager em = emf.createEntityManager();
        
        User user = new User();
        user.setId(1);
        user.setUserName("Sharon");
        user.setUserMessage("Hello world Sharon");
        
        User user1 = new User();
        user1.setId(2);
        user1.setUserName("Rubí");
        user1.setUserMessage("Hello world Rubí");
        
        em.getTransaction().begin();
        em.persist(user);
        em.persist(user1);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}