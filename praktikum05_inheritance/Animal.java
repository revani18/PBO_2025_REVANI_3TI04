/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum05_inheritance;

/**
 *
 * @author Pongo
 */
public class Animal {
    private String name;
    private int age;
    
    //constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //getter dan setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    //method
    public void makeSound(){
        System.out.println("Hewan ini mengeluarkan suara...");
    }

    @Override
    public String toString() {
        return "Animal{" + " name" + name + '\'' + ", age" + age + '}';
    }
       
}
