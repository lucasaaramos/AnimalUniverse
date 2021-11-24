/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mammal;

/**
 *
 * @author lucas
 */
public class Dog extends Mammal {
    
    private String react;
    private int hour;
    private int min;
    private boolean isOwner;
    
    public void enterrarOsso(){
        System.out.println("Enterrando o osso...");
    }
    
    
    public void react(String goodReact){
        if (this.react == "Hello" || this.react == "Hi"){
            System.out.println("Dog abanando o rabo");
        }else {
            System.out.println("Dog rosnando");
        }
        
    }
    
    public void react(int hour, int min){
        
        if (this.hour < 12){
            System.out.println("Dog abanando o rabo");
        }else if(this.hour >= 18){
            System.out.println("Dog ignorando");
        }else{
            System.out.println("Dog abanando e latindo");
        }
    }
    
    public void react(boolean isOwner){
        if (this.isOwner == true){
            System.out.println("Dog abanando o rabo");
        }else{
            System.out.println("Dog rosnando e latindo");
        
        }
    }
  
   
    
    @Override
    public void move(){
        System.out.println("Dog moving...");
    }
    
    @Override
    public void doSound(){
        System.out.println("dog doing song...");
    }
    
    
    
}
