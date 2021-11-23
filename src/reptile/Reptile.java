/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reptile;

import animaluniverse.Animal;

/**
 *
 * @author lucas
 */
public class Reptile extends Animal {
    
    private String colorReptile;
    
    
    @Override
    public void move(){
        System.out.println("Rastejando...");
    }
    
    @Override
    public void eat(){
        System.out.println("eating...");
    }
    
    @Override
    public void doSound(){
        System.out.println("doing raptile song...");
    }

}
