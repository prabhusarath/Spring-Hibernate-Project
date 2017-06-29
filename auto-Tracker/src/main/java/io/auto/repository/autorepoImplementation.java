package io.auto.repository;

import io.auto.entity.automotive;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */

public class autorepoImplementation implements automotiverepo{

    @PersistenceContext
    private EntityManager entityManager;

    public List<automotive> findAll() {
        TypedQuery<automotive> query = entityManager.createNamedQuery("automotive.findAll",automotive.class);

        return query.getResultList();
    }

    public automotive findOne(String vin) {
        return entityManager.find(automotive.class, vin);
    }

    public automotive create(automotive vehicles) {
        entityManager.persist(vehicles);
        return vehicles;
    }

    public automotive update(automotive vehicles) {
        return entityManager.merge(vehicles);
    }

    public void delete(automotive vehicles) {
        entityManager.remove(vehicles);
    }
}
