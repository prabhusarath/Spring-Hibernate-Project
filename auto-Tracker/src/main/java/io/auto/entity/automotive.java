package io.auto.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by SarathKumar on 6/28/2017.
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "automotive.findAll",query = "SELECT vehicles FROM automotive vehicles")
})
public class automotive {

    @Id
    private String vin;

    private String make;
    private String model;
    private int year;
    private int redlineRpm;
    private int maxFuelVolume;
    private Date lastServiceDate;

    @OneToOne
    private data autoData;

    @OneToOne
    private alerts alert;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRedlineRpm() {
        return redlineRpm;
    }

    public void setRedlineRpm(int redlineRpm) {
        this.redlineRpm = redlineRpm;
    }

    public int getMaxFuelVol() {
        return maxFuelVolume;
    }

    public void setMaxFuelVol(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
