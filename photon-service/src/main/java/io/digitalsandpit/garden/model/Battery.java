package io.digitalsandpit.garden.model;

public class Battery {
    private double chargeLevel = 0.0;
    private double chargeDelta = 0.0;

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(double chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public double getChargeDelta() {
        return chargeDelta;
    }

    public void setChargeDelta(double chargeDelta) {
        this.chargeDelta = chargeDelta;
    }
}
