package io.digitalsandpit.garden.controllers;

import io.digitalsandpit.garden.dynamodb.Battery;
import io.digitalsandpit.garden.dynamodb.BatteryRepository;
import io.digitalsandpit.garden.model.BatteryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BatteryController {
    @Autowired
    private BatteryRepository repo;

    /**
     * The JSON received as a POST on this controller looks like this
     * {
     *     "timestamp":"2017-01-12T21:37:01.766Z",
     *     "coreid":"2a002d000347343337373737",
     *     "data":"77.812500",
     *     "name":"lipo-soc"
     * }
     */
    @RequestMapping(value="/v1/battery-charge", method= RequestMethod.POST)
    public void postStateOfCharge(@RequestBody BatteryEvent event) {
        log.info(event.toString());
        Battery battery = new Battery(event);
        repo.save(battery);
    }

    @RequestMapping(value="/v1/battery-voltage", method=RequestMethod.POST)
    public void postVoltage(@RequestBody BatteryEvent event) {
        log.info(event.toString());
        Battery battery = new Battery(event);
        repo.save(battery);
    }
}
