/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum02;
import javax.swing.JOptionPane;

/**
 *
 * @author Pongo
 */
public class Box {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = JOptionPane.showInputDialog(
        "Nama Anda?"
        );
        
        JOptionPane.showMessageDialog(null, "Apa Kabar " + nama + "?");
    }
    
}
