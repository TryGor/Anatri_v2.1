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
public class Vozilo {
    
    private int sifra;
    //private Grupa grupa;
    private String naziv;
    private String registracija;
    private String tip;
    private String boja;
    private String vrstagoriva;
    private String grupavozila;

  
    /*public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }*/


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

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getVrstagoriva() {
        return vrstagoriva;
    }

    public void setVrstagoriva(String vrstagoriva) {
        this.vrstagoriva = vrstagoriva;
    }

    public String getGrupavozila() {
        return grupavozila;
    }

    public void setGrupavozila(String grupavozila) {
        this.grupavozila = grupavozila;
    }

  
    @Override
    public String toString() {
        return this.naziv+ " ---- " + this.registracija;
    }
}