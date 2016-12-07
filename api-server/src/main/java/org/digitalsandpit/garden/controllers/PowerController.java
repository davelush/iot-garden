package org.digitalsandpit.garden.controllers;

import lombok.extern.slf4j.Slf4j;
import org.digitalsandpit.garden.model.Battery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PowerController {

    @RequestMapping(value="/battery", method = RequestMethod.POST)
    public void putBattery(@RequestBody Battery battery) {
        // let's start by just logging
        log.info("Battery details are [charge level={}] [charge delta={}]", battery.getChargeLevel(), battery.getChargeDelta());
    }
}
