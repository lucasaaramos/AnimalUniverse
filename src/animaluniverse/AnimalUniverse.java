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
public class AnimalUniverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Fish f = new Fish();
        Bird b = new Bird();
        
        m.move();
    }
    
}
