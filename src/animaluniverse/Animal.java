/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaluniverse;

/**
 *
 * @author lucas
 */
public abstract class Animal {
    
    protected int wight;
    protected int age;
    protected int members;
    
    public abstract void move();
    
    public abstract void eat();
    
    public abstract void doSound();
}
