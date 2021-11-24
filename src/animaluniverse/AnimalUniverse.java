/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaluniverse;

import fish.Fish;
import bird.Bird;
import mammal.Dog;
import reptile.Reptile;
import mammal.Mammal;
import mammal.kangaroo;
import reptile.Turtle;

/**
 *
 * @author lucas
 */
public class AnimalUniverse {

    /**
     * THIS PROJECT IS TO PRACTICE POLIMORFISM
     */
    public static void main(String[] args) {
        
        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Fish f = new Fish();
        Bird b = new Bird();
        
        kangaroo k = new kangaroo();
        Turtle t = new Turtle();
        
        t.move();
        
        m.move();
        
        Dog d = new Dog();
        d.react("Hello");
        d.react("vai apanhar");
        d.react(11, 30);
        d.react(15, 30);
        d.react(true);
       
        
    }
    
}
