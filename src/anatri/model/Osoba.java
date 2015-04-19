/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.model;

import java.util.Date;

/**
 *
 * @author TryGor
 */
public class Osoba {
    
    private int sifraOsobe;
    private String oib;
    private String ime;
    private String prezime;
    private Date datumRodenja;
    private String adresa;
    private String mjesto;
    private String telefon;
    private String brojosobne;
    private String brojvozacke;
    private String email;

    public int getSifraOsobe() {
        return sifraOsobe;
    }

    public void setSifraOsobe(int sifraOsobe) {
        this.sifraOsobe = sifraOsobe;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumrodenja) {
        this.datumRodenja = datumrodenja;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getBrojosobne() {
        return brojosobne;
    }

    public void setBrojosobne(String brojosobne) {
        this.brojosobne = brojosobne;
    }

    public String getBrojvozacke() {
        return brojvozacke;
    }

    public void setBrojvozacke(String brojvozacke) {
        this.brojvozacke = brojvozacke;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return getIme() + " " + this.prezime;
    }
    
      public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    
}
