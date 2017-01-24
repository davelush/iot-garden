package io.digitalsandpit.garden;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.digitalsandpit.garden.model.LipoSocEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Slf4j
public class MyStepdefs {

    private String coreid;
    private double lipoSoc;

    @Given("^the (.*) device$")
    public void the_wombat_hacker_device(String device) throws Throwable {
        this.coreid = device;
    }

    @And("^a battery charge level of (\\d+).(\\d+)%$")
    public void a_battery_charge_level_of_(int major, int minor) throws Throwable {
        this.lipoSoc = major + (minor / 10);
    }

    @When("^a (.*) event is sent$")
    public void a_lipo_soc_event_is_sent(String name) throws Throwable {
        RestTemplate restTemplate = new RestTemplate();

        LipoSocEvent event = new LipoSocEvent();
        event.setTimestamp(new Date());
        event.setName(name);
        event.setCoreid(this.coreid);
        event.setData(this.lipoSoc);

        //TODO account for different environments
        restTemplate.postForObject("http://garden.digitalsandpit.io:8080/battery", event, LipoSocEvent.class);
    }


    @Then("^the event will be acknowledged as (.*)$")
    public void the_event_will_be_acknowledged_as_status(String status) throws Throwable {
        log.info("status = " + status);
    }

}
