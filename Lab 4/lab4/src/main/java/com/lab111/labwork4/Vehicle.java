package com.lab111.labwork4;

// abstraction in bridge pattern
/**
 * Class Vehicle
 * Цей клас є абстракцією всіх транспортних засобів
 * і містить в собі два Цеха
 * І має абстрактний метод manufacture
 *
 * @author Viacheslav Malashkin
 *
 */
abstract class Vehicle {

    protected Workshop workShop1;
    protected Workshop workShop2;

    /** кон
     @param workShop1  Цех1
     @param workShop2  Цех2
     */
    protected Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}