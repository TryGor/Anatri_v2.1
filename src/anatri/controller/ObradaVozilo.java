/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.controller;

import anatri.model.Grupa;
import anatri.model.Oprema;
import anatri.model.Vozilo;
import anatri.utility.Baza;
import java.sql.Connection;
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
public class ObradaVozilo {
    
    private PreparedStatement komanda;
    
    public List<Vozilo> dohvati(String uvjet){
         List<Vozilo> l = new ArrayList<>();
         try {
                 komanda = Baza.getVeza().prepareStatement("select * from vozilo where naziv like? ");
                         
                 komanda.setString(1, "%" + uvjet + "%");

                 ResultSet rs = komanda.executeQuery();
                 Vozilo o;
                 while(rs.next()){
                     o=new Vozilo();
                     o.setSifra(rs.getInt("sifra"));
                     o.setNaziv(rs.getString("naziv"));
                     o.setBoja(rs.getString("boja"));
                     o.setRegistracija(rs.getString("registracija"));
                     o.setTip(rs.getString("tip"));
                     o.setVrstagoriva(rs.getString("vrstagoriva"));
                     o.setGrupavozila(rs.getString("grupavozila"));
         /*try {
             komanda = Baza.getVeza().prepareStatement(" select  "
                    + " a.sifra as sifraVozila, "
                    + " a.naziv as nazivVozila, "
                    + " a.registracija, "
                    + " a.tip, "
                    + " a.boja, "
                    + " a.vrstagoriva, "
                    + " b.sifra as sifraGrupe, "
                    + " b.naziv "
                    + " from vozilo a "
                    + " inner join grupa b on a.grupa=b.sifra "
                    + " where a.naziv like ? ");
             komanda.setString(1, "%" + uvjet + "%");
             
             ResultSet rs = komanda.executeQuery();
             Vozilo o;
             Grupa g;
             while(rs.next()){
                 o=new Vozilo();
                 o.setSifra(rs.getInt("sifraVozila"));
                 o.setNaziv(rs.getString("nazivVozila"));
                 o.setRegistracija(rs.getString("registracija"));
                 o.setTip(rs.getString("tip"));
                 o.setBoja(rs.getString("boja"));
                 o.setGrupa(rs.getString("grupa"));
                 o.setVrstagoriva(rs.getString("vrstagoriva"));
                 
                g = new Grupa();
                g.setSifra(rs.getInt("sifraGrupe"));
                g.setNaziv(rs.getString("naziv"));
                
                //o.setGrupa(g);
               */
 
             
             
                  
                     l.add(o);
                 }
             } catch (Exception e) {
                  Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
             } 
             
            
        

             return l;
            }
     public Vozilo dodaj(Vozilo o){
          try {
             komanda = Baza.getVeza().prepareStatement("insert into vozilo (naziv,tip,registracija,boja,grupavozila,vrstagoriva"
                     + ") values (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
             komanda.setString(1, o.getNaziv());
             komanda.setString(3, o.getRegistracija());
             komanda.setString(2, o.getTip());
             komanda.setString(4, o.getBoja());
             komanda.setString(5, o.getVrstagoriva());
             komanda.setString(6, o.getGrupavozila());
             
             komanda.executeUpdate();          
              ResultSet rs = komanda.getGeneratedKeys();
                rs.next();
                o.setSifra(rs.getInt(1));

         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         return o;
     }
    
     public boolean promjeni(Vozilo o){
         boolean vrati=false;
         try {
             komanda = Baza.getVeza().prepareStatement("update vozilo set naziv=?,tip=?,"
                     + "registracija=?,boja=?,grupavozila=?,vrstagoriva=? where sifra=?");
             komanda.setString(1, o.getNaziv());
             komanda.setString(3, o.getRegistracija());
             komanda.setString(2, o.getTip());
             komanda.setString(4, o.getBoja());
             komanda.setString(5, o.getVrstagoriva());
             komanda.setString(6, o.getGrupavozila());
             komanda.setInt(7, o.getSifra());
             
             if(komanda.executeUpdate()==1){
                 vrati=true;
             }

         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         
         return vrati;
     }
   public boolean obrisi(Vozilo o){
        boolean vrati=true;
        try {
            
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from grupa where vozilo=?");
            
            komanda.setInt(1, o.getSifra());
            
            komanda.executeUpdate();
            
            komanda = veza.prepareStatement("delete from vozilo where sifra=?");
            komanda.setInt(1, o.getSifra());
          
             if(komanda.executeUpdate()<1){
                vrati=false;
            }
            
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaGrupa.class.getName()).log(Level.SEVERE, null, e);
            vrati=false;
        }
     

        return vrati;
    }

}