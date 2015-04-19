/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.model;

/**
 *
 * @author TryGor
 */
public class Oprema {
    
    private int sifra;
    private String naziv;
    private String nazivVozila;
    private String vrijednost;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNazivVozila() {
        return nazivVozila;
    }

    public void setNazivVozila(String nazivVozila) {
        this.nazivVozila = nazivVozila;
    }

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

    @Override
    public String toString() {
        return naziv;
    }
   
}


   
