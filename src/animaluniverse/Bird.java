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
public class Bird extends Animal{
    
    private String colorBird;
    
    @Override
    public void move(){
        System.out.println("Flying...");
    }
    
    @Override
    public void eat(){
        System.out.println("Bird eating...");
    }
    
    @Override
    public void doSound(){
        System.out.println("doing bird song...");
    }
    
    public void buildNest(){
        System.out.println("Build nest...");
    }

}
