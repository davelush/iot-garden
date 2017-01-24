package io.digitalsandpit.garden;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.digitalsandpit.garden.model.BatteryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Slf4j
public class BatteryStepDefs {

    private String coreid;
    private double value;
    private String photonServer;
    private String photonPort;

    @Before
    public void setup() {
        this.photonServer = System.getProperty("photonServer");
        this.photonPort = System.getProperty("photonPort");
    }

    @Given("^the (.*) device$")
    public void the_device_id_device(String device) throws Throwable {
        this.coreid = device;
    }

    @And("^a battery charge level of (\\d+.\\d+)%$")
    public void a_battery_charge_level_of_(double value) throws Throwable {
        this.value = value;
    }

    @And("^a battery voltage level of (\\d+.\\d+)$")
    public void a_battery_voltage_level_of_(double value) throws Throwable {
        this.value = value;
    }

    @When("^a (.*) event is sent$")
    public void a_event_name_event_is_sent(String name) throws Throwable {
        RestTemplate restTemplate = new RestTemplate();

        BatteryEvent event = new BatteryEvent();
        event.setTimestamp(new Date());
        event.setName(name);
        event.setCoreid(this.coreid);
        event.setData(this.value);

        restTemplate.postForObject("http://"+photonServer+":"+photonPort+"/v1/"+name, event, BatteryEvent.class);
    }

    @Then("^the event will be acknowledged as (.*)$")
    public void the_event_will_be_acknowledged_as_status(String status) throws Throwable {
        log.info("status = " + status);
    }
}
