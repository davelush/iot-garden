package org.digitalsandpit.garden.controllers;

import lombok.extern.slf4j.Slf4j;
import org.digitalsandpit.garden.model.Battery;
import org.digitalsandpit.garden.services.Device;
import org.digitalsandpit.garden.services.PhotonService;
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
