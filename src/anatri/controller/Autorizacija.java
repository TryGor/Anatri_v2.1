/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.controller;

import anatri.model.Operater;
import anatri.utility.Baza;
import anatri.utility.Pomocno;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TryGor
 */
public class Autorizacija {
    
    private PreparedStatement komanda;
    
     public Operater autoriziraj(String korisnik, String lozinka){
          Operater o = null;
          
          try {
             komanda=Baza.getVeza().prepareStatement("select * from operater where binary korisnik=? and lozinka=md5(?)");
             komanda.setString(1, korisnik);
             komanda.setString(2, lozinka);
             ResultSet rs = komanda.executeQuery();
             while (rs.next()){
                 o = new Operater();
                 o.setSifra(rs.getInt("sifra"));
                 o.setIme(rs.getString("ime"));
                 o.setPrezime(rs.getString("prezime"));
                 o.setKorisnik(rs.getString("korisnik"));
                 o.setLozinkaMD5(rs.getString("lozinka"));
             }
         } catch (Exception e) {
         }
            
          if(o!=null){
              Pomocno.setOperater(o);
          }
            return o;
        }
    
}
