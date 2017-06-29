package io.auto.service;

import io.auto.entity.automotive;
import io.auto.entity.data;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public interface dataService {

    List<data> findAll();

    List<data> findReadingsFromVehicle(String vin);

    data create(data reading);

    data update(String id, data v);

    void delete(String readingId);
}
