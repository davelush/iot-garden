# lipo.feature
Feature: Lipo battery state tracking
As Dave
I want to know the charge state of the battery
So that I can tell whether the solar panels are keeping up

Scenario: Photon sends a battery charge level event
Given the test_device device
  And a battery charge level of 50.2%
 When a battery-charge event is sent
 Then the event will be acknowledged as OK

Scenario: Photon sends a battery voltage level event
Given the test_device device
  And a battery voltage level of 4.0134
 When a battery-voltage event is sent
 Then the event will be acknowledged as OK