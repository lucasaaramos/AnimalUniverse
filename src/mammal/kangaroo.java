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
public class kangaroo extends Mammal {
    
    public void useBag(){
        System.out.println("Using bag...");
    }
    
    @Override
    public void move(){
        System.out.println("Kangaroo mooving...");
    }
}
