/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum05_inheritance;

/**
 *
 * @author Pongo
 */
public class Dosen extends Person{
    //member1 var
    private String nidn;
    private String gelar;
    
    //member2 Dosen
    public Dosen() {
        super();
    }
    
    //member3 method
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Dosen: " + super.toString() + ", NIDN: " + nidn + ", Gelar: " + gelar ;
    }
    
}
