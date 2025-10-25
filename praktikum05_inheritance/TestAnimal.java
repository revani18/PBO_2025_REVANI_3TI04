/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum05_inheritance;

/**
 *
 * @author Pongo
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c1 = new Cat("Budi ", 2, "Pink ");
        Cow w1 = new Cow("Bruno ", 8, "Limosin ");
        
        System.out.println(c1);
        System.out.println(w1);
        
        c1.makeSound();
        w1.makeSound();
        
        Animal[] hewan = {c1, w1};
        System.out.println("\n==== Daftar Hewan ====");
        for (Animal a : hewan){
            System.out.println(a.getName() + " adalah " + a.getClass().getSimpleName());
        }
    }
    
}
