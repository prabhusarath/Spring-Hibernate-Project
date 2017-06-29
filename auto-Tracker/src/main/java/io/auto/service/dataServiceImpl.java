package io.auto.service;

import io.auto.entity.alerts;
import io.auto.entity.automotive;
import io.auto.entity.data;
import io.auto.exception.ResourceNotFoundException;
import io.auto.repository.automotiverepo;
import io.auto.repository.dataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public class dataServiceImpl implements dataService{

    @Autowired
    private dataRepo repository;
    @Autowired
    private automotiverepo vehicleRepository;

    @Transactional(readOnly = true)
    public List<data> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public List<data> findReadingsFromVehicle(String vin) {
        return repository.findReadingsFromVehicle(vin);
    }

    @Transactional
    public data create(data reading) {
        return repository.create(reading);
    }

    public data update(String id, data v) {
        data vehicleInstance = repository.findOne(id);
        if(vehicleInstance == null)
            throw new ResourceNotFoundException("No matching vehicle found for vin " + id);
        return repository.update(v);
    }

    @Transactional
    public void delete(String readingId) {
        data existing = repository.findOne(readingId);
        if (existing == null) {
            throw new ResourceNotFoundException("Reading with readingId=" + readingId + " not found");
        }
        repository.delete(existing);
    }

    private List<alerts> getAlerts(data reading, automotive currentVehicle) {
        List<alerts> result = new ArrayList<alerts>();

        if(reading.getEngineRpm()>currentVehicle.getRedlineRpm()) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("HIGH");
            newAlert.setAlertType("Engine RPM");
            result.add(newAlert);
        }

        if(reading.getFuelVolume()< (0.1*currentVehicle.getMaxFuelVol())) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("MEDIUM");
            newAlert.setAlertType("Fuel volume");
            result.add(newAlert);
        }

        if(reading.getTiresid().getFrontLeft()<32 || reading.getTiresid().getFrontLeft()>36) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("LOW");
            newAlert.setAlertType("Front left tire pressure");
            result.add(newAlert);
        }

        if(reading.getTiresid().getFrontRight()<32 || reading.getTiresid().getFrontRight()>36) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("LOW");
            newAlert.setAlertType("Front right tire pressure");
            result.add(newAlert);
        }

        if(reading.getTiresid().getRearLeft()<32 || reading.getTiresid().getRearLeft()>36) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("LOW");
            newAlert.setAlertType("Rear left tire pressure");
            result.add(newAlert);
        }

        if(reading.getTiresid().getRearRight()<32 || reading.getTiresid().getRearRight()>36) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("LOW");
            newAlert.setAlertType("Rear right tire pressure");
            result.add(newAlert);
        }

        if(reading.isCheckEngineLightOn()||reading.isEngineCoolantLow()) {
            alerts newAlert = new alerts();
            newAlert.setAlertCreationTime(Calendar.getInstance().getTime());
            newAlert.setVin(reading.getVin());
            newAlert.setAlertCleared(false);
            newAlert.setAlertPriority("LOW");
            if(reading.isCheckEngineLightOn()) {
                newAlert.setAlertType("Check Engine light on");
            } else  {
                newAlert.setAlertType("Engine coolant low on");
            }
            result.add(newAlert);
        }

        return result;
    }
}
