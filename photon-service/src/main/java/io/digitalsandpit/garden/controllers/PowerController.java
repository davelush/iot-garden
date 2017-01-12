package io.digitalsandpit.garden.controllers;

import io.digitalsandpit.garden.model.Battery;
import io.digitalsandpit.garden.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerController {
    @Autowired
    private Device device;

    @RequestMapping(value="/battery", method = RequestMethod.POST)
    public void putBattery(@RequestBody Battery battery) {
        device.addBatteryReading(battery);
    }
}
