package io.digitalsandpit.garden.controllers;

import io.digitalsandpit.garden.dynamodb.LipoSoc;
import io.digitalsandpit.garden.dynamodb.LipoSocRepository;
import io.digitalsandpit.garden.model.Device;
import io.digitalsandpit.garden.model.LipoSocEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LipoController {
    @Autowired
    private Device device;

    @Autowired
    private LipoSocRepository repository;

    @RequestMapping(value="/v1/lipo-soc", method= RequestMethod.POST)
    //TODO map the following json into an object
    // {"timestamp":"2017-01-12T21:37:01.766Z","coreid":"2a002d000347343337373737","data":"77.812500","name":"lipo-soc"} ø
    public void postStateOfCharge(@RequestBody LipoSocEvent event) {
        log.info(event.toString());
        LipoSoc lipoSoc = new LipoSoc(event);
        repository.save(lipoSoc);
    }
}
