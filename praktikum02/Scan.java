/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum02;
import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Scan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        
        System.out.print("Usia : ");
        int umur = sc.nextInt();
        
        System.out.println("Nama Santri : " + nama + ", umur : " + umur + " tahun");
    }
    
}
