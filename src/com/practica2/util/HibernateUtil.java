package com.practica2.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object (modified).
 *
 * @author Omar
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            if (sessionFactory == null)
            {
                Configuration configuration = new Configuration().configure();
                StandardServiceRegistryBuilder serviceRegistryBuilder
                        = new StandardServiceRegistryBuilder();
                serviceRegistryBuilder.applySettings(configuration.getProperties());
                ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                //NOTE: If the XML configuration file isn't at root.
                /*Configuration configuration = 
                    new Configuration().configure(HibernateUtil.class
                            .getResource("/hibernate.cfg.xml"));*/
            }
            return sessionFactory;
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void shutdown()
    {
        getSessionFactory().close();
    }
}
