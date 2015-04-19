/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.model;

import java.util.List;

/**
 *
 * @author TryGor
 */
public class Grupa {
    
    private int sifraGrupe;
    private int sifra;
    private String naziv;
    private String vozilo;
    private String registracija;
    private String opremaVozila;

    public int getSifraGrupe() {
        return sifraGrupe;
    }

    public void setSifraGrupe(int sifraGrupe) {
        this.sifraGrupe = sifraGrupe;
    }

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

    public String getVozilo() {
        return vozilo;
    }

    public void setVozilo(String vozilo) {
        this.vozilo = vozilo;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getOpremaVozila() {
        return opremaVozila;
    }

    public void setOpremaVozila(String opremaVozila) {
        this.opremaVozila = opremaVozila;
    }

    @Override
    public String toString() {
        return this.naziv+ " ---- " + this.registracija;
    }
    
}
