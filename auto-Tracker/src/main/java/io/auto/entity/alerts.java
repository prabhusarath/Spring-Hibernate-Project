package io.auto.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.Date;
import java.util.UUID;

/**
 * Created by SarathKumar on 6/28/2017.
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "Alert.findAll", query = "SELECT infos FROM alerts infos"),
        @NamedQuery(name = "Alert.findByVin", query = "SELECT infos FROM alerts infos WHERE infos.vin=:pVin")
})
public class alerts {

    private String alertId;
    private String alertPriority;
    private Date alertCreationTime;
    private String alertType;
    private boolean alertCleared;
    private String vin;

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertPriority() {
        return alertPriority;
    }

    public void setAlertPriority(String alertPriority) {
        this.alertPriority = alertPriority;
    }

    public Date getAlertCreationTime() {
        return alertCreationTime;
    }

    public void setAlertCreationTime(Date alertCreationTime) {
        this.alertCreationTime = alertCreationTime;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public boolean isAlertCleared() {
        return alertCleared;
    }

    public void setAlertCleared(boolean alertCleared) {
        this.alertCleared = alertCleared;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public alerts() {
        this.alertId = UUID.randomUUID()
                .toString();

    }






}



