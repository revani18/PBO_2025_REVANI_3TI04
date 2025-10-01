/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;
import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class BacaMasukan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // buat objek untuk baca terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama anda ? ");
        String nama = sc.nextLine(); // baca masukan
        System.out.println("Pa kabar "+ nama +" ?");
    }
    
}
