# lipo.feature
Feature: Lipo battery state tracking
As Dave
I want to know the charge state of the battery
So that I can tell whether the solar panels are keeping up

Scenario: Photon sends a battery charge level event
When the wombat_hacker device sends a battery charge level event
Then the event will be acknowledged as OK