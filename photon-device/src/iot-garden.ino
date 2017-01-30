// This #include statement was automatically added by the Particle IDE.
#include "SparkFunMAX17043/SparkFunMAX17043.h"

int led2 = D7;

double lipoVoltage = 0.0;
double lipoSoc = 0.0;

void setup() {
    lipo.begin();
    lipo.quickStart();

    pinMode(led2, OUTPUT);
}

void loop() {
    // turning the LED on and off every 5 seconds.
    // Not necessary but helpful when sat next to the device
    digitalWrite(led2, HIGH);
    lipoVoltage = lipo.getVoltage();
    lipoSoc = lipo.getSOC();

    Particle.publish("lipo-voltage", String(lipoVoltage), 60, PRIVATE);
    Particle.publish("lipo-soc", String(lipoSoc), 60, PRIVATE);

    delay(5000);
    digitalWrite(led2, LOW);
    delay(5000);
}