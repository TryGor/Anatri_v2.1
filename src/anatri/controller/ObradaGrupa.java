    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package anatri.controller;

    import anatri.model.Grupa;
    import anatri.model.Oprema;
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
    public class ObradaGrupa {

        private PreparedStatement komanda;

        public List<Grupa> dohvati(String uvjet){
             List<Grupa> l = new ArrayList<>();
             try {
                 komanda = Baza.getVeza().prepareStatement("select *from grupa where naziv like? ");
                         
                 komanda.setString(1, "%" + uvjet + "%");

                 ResultSet rs = komanda.executeQuery();
                 Grupa o;
                 Oprema p;
                 while(rs.next()){
                     o=new Grupa();
                     o.setSifra(rs.getInt("sifra"));
                     o.setNaziv(rs.getString("naziv"));
                     o.setVozilo(rs.getString("vozilo"));
                     o.setRegistracija(rs.getString("registracija"));
                     o.setOpremaVozila(rs.getString("opremaVozila"));
                  
                     l.add(o);
                 }
             } catch (Exception e) {
                  Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
             } 
             
            
        

             return l;
            }
        public Grupa dodaj(Grupa o){
              try {
                 komanda = Baza.getVeza().prepareStatement("insert into grupa (naziv,vozilo,registracija,opremavozila"
                         + ") values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                 komanda.setString(1, o.getNaziv());
                 komanda.setString(2, o.getVozilo());
                 komanda.setString(3, o.getRegistracija());
                 komanda.setString(4, o.getOpremaVozila());
                 komanda.executeUpdate();          
                  ResultSet rs = komanda.getGeneratedKeys();
                    rs.next();
                    o.setSifra(rs.getInt(1));

             } catch (Exception e) {
                  Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
             } 
             return o;
         }
        public boolean promjeni(Grupa o){
             boolean vrati=false;
             try {
                 komanda = Baza.getVeza().prepareStatement("update grupa set naziv=?,vozilo=?,registracija=?,opremavozila=? where sifra=?");
                 komanda.setString(1, o.getNaziv());
                 komanda.setString(2, o.getVozilo());
                 komanda.setString(3, o.getRegistracija());
                 komanda.setString(4, o.getOpremaVozila());
                 komanda.setInt(5, o.getSifra());

                 if(komanda.executeUpdate()==1){
                     vrati=true;
                 }

             } catch (Exception e) {
                  Logger.getLogger(ObradaVozilo.class.getName()).log(Level.SEVERE, null, e);
             } 

             return vrati;
         }
        public boolean obrisi(Grupa o){        

            boolean vrati=false;
             try {
                komanda = Baza.getVeza().prepareStatement("delete from grupa "
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
   /* boolean vrati=true;
        try {
            
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from vozilo where grupa=?");
            
            komanda.setInt(1, o.getSifra());
            
            komanda.executeUpdate();
            
            komanda = veza.prepareStatement("delete from grupa where sifra=?");
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

}*/   