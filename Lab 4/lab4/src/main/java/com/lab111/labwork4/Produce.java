package com.lab111.labwork4;
/**
 * Class Produce
 * Цей клас є цехом відливки деталей ТЗ.
 * Він реалізує метод Work
 *
 * @author Viacheslav Malashkin
 *
 */
// Concrete implementation 1 for bridge pattern
public class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}
