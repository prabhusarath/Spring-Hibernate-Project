package io.auto.service;

import io.auto.entity.automotive;
import io.auto.exception.ResourceNotFoundException;
import io.auto.repository.automotiverepo;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public class automotiveServiceImpl implements automotiveService{

    private automotiverepo repository;

    @Transactional(readOnly = true)
    public List<automotive> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public automotive findOne(String vin) {
        automotive vehicleInstance = repository.findOne(vin);
        if(vehicleInstance == null)
            throw new ResourceNotFoundException("No matching vehicle found for vin " + vin);
        return vehicleInstance;
    }

    public automotive create(automotive v) {
        return repository.create(v);
    }

    public automotive update(String id, automotive v) {
        automotive vehicleInstance = repository.findOne(id);
        if(vehicleInstance == null)
            throw new ResourceNotFoundException("No matching vehicle found for vin " + id);
        return repository.update(v);
    }

    public void delete(String vin) {
        automotive existing = repository.findOne(vin);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with vin=" + vin + " not found");
        }
        repository.delete(existing);

    }
}
