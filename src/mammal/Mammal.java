/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mammal;

import animaluniverse.Animal;

/**
 *
 * @author lucas
 */
public class Mammal extends Animal{
    
    private String colorMammal;
    
        
    @Override
    public void move(){
        System.out.println("Running...");
    }
    
    @Override
    public void eat(){
        System.out.println("eating...");
    }
    
    @Override
    public void doSound(){
        System.out.println("doing song...");
    }

    
}
