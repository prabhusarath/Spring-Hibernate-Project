package io.auto.repository;

import io.auto.entity.automotive;
import io.auto.entity.data;

import java.util.List;
/**
 * Created by SarathKumar on 6/28/2017.
 */
public interface dataRepo {

    List<data> findAll();

    data findOne(String readingId);

    List<data> findReadingsFromVehicle(String vin);

    data create(data readings);

    data update(data readings);

    void delete(data readings);

}
