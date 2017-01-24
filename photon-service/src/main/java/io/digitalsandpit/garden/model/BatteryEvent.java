package io.digitalsandpit.garden.model;

import java.util.Date;

//TODO Battery, Device, Photon and StateOfChargeEvent are currently cruft.
public class BatteryEvent {
    private Date timestamp;
    private String coreid;
    private String name;
    private double data;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCoreid() {
        return coreid;
    }

    public void setCoreid(String coreid) {
        this.coreid = coreid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String output = String.format("{\"timestamp\":\"%s\",\"coreid\":\"%s\",\"data\":\"%s\",\"name\":\"%s\"}",
                timestamp.toString(),
                coreid,
                data,
                name);
        return output;
    }
}
