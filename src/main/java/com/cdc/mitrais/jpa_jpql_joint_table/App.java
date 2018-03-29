package com.cdc.mitrais.jpa_jpql_joint_table;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdc.mitrais.jpa_jpql_joint_table.entity.NonTeachingStaff;
import com.cdc.mitrais.jpa_jpql_joint_table.entity.TeachingStaff;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entitymanager = emFactory.createEntityManager();
        
        entitymanager.getTransaction().begin();
        
        TeachingStaff ts1 = new TeachingStaff(1,"Gopal", "Msc MEd", "Math");
        TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "Bsc BEd", "English");
        
        NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
        NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krisna", "Office Admin");
        
        entitymanager.persist(ts1);
        entitymanager.persist(ts2);
        entitymanager.persist(nts1);
        entitymanager.persist(nts2);
        
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emFactory.close();
    }
}
