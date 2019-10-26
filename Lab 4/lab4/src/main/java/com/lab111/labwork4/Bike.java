package com.lab111.labwork4;

// Refine abstraction 2 in bridge pattern
/**
 * Class Bike
 * Цей клас наслідує клас Vehicle.
 * Він реалізує метод manufacture
 *
 * @author Viacheslav Malashkin
 *
 */
public class Bike extends Vehicle {
    public Bike(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();
    }
}