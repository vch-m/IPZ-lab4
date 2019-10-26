package com.lab111.labwork4;

// Refine abstraction 1 in bridge pattern
/**
 * Class Car
 * Цей клас наслідує клас Vehicle.
 * Він реалізує метод manufacture
 *
 * @author Viacheslav Malashkin
 *
 */
public class Car extends Vehicle {
    public Car(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Car ");
        workShop1.work();
        workShop2.work();
    }
}