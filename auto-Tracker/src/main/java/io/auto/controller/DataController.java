package io.auto.controller;

import io.auto.entity.data;
import io.auto.service.dataService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SarathKumar on 6/28/2017.
 */

@CrossOrigin(origins = "http://mocker.egen.io", maxAge = 3600)
@RestController
@RequestMapping(value = "readings")
public class DataController {

    private dataService service;

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<data> findAll()
    {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<data> findOne(@PathVariable("vin") String vehId)
    {
        return service.findReadingsFromVehicle(vehId);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public data update(@PathVariable("vin") String vehId, @RequestBody data Readings) {
        return service.update(vehId,Readings);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{vin}")
    public void delete(@PathVariable("vin") String vehId) {
        service.delete(vehId);
    }


}
