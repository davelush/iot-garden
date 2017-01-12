package io.digitalsandpit.garden.services;

import io.digitalsandpit.garden.model.Device;
import lombok.extern.slf4j.Slf4j;
import io.digitalsandpit.garden.model.Battery;

@Slf4j
public class PhotonService implements Device {
    private double batteryLevel;
    private double batteryDelta;

    @Override
    public void addBatteryReading(Battery battery) {
        log.info("Battery details are [charge level={}] [charge delta={}]", battery.getChargeLevel(), battery.getChargeDelta());
    }
}
