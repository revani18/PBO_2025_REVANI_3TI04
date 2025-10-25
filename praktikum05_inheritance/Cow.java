/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum05_inheritance;

/**
 *
 * @author Pongo
 */
public class Cow extends Animal{
    private String jenis;
    
    public Cow(String name, int age, String jenis){
        super(name, age);
        this.jenis = jenis;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + "says: Mooo!"); 
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() + ", jenis=" + jenis + '\'' + '}';
    }
}
