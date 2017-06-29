package io.auto.service;

import io.auto.entity.alerts;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public interface alertService {

    List<alerts> findAll();

    List<alerts> findAlertsFromVehicle(String vin);
}
