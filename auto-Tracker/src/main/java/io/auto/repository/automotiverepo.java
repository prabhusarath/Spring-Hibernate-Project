package io.auto.repository;

import io.auto.entity.automotive;
import io.auto.entity.data;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public interface automotiverepo {

    List<automotive> findAll();

    automotive findOne(String vin);

    automotive create(automotive vehicles);

    automotive update(automotive vehicles);

    void delete(automotive vehicles);

}
