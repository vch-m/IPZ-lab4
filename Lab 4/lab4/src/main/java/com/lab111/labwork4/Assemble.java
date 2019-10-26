package com.lab111.labwork4;
/**
 * Class Assemble
 * Цей клас є цехом збірки ТЗ.
 * Він реалізує метод Work
 *
 * @author Viacheslav Malashkin
 *
 */
// Concrete implementation 2 for bridge pattern
public class Assemble implements Workshop {
    @Override
    public void work()
    {
        System.out.print(" And");
        System.out.println(" Assembled.");
    }
}