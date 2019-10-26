package com.lab111.labwork4;

// Demonstration of bridge design pattern
/**
 * Class BridgePattern.
 * Цей клас є точкою входу.
 * Він ініціалізує всі об'єкти і викликає їх методи.
 *
 * @author Viacheslav Malashkin
 *
 */
public class BridgePattern {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}