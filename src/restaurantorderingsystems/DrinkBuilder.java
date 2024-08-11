/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantorderingsystems;

/**
 *
 * A concrete implementation of DrinkBuilderAPI. It provides the actual implementation for setting the properties of a Drink and building the Drink object. It follows the Builder design pattern to provide a flexible way to create Drink instances.
 * 
 */
class DrinkBuilder implements DrinkBuilderAPI { 
    private int id; 
    private double cost; 
    private String name; 

    @Override 
    public DrinkBuilderAPI setId(int id) { 
        this.id = id; 
        return this; 
    } 

    @Override 
    public DrinkBuilderAPI setCost(double cost) { 
        this.cost = cost; 
        return this; 
    } 

    @Override 
    public DrinkBuilderAPI setName(String name) { 
        this.name = name; 
        return this; 
    } 

    @Override 
    public Drink build() { 
        return new Drink(id, cost, name); 
    } 
}
