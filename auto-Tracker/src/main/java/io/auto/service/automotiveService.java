package io.auto.service;

import io.auto.entity.automotive;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */
public interface automotiveService {

    List<automotive> findAll();

    automotive findOne(String vin);

    automotive create(automotive v);

    automotive update(String id, automotive v);

    void delete(String vin);
}

