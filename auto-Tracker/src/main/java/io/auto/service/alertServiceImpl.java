package io.auto.service;

import io.auto.entity.alerts;
import io.auto.repository.alertRepo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public class alertServiceImpl implements alertService{

    private alertRepo alertRepository;

    @Transactional(readOnly = true)
    public List<alerts> findAll() {
        return alertRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<alerts> findAlertsFromVehicle(String vin) { return alertRepository.findAlertsFromVehicle(vin); }
}
