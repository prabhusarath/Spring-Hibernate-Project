package io.auto.repository;

import io.auto.entity.alerts;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public class alertRepoImplementation implements alertRepo{

    @PersistenceContext
    private EntityManager em;

    public List<alerts> findAll() {
        TypedQuery<alerts> query = em.createNamedQuery("alerts.findAll", alerts.class);
        return query.getResultList();
    }

    public List<alerts> findAlertsFromVehicle(String vin) {
        TypedQuery<alerts> query = em.createNamedQuery("alerts.findByVin", alerts.class);
        query.setParameter("pVin", vin);
        return query.getResultList();
    }

    public alerts create(alerts alert) {
        em.persist(alert);
        return alert;
    }
}
