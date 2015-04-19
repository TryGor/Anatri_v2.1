/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.controller;

import anatri.model.Djelatnik;
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
public class ObradaDjelatnik {
    
    private PreparedStatement komanda;

    public List<Djelatnik> dohvati(String uvjet) {
        List<Djelatnik> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select a.sifra, a.iban, b.sifra as sifraosobe,"
                    + "b.oib,b.ime,b.prezime,b.adresa,b.mjesto,b.telefon,b.email from djelatnik a inner join osoba b on a.osoba=b.sifra where concat(b.ime, ' ', b.prezime) like ?");
            komanda.setString(1, "%" + uvjet + "%");

            ResultSet rs = komanda.executeQuery();
            Djelatnik o;
            while (rs.next()) {
                o = new Djelatnik();
                o.setSifraOsobe(rs.getInt("sifraosobe"));
                o.setSifra(rs.getInt("sifra"));
                o.setOib(rs.getString("oib"));
                o.setIme(rs.getString("ime"));
                o.setPrezime(rs.getString("prezime"));
                o.setAdresa(rs.getString("adresa"));
                o.setMjesto(rs.getString("mjesto"));
                o.setTelefon(rs.getString("telefon"));
                o.setIban(rs.getString("iban"));
                o.setEmail(rs.getString("email"));
                
                

                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaDjelatnik.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public Djelatnik dodaj(Djelatnik o) {
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into osoba (oib,ime,prezime,adresa,mjesto,telefon,email"
                    + ") values (?,?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setString(1, o.getOib());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(5, o.getAdresa());
            komanda.setString(6, o.getMjesto());
            komanda.setString(4, o.getTelefon());
            komanda.setString(7, o.getEmail());
                       
            komanda.executeUpdate();
            
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifraOsobe(rs.getInt(1));

            komanda = veza.prepareStatement("insert into djelatnik (osoba,iban"
                    + ") values (?,?)", PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setInt(1, o.getSifraOsobe());
            komanda.setString(2, o.getIban());
            komanda.executeUpdate();

            rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaDjelatnik.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return o;
    }

    public boolean promjeni(Djelatnik o) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update djelatnik set iban=?"
                    + " where sifra=?");
            komanda.setString(1, o.getIban());
            komanda.setInt(2, o.getSifra());
            komanda.executeUpdate();

            komanda = veza.prepareStatement("update osoba set oib=?, ime=?,"
                    + " prezime=?, telefon=?, adresa=?, mjesto=?, email=? where sifra=?");
            komanda.setString(1, o.getOib());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(4, o.getTelefon());
            komanda.setString(5, o.getAdresa());
            komanda.setString(6, o.getMjesto());
            komanda.setString(7, o.getEmail());
            komanda.setInt(8, o.getSifra());
            komanda.executeUpdate();
            
            veza.commit();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaDjelatnik.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    public boolean obrisi(Djelatnik o) {
        boolean brisiDjelatnik = false;
        boolean brisiOsoba = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from djelatnik "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiDjelatnik = true;
            }
            komanda = veza.prepareStatement("delete from osoba "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifraOsobe());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiOsoba = true;
            }
            
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaDjelatnik.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiOsoba && brisiDjelatnik;
    }

}

