package io.auto.controller;

import io.auto.entity.automotive;
import io.auto.service.automotiveService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */


@CrossOrigin(origins = "http://mocker.egen.io", maxAge = 3600)
@RestController
@RequestMapping(value = "vehicles")
public class AutoController {

    private automotiveService service;

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<automotive> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public automotive findOne(@PathVariable("vin") String vehId) {
        return service.findOne(vehId);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public automotive update(@PathVariable("vin") String vehId, @RequestBody automotive vehicles) {
      return service.update(vehId,vehicles);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{vin}")
    public void delete(@PathVariable("vin") String vehId) {
        service.delete(vehId);
    }


}
