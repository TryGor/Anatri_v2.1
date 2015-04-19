/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.controller;

import anatri.model.Klijent;
import anatri.utility.Baza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TryGor
 */
public class ObradaKlijent {
    
    private PreparedStatement komanda;

    public List<Klijent> dohvati(String uvjet) {
        List<Klijent> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select a.sifra, b.sifra as sifraosobe,"
                    + "b.oib,b.ime,b.prezime,b.adresa,b.mjesto,b.brojosobne,b.brojvozacke,b.datumrodenja,b.email,b.telefon from klijent a inner join osoba b on a.osoba=b.sifra where concat(b.ime, ' ', b.prezime) like ?");
            komanda.setString(1, "%" + uvjet + "%");

            ResultSet rs = komanda.executeQuery();
            Klijent o;
            while (rs.next()) {
                o = new Klijent();
                o.setSifraOsobe(rs.getInt("sifraosobe"));
                o.setSifra(rs.getInt("sifra"));
                o.setOib(rs.getString("oib"));
                o.setIme(rs.getString("ime"));
                o.setPrezime(rs.getString("prezime"));
                o.setAdresa(rs.getString("adresa"));
                o.setMjesto(rs.getString("mjesto"));
                o.setBrojosobne(rs.getString("brojosobne"));
                o.setBrojvozacke(rs.getString("brojvozacke"));
                o.setDatumRodenja(rs.getDate("datumrodenja"));
                o.setEmail(rs.getString("email"));
                o.setTelefon(rs.getString("telefon"));

                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public Klijent dodaj(Klijent o) {
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into osoba (oib,ime,prezime,adresa,mjesto,brojosobne,brojvozacke,datumrodenja,telefon,email"
                    + ") values (?,?,?,?,?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setString(1, o.getOib());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(4, o.getAdresa());
            komanda.setString(5, o.getMjesto());
            komanda.setString(6, o.getBrojosobne());
            komanda.setString(7, o.getBrojvozacke());
            if(o.getDatumRodenja()==null){
                komanda.setDate(8, null);
            }else{
                 komanda.setDate(8,new java.sql.Date(o.getDatumRodenja().getTime()));
            }
            komanda.setString(9, o.getTelefon());
            komanda.setString(10, o.getEmail());
            komanda.executeUpdate();
            
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifraOsobe(rs.getInt(1));

            komanda = veza.prepareStatement("insert into klijent (osoba"
                    + ") values (?)", PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setInt(1, o.getSifraOsobe());
            komanda.executeUpdate();

            rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return o;
    }

    public boolean promjeni(Klijent o) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
           
            komanda = veza.prepareStatement("update osoba set oib=?, ime=?,"
                    + " prezime=?, adresa=?, mjesto=?, brojosobne=?, brojvozacke=?, datumrodenja=?, telefon=?, email=? where sifra=?");
            komanda.setString(1, o.getOib());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(4, o.getAdresa());
            komanda.setString(5, o.getMjesto());
            komanda.setString(6, o.getBrojosobne());
            komanda.setString(7, o.getBrojvozacke());
            if(o.getDatumRodenja()==null){
                komanda.setDate(8, null);
            }else{
                 komanda.setDate(8,new java.sql.Date(o.getDatumRodenja().getTime()));
            }
            komanda.setString(9, o.getTelefon());
            komanda.setString(10, o.getEmail());
            komanda.setInt(11, o.getSifra());
            komanda.executeUpdate();

            veza.commit();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    public boolean obrisi(Klijent o) {
        boolean brisiKlijent = false;
        boolean brisiOsoba = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from klijent "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiKlijent = true;
            }
            komanda = veza.prepareStatement("delete from osoba "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifraOsobe());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiOsoba = true;
            }
            
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiOsoba && brisiKlijent;
    }

}

    
        /*boolean brisiKlijent = false;
        boolean brisiOsoba = false;
        boolean brisiDjelatnik = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from klijent "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiKlijent = true;
            }
            komanda = veza.prepareStatement("delete from osoba "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifraOsobe());
            
            if (komanda.executeUpdate() == 1) {
                brisiKlijent = true;
            }
            
            komanda = veza.prepareStatement("delete from djelatnik "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifraOsobe());
            
            
            if (komanda.executeUpdate() == 1) {
                brisiOsoba = true;
            }
            
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiOsoba && brisiKlijent && brisiDjelatnik;
    }*/

