/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author TryGor
 */
public class Rezervacija {
    
    private int sifra;
    private String naziv;
    private String nazivVozila;
    private BigDecimal cijenaPoDanu;
    private int brojDanaNajma;
    private BigDecimal ukupnaCijena;
    private Date datumPodizanja;
    private Date datumVracanja;
    private BigDecimal popust;
    private Osoba osoba;

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNazivVozila() {
        return nazivVozila;
    }

    public void setNazivVozila(String nazivVozila) {
        this.nazivVozila = nazivVozila;
    }

       public BigDecimal getCijenaPoDanu() {
        return cijenaPoDanu;
    }

    public void setCijenaPoDanu(BigDecimal cijenaPoDanu) {
        this.cijenaPoDanu = cijenaPoDanu;
    }

    public int getBrojDanaNajma() {
        return brojDanaNajma;
    }

    public void setBrojDanaNajma(int brojDanaNajma) {
        this.brojDanaNajma = brojDanaNajma;
    }

    public BigDecimal getUkupnaCijena() {
        return ukupnaCijena;
    }

    public void setUkupnaCijena(BigDecimal ukupnaCijena) {
        this.ukupnaCijena = ukupnaCijena;
    }

    public Date getDatumPodizanja() {
        return datumPodizanja;
    }

    public void setDatumPodizanja(Date datumPodizanja) {
        this.datumPodizanja = datumPodizanja;
    }

    public Date getDatumVracanja() {
        return datumVracanja;
    }

    public void setDatumVracanja(Date datumVracanja) {
        this.datumVracanja = datumVracanja;
    }

    public BigDecimal getPopust() {
        return popust;
    }

    public void setPopust(BigDecimal popust) {
        this.popust = popust;
    }

    @Override
    public String toString() {
        return this.naziv;
    }

}