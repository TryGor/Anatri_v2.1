/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.controller;
import anatri.model.Oprema;
import anatri.utility.Baza;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TryGor
 */
    public class ObradaOprema {
    private PreparedStatement komanda;

    public List<Oprema> dohvatiOpremu(String uvjet) {
        List<Oprema> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select * from oprema where naziv like ?");
            komanda.setString(1, "%" + uvjet + "%");
            
            ResultSet rs = komanda.executeQuery();
            Oprema o;
            while (rs.next()) {
                o = new Oprema();
                o.setSifra(rs.getInt("sifra"));
                o.setNaziv(rs.getString("naziv"));
                o.setNazivVozila(rs.getString("nazivVozila"));
                o.setVrijednost(rs.getString("vrijednost"));
                
                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaOprema.class.getName()).log(Level.SEVERE, null, e);
        }
          
          return l;
    }
    public Oprema dodaj(Oprema o){
          try {
             komanda = Baza.getVeza().prepareStatement("insert into oprema (naziv,nazivvozila,vrijednost"
                     + ") values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
             komanda.setString(1, o.getNaziv());
             komanda.setString(2, o.getNazivVozila());
             komanda.setString(3, o.getVrijednost());
                          
             komanda.executeUpdate();          
              ResultSet rs = komanda.getGeneratedKeys();
                rs.next();
                o.setSifra(rs.getInt(1));

         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         return o;
     }
     public boolean promjeni(Oprema o){
         boolean vrati=false;
         try {
             komanda = Baza.getVeza().prepareStatement(" update oprema set naziv=?, nazivvozila=?, "
                     + " vrijednost=? where sifra=? ");
             komanda.setInt(1, o.getSifra());
             komanda.setString(2, o.getNaziv());
             komanda.setString(3, o.getNazivVozila());
             komanda.setString(4, o.getVrijednost());
            
             
             if(komanda.executeUpdate()==1){
                 vrati=true;
             }

         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         
         return vrati;
     }
   public boolean obrisi(Oprema o){
          boolean vrati=false;
         try {
                  komanda = Baza.getVeza().prepareStatement("delete from oprema "
                          + " where sifra=?");
             komanda.setInt(1, o.getSifra()); 
             if(komanda.executeUpdate()==1){
                 vrati=true;
             }
         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         return vrati;
     }
    
}
     

    /**
    public List<Oprema> dohvatiPoOpremi(Grupa grupa) {
        List<Oprema> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select * from oprema where sifra=?");
            komanda.setInt(1, grupa.getSifra());
            l=dohvatiOpremu();
           
        } catch (Exception e) {
            Logger.getLogger(ObradaOprema.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }
    */
   


