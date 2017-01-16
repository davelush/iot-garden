package io.digitalsandpit.garden;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyStepdefs {

    @When("^the (.*) device sends a battery charge level event$")
    public void the_deviceName_device_sends_a_battery_charge_level_event(String deviceName) throws Throwable {
        log.info("deviceName = "+deviceName);
//        throw new cucumber.api.PendingException();
    }


    @Then("^the event will be acknowledged as (.*)$")
    public void the_event_will_be_acknowledged_as_status(String status) throws Throwable {
        log.info("status = "+status);
//        throw new PendingException();
    }
}
