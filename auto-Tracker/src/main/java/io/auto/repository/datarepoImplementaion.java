package io.auto.repository;

import io.auto.entity.automotive;
import io.auto.entity.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public class datarepoImplementaion implements dataRepo{

    @PersistenceContext
    private EntityManager entityManager;

    public List<data> findAll() {
        TypedQuery<data> query = entityManager.createNamedQuery("data.findAll",data.class);

        return query.getResultList();
    }

    public data findOne(String readingId) {
        return entityManager.find(data.class, readingId);
    }

    public List<data> findReadingsFromVehicle(String vin) {
        TypedQuery<data> query = entityManager.createNamedQuery("data.findByVin", data.class);
        query.setParameter("pVin", vin);
        return query.getResultList();
    }

    public data create(data readings) {
        entityManager.persist(readings.getTiresid());
        entityManager.persist(readings);
        return readings;
    }

    public data update(data readings) {
        return null;
    }

    public void delete(data readings) {
        entityManager.remove(readings);
    }
}
