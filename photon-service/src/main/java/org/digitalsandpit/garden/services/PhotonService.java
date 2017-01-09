package org.digitalsandpit.garden.services;

import lombok.extern.slf4j.Slf4j;
import org.digitalsandpit.garden.model.Battery;

@Slf4j
public class PhotonService implements Device {
    private double batteryLevel;
    private double batteryDelta;

    @Override
    public void addBatteryReading(Battery battery) {
        log.info("Battery details are [charge level={}] [charge delta={}]", battery.getChargeLevel(), battery.getChargeDelta());
    }
}
