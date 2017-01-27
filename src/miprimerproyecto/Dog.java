/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

/**
 *
 * @author leonguevara
 */
public class Dog extends Animal {
    private int legs;
    private int teeth;
    private String coat;
    private String race;
    
    public Dog(String name, int legs, int teeth, String coat, String race) {
        super("sexual", name, 2, 1);
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
        this.race = race;
    }
    
    @Override
    public void Eat() {
        Chew();
        super.Eat();
    }
    
    public void Chew(){
        System.out.println("Dog.Chew() called");
    }
}
