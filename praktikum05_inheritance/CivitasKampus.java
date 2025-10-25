/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum05_inheritance;

/**
 *
 * @author Pongo
 */
public class CivitasKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //buat objek
        Dosen d1 = new Dosen();
        Dosen d2= new Dosen();
        
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        
        //panggil fungsi2 di class Dosen & Mahasiswa
        d1.setNidn("1111"); d1.setNama("Nasrul");
        d1.setGender('L'); d1.setGelar("S.Kom, M.Kom");
        
        d2.setNidn("1112"); d2.setNama("Tifany");
        d2.setGender('P'); d2.setGelar("ST, MT");
        
        m1.setNim("111"); m1.setNama("Eko");
        m1.setGender('L'); m1.setProdi("TI");
        m1.setSemester(6); m1.setIpk(3.8f);
        
        m2.setNim("112"); m2.setNama("Revani");
        m2.setGender('P'); m2.setProdi("SI");
        m2.setSemester(3); m2.setIpk(4.0f);
        
        Person data[] = {d1,d2,m1,m2};
        for(Person d : data){
            System.out.println(d);
        }
        
    }
    
}
