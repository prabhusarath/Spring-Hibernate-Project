package io.auto.entity;

import javax.persistence.Embeddable;

/**
 * Created by SarathKumar on 6/28/2017.
 */


@Embeddable
public class tires {

    private float frontLeft;
    private float frontRight;
    private float rearLeft;
    private float rearRight;

    public float getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(float frontLeft) {
        this.frontLeft = frontLeft;
    }

    public float getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(float frontRight) {
        this.frontRight = frontRight;
    }

    public float getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(float rearLeft) {
        this.rearLeft = rearLeft;
    }

    public float getRearRight() {
        return rearRight;
    }

    public void setRearRight(float rearRight) {
        this.rearRight = rearRight;
    }
}



