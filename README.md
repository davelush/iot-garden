# Dave's Veggie Patch

[![Build Status](https://travis-ci.org/davelush/iot-garden.svg?branch=master)](https://travis-ci.org/davelush/iot-garden) 

![alt tag](https://davessr2roadrunnerbuild.files.wordpress.com/2016/10/20160902_1700161.jpg)

This is my back garden after spending a year and a half landscaping it. This project will put a cheap solar panel and a small IoT device up on the shed roof plus a data-logging server provisioned in AWS. The device will (hopefully) use my domestic wi-fi to connect off to the Internet. There will then be a waterbutt to the right of the shed (where the blue bucket is) that will be fed from guttering down the back of the shed. The device will then control a gravity fed sprinkler for the three vegetable patches. 

For the device I currently own / am considering;

 - **Particle Photon** Really nice package that makes it easy to deploy to the device and make API calls out to AWS. Also has a low power draw. Unfortunately the power shield that makes battery / solar charging easy costs $25 + $50 shipping. I may just go on a particle shopping spree to make the shipping worth it when the Christmas pay-cheque comes in :)
 - **NextThing CHIP** Full featured computer running a Debian distro with some IO pins available. Quite power hungry compared to the Photon and would require more work to get up and running. This isn't really the sort of thing it's intended for.
 - **Omega2 Onion** Just waiting for this to arrive from the Kickstarter. Small form factor, low power consumption and shipping with a variety of shields. Going to try and resist buying anything for the Photon until this arrives!
 
I'll defer on the above for now and focus on the server-side. As this is a pet project, I won't necessarily be doing things in the fastest or most efficient way possible (e.g. a Lambda in AWS plus an API gateway). I'm more likely to write an application with a bit of security. 
 
### Minimum useful

 - Monitor battery charge level
 - Monitor charge in/out flow
 - Log & persist the above to server
 - Open & close gravity fed sprinkler based on time (hard-coded)
 - Log sprinkler open / closed state
 
### Wishlist

 - Configuration options for timing & frequency of sprinkler
 - Monitor water-level in waterbutt
 - Alert based on certain conditions. E.g. low battery, low water, valve failure etc...
 - Log temperature
 - Log soil temperature
 - Log soil moisture
 
