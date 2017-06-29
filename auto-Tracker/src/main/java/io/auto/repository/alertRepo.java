package io.auto.repository;

import io.auto.entity.alerts;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public interface alertRepo {

    List<alerts> findAll();

    List<alerts> findAlertsFromVehicle(String vin);

    alerts create(alerts alert);
}
