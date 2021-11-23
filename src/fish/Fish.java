/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish;

import animaluniverse.Animal;

/**
 *
 * @author lucas
 */
public class Fish extends Animal{
    
    
    private String colorFish;
    
    @Override
    public void move(){
        System.out.println("Swimming...");
    }
    
    @Override
    public void eat(){
        System.out.println("fish eating...");
    }
    
    @Override
    public void doSound(){
        System.out.println("doing fish song...");
    }

    public void doBubble(){
        System.out.println("doing bubbles...");
    }
}
