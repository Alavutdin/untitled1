package org.example.task;

import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Connector {
    final StandardServiceRegistryBuilder registry;
    SessionFactory sessionFactory;


    public Connector() {
        registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        sessionFactory=new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
