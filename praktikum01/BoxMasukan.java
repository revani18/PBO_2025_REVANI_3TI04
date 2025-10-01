/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;
import javax.swing.JOptionPane; // supaya JOptionPane dapat dipakai

/**
 *
 * @author Pongo
 */
public class BoxMasukan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = JOptionPane.showInputDialog("Nama anda ?");
        JOptionPane.showMessageDialog(null,"Pa kabar "+ nama +" ?");
    }
    
}
