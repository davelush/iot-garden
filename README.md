# Dave's Veggie Patch

[![Build Status](https://travis-ci.org/davelush/iot-garden.svg?branch=master)](https://travis-ci.org/davelush/iot-garden) 

![alt tag](https://davessr2roadrunnerbuild.files.wordpress.com/2016/10/20160902_1700161.jpg)

This is my back garden after spending a year and a half landscaping it. This project will put a cheap solar panel and a small IoT device up on the shed roof plus a data-logging server provisioned in AWS. The device will use my domestic wi-fi to connect off to the Particle Cloud service. There will then be a water-butt to the right of the shed (where the blue bucket is) that will be fed from guttering down the back of the shed. The device will then control a gravity fed sprinkler for the three vegetable patches. 

For the device I am using a [Particle Photon](https://store.particle.io/collections/photon) along with a [Photon Battery Shield](https://www.sparkfun.com/products/13626) to make recharging easy. I'll open-source the code and schematics for this side of things as I make some progress. 

A few **disclaimers** as I'm still early days;

 - I haven't written any tests yet. I've been focused on provisioning my infrastructure and getting a steel thread from Photon to Particle Cloud to EC2 via a webhook and down into DynamoDB.
 - There is some hard-coding in the infrastructure at the moment. Especially around use of elastic IP
 - The webhook from Particle Cloud is manually configured at the moment
 - I've just got the steel thread working, so I'm going to track technical debt via github issues and do some clean-up before I start building out functionality
 
### Minimum useful

 - ~~Monitor battery charge level~~ (done)
 - Monitor battery voltage level
 - ~~Log & persist the above to server~~ (done)
 - Open & close gravity fed sprinkler based on time (hard-coded)
 - Log sprinkler open / closed state
 
### Wishlist

 - Configuration options for timing & frequency of sprinkler
 - Monitor water-level in waterbutt
 - Alert based on certain conditions. E.g. low battery, low water, valve failure etc...
 - Log temperature
 - Log soil temperature
 - Log soil moisture
 
