/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum04_oop;

/**
 *
 * @author Pongo
 */
public class Transaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat object
        Bank n1 = new Bank("Revani", 111, 500000);
        Bank n2 = new Bank("Alia", 112, 700000);
        Bank n3 = new Bank("Yurida", 113, 400000);
        
        //Panggil member class
        n1.menabung(300000);
        n2.menabung(100000);
        n2.menabung(200000);
        n3.menarik(200000);
        
        // Mencetak 
        System.err.println("-----------Mencetak Cara 1-----------");
        n1.mencetak(); n2.mencetak(); n3.mencetak();
        
        
        System.out.println("-----------Mencetak Cara 2-----------"); 
        Bank ar_nasabah[] = {n1, n2, n3}; 
        for (Bank nasab : ar_nasabah) { 
            nasab.mencetak();
        }
        
        
        }
    }