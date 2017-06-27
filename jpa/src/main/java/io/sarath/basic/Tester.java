package io.sarath.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by SarathKumar on 6/27/2017.
 */
public class Tester {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpas");
        EntityManager entites = emf.createEntityManager();

        Workers work = new Workers();

        work.setEmail("aaa@hawk.iit.edu");
        work.setFirstName("aaa");
        work.setLastNmae("bbbb");

        entites.getTransaction().begin();
        entites.persist(work);
        entites.getTransaction().commit();



        entites.close();
        emf.close();
    }

}
