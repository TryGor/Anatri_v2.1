/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.controller;

import anatri.model.Osoba;
import anatri.model.Rezervacija;
import anatri.utility.Baza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TryGor
 */
public class ObradaRezervacija {
    
    private PreparedStatement komanda;
    
    public List<Rezervacija> dohvati(String uvjet){
         List<Rezervacija> l = new ArrayList<>();
         try {
             komanda = Baza.getVeza().prepareStatement("select a.sifra, a.naziv, a.nazivVozila, a.cijenaPoDanu, a.brojDanaNajma, "
                    + "a.ukupnaCijena, a.datumPodizanja, a.datumVracanja, a.popust, b.sifra as sifraosobe,"
                    + "b.oib,b.ime,b.prezime,b.adresa,b.mjesto,b.telefon from rezervacija a inner join osoba b on a.osoba=b.sifra where concat(b.ime, ' ', b.prezime) like ?");
             komanda.setString(1, "%" + uvjet + "%");
             
             ResultSet rs = komanda.executeQuery();
             Rezervacija o;
             Osoba os;
             while(rs.next()){
                 o=new Rezervacija();
                 os=new Osoba();
                 os.setOib(rs.getString("oib"));
                 os.setSifraOsobe(rs.getInt("sifraosobe"));
                 os.setIme(rs.getString("ime"));
                 os.setPrezime(rs.getString("prezime"));
                 os.setAdresa(rs.getString("adresa"));
                 os.setMjesto(rs.getString("mjesto"));
                 os.setTelefon(rs.getString("telefon"));
                 o.setOsoba(os);
                 o.setSifra(rs.getInt("sifra"));
                 o.setNaziv(rs.getString("naziv"));
                 o.setNazivVozila(rs.getString("nazivVozila"));
                 o.setCijenaPoDanu(rs.getBigDecimal("cijenaPoDanu"));
                 o.setBrojDanaNajma(rs.getInt("brojDanaNajma"));
                 o.setUkupnaCijena(rs.getBigDecimal("ukupnaCijena"));
                 
                 try {
                     o.setDatumPodizanja(new Date(rs.getDate("datumpodizanja").getTime()));
                } catch (Exception e) {
                    o.setDatumPodizanja(null);
                }
                 try {
                     o.setDatumVracanja(new Date(rs.getDate("datumvracanja").getTime()));
                } catch (Exception e) {
                    o.setDatumVracanja(null);
                }
                 
                 o.setPopust(rs.getBigDecimal("popust"));
               
                 l.add(o);
             }
         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         
         return l;
        }
    public Rezervacija dodaj(Rezervacija o){
          try {
              
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into osoba (oib,ime,prezime,adresa,mjesto,telefon"
                    + ") values (?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            
            komanda.setString(1, o.getOsoba().getOib());
            komanda.setString(2, o.getOsoba().getIme());
            komanda.setString(3, o.getOsoba().getPrezime());
            komanda.setString(4, o.getOsoba().getAdresa());
            komanda.setString(5, o.getOsoba().getMjesto());
            komanda.setString(6, o.getOsoba().getTelefon());
                      
            komanda.executeUpdate();
            
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.getOsoba().setSifraOsobe(rs.getInt(1));
              
             komanda = Baza.getVeza().prepareStatement("insert into rezervacija (osoba,naziv,nazivVozila,cijenapodanu,brojdananajma,ukupnacijena,"
                     + "datumpodizanja,datumvracanja,popust"
                     + ") values (?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
             komanda.setInt(1, o.getOsoba().getSifraOsobe());
             komanda.setString(2, o.getNaziv());
             komanda.setString(3, o.getNazivVozila());
             komanda.setInt(4, o.getBrojDanaNajma());
             komanda.setBigDecimal(5, o.getCijenaPoDanu());
             komanda.setBigDecimal(6, o.getUkupnaCijena());
             if(o.getDatumPodizanja()==null){
                komanda.setDate(7, null);
            }else{
                 komanda.setDate(7,new java.sql.Date(o.getDatumPodizanja().getTime()));
            }
             if(o.getDatumVracanja()==null){
                komanda.setDate(8, null);
            }else{
                 komanda.setDate(8,new java.sql.Date(o.getDatumVracanja().getTime()));
            }
             komanda.setBigDecimal(9, o.getPopust());
           
             komanda.executeUpdate();          
            
              veza.commit();

         } catch (Exception e) {
              Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
         } 
         return o;
     }
    
    public boolean promjeni(Rezervacija o){
         boolean vrati=false;
         try {
             Connection veza = Baza.getVeza();
             veza.setAutoCommit(false);
             
             komanda =  veza.prepareStatement("update rezervacija set naziv=?, nazivVozila=?,cijenapodanu=?,"
                     + "brojdananajma=?,ukupnacijena=?,datumpodizanja=?,datumvracanja=?,popust=? where sifra=?");
             komanda.setString(1, o.getNaziv());
             komanda.setString(2, o.getNazivVozila());
             komanda.setBigDecimal(3, o.getCijenaPoDanu());
             komanda.setInt(4, o.getBrojDanaNajma());
             komanda.setBigDecimal(5, o.getUkupnaCijena());
             if(o.getDatumPodizanja()==null){
                komanda.setDate(6, null);
            }else{
                 komanda.setDate(6,new java.sql.Date(o.getDatumPodizanja().getTime()));
            }
             if(o.getDatumVracanja()==null){
                komanda.setDate(7, null);
            }else{
                 komanda.setDate(7,new java.sql.Date(o.getDatumVracanja().getTime()));
            }
             komanda.setBigDecimal(8, o.getPopust());
             komanda.setInt(9, o.getSifra());
             komanda.executeUpdate();          
              
             komanda = veza.prepareStatement("update osoba set oib=?, ime=?, "
                    + " prezime=?, telefon=?, adresa=?, mjesto=? where sifra=?");
             komanda.setString(1, o.getOsoba().getOib());
             komanda.setString(2, o.getOsoba().getIme());
             komanda.setString(3, o.getOsoba().getPrezime());
             komanda.setString(4, o.getOsoba().getTelefon());
             komanda.setString(5, o.getOsoba().getAdresa());
             komanda.setString(6, o.getOsoba().getMjesto());
             komanda.setInt(7, o.getOsoba().getSifraOsobe());
             komanda.executeUpdate();
            
             veza.commit();
              
             if(komanda.executeUpdate()==1){
                 vrati=false;
             }

         } catch (Exception e) {
              Logger.getLogger(ObradaRezervacija.class.getName()).log(Level.SEVERE, null, e);
         } 
         
         return vrati;
    }
    public boolean obrisi(Rezervacija o){
           boolean vrati=false;
             try {
                komanda = Baza.getVeza().prepareStatement("delete from rezervacija "
                              + " where sifra=?");
                komanda.setInt(1, o.getSifra()); 
                 if(komanda.executeUpdate()==1){
                     vrati=true;
                 }
             } catch (Exception e) {
                  Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, e);
             } 
             return vrati;
         }

    }
