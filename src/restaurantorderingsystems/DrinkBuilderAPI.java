/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restaurantorderingsystems;

/**
 *
 *  An interface that defines the methods for building a Drink object. It includes methods for setting various properties (such as ID, cost, and name) and a build() method to create the final Drink instance.
 * 
 */
public interface DrinkBuilderAPI { 
    DrinkBuilderAPI setId(int id); 
    DrinkBuilderAPI setCost(double cost); 
    DrinkBuilderAPI setName(String name); 
    Drink build(); 
}
