/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.view;

import anatri.controller.ObradaDjelatnik;
import anatri.model.Djelatnik;
import anatri.model.Klijent;
import anatri.utility.Pomocno;
import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetSerializer;
import java.awt.Color;
import java.awt.Component;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;



/**
 *
 * @author TryGor
 */
public class Djelatnici extends javax.swing.JFrame {
    private ObradaDjelatnik obrada;
    private Djelatnik odabrano;

    /**
     * Creates new form Djelatnici
     */
    public Djelatnici() {
        initComponents();
        setLocationRelativeTo(null);
        obrada=new ObradaDjelatnik();
        lista.setModel(new DefaultListModel<Klijent>());
       setTitle("Anatri Rent A Car v2.1 Djelatnici: " + 
               Pomocno.getOperater().getImePrezime());
        
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM);
        datum.setText(df.format(new Date()));
        
        SatNit t = new SatNit(datum);
        t.start();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uvjet = new javax.swing.JTextField();
        akcijaOdustani = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        akcijaDodajNovi = new javax.swing.JButton();
        akcijaTrazi = new javax.swing.JButton();
        akcijaPromjeni = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        akcijaObrisi = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mjesto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adresa = new javax.swing.JTextField();
        ime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oib = new javax.swing.JTextField();
        prezime = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        datum = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        iban = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        izlaz = new javax.swing.JMenuItem();
        promjenaKorisnika = new javax.swing.JMenuItem();
        pomoc = new javax.swing.JMenu();
        oNama = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/cancel.png"))); // NOI18N
        akcijaOdustani.setText("Odustani");
        akcijaOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdustaniActionPerformed(evt);
            }
        });

        jLabel1.setText("Uvjet (* za sve)");

        akcijaDodajNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/new-.png"))); // NOI18N
        akcijaDodajNovi.setText("Dodaj novog");
        akcijaDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNoviActionPerformed(evt);
            }
        });

        akcijaTrazi.setText("Traži");
        akcijaTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziActionPerformed(evt);
            }
        });

        akcijaPromjeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Change.png"))); // NOI18N
        akcijaPromjeni.setText("Promjeni");
        akcijaPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPromjeniActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/logo.png"))); // NOI18N

        lista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        akcijaObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/trash.png"))); // NOI18N
        akcijaObrisi.setText("Obriši");
        akcijaObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaObrisiActionPerformed(evt);
            }
        });

        jLabel14.setText("Broj Telefona");

        jLabel10.setText("Mjesto");

        jLabel13.setText("E-mail");

        jLabel7.setText("Adresa");

        jLabel2.setText("Ime");

        jLabel8.setText("OIB");

        jLabel5.setText("Prezime");

        jToolBar1.setBackground(new java.awt.Color(0, 204, 204));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        datum.setMaximumSize(new java.awt.Dimension(200, 40));
        jToolBar1.add(datum);

        jLabel15.setText("IBAN");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Anatri");

        izlaz.setText("Izlaz");
        izlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izlazActionPerformed(evt);
            }
        });
        jMenu1.add(izlaz);

        promjenaKorisnika.setText("Promijeni korisnika");
        promjenaKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promjenaKorisnikaActionPerformed(evt);
            }
        });
        jMenu1.add(promjenaKorisnika);

        jMenuBar1.add(jMenu1);

        pomoc.setText("Pomoć");
        pomoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomocActionPerformed(evt);
            }
        });

        oNama.setText("O Nama");
        oNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oNamaActionPerformed(evt);
            }
        });
        pomoc.add(oNama);

        jMenuBar1.add(pomoc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(akcijaPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(akcijaObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uvjet)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(akcijaTrazi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(95, 95, 95))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oib, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(mjesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iban))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prezime)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(adresa, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(51, 51, 51))))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mjesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akcijaDodajNovi)
                    .addComponent(akcijaPromjeni)
                    .addComponent(akcijaObrisi)
                    .addComponent(akcijaOdustani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed
       cistiPolja();

        List<Djelatnik> entiteti = obrada.
        dohvati(uvjet.getText());

        DefaultListModel<Djelatnik> m = new DefaultListModel<>();
        for (Djelatnik e : entiteti) {
            m.addElement(e);
        }
        lista.setModel(m);
    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();
        if(ime.getText().trim().isEmpty()){
            greska(ime, "Obavezno unijeti ime");
            return;
        }

        if(prezime.getText().trim().isEmpty()){
            greska(prezime, "Obavezno unijeti prezime");
            return;
        }
               
        if(telefon.getText().trim().isEmpty()){
            greska(telefon, "Obavezno unijeti broj telefona");
            return;
        }
        
        if(adresa.getText().trim().isEmpty()){
            greska(adresa, "Obavezno unijeti adresu");
            return;
        }
        
        if(mjesto.getText().trim().isEmpty()){
            greska(mjesto, "Obavezno unijeti mjesto");
            return;
        }
        
         if(iban.getText().trim().isEmpty()){
            greska(iban, "Obavezno unijeti mjesto");
            return;
        }
        
        
        Djelatnik o = new Djelatnik();
        o=popuni(o);

        o=obrada.dodaj(o);
        if(o==null){
            //obavijest
            return;
        }
        DefaultListModel<Djelatnik> m =(DefaultListModel<Djelatnik>) lista.getModel();
        m.addElement(o);
    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
       if(odabrano==null){
            return;
        }
        reset();
        //kontorle
        if(ime.getText().trim().isEmpty()){
            greska(ime, "Obavezno unijeti ime");
            return;
        }

        if(prezime.getText().trim().isEmpty()){
            greska(prezime, "Obavezno unijeti prezime");
            return;
         }
                
        if(telefon.getText().trim().isEmpty()){
            greska(telefon, "Obavezno unijeti broj telefona");
            return;
        }
        
        if(adresa.getText().trim().isEmpty()){
            greska(adresa, "Obavezno unijeti adresu");
            return;
        }
        
        if(mjesto.getText().trim().isEmpty()){
            greska(mjesto, "Obavezno unijeti mjesto");
            return;
        }
        
        if(iban.getText().trim().isEmpty()){
            greska(iban, "Obavezno unijeti mjesto");
            return;
        }
        odabrano=popuni(odabrano);

        //promjena u bazi
        if(!obrada.promjeni(odabrano)){
            return;
        }

        //dodavanje/postavljanje
        //nekada ne radi dobro
        lista.repaint();
    }//GEN-LAST:event_akcijaPromjeniActionPerformed

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed
      odabrano = (Djelatnik) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        if(JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getImePrezime() + "?","Brisanje Djelatnika",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        if(!obrada.obrisi(odabrano)){
            return;
        }

        DefaultListModel<Djelatnik> m = (DefaultListModel<Djelatnik>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
       
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Djelatnik) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        
        ime.setText(odabrano.getIme());
        prezime.setText(odabrano.getPrezime());
        oib.setText(odabrano.getOib());
        email.setText(odabrano.getEmail());
        adresa.setText(odabrano.getAdresa());
        mjesto.setText(odabrano.getMjesto());
        telefon.setText(odabrano.getTelefon());
        iban.setText(odabrano.getIban());
        
    }//GEN-LAST:event_listaValueChanged

    private void izlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izlazActionPerformed
        dispose();
    }//GEN-LAST:event_izlazActionPerformed

    private void promjenaKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promjenaKorisnikaActionPerformed
        new Autorizacija().setVisible(true);
        dispose();
    }//GEN-LAST:event_promjenaKorisnikaActionPerformed

    private void oNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oNamaActionPerformed
        new Onama().setVisible(true);
        dispose();
    }//GEN-LAST:event_oNamaActionPerformed

    private void pomocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomocActionPerformed
        System.out.println("Krećem");
        new Onama().setVisible(true);
    }//GEN-LAST:event_pomocActionPerformed
       private Djelatnik popuni(Djelatnik o){
        
        o.setIme(ime.getText());
        o.setPrezime(prezime.getText());
        o.setOib(oib.getText());
        o.setAdresa(adresa.getText());
        o.setTelefon(telefon.getText());
        o.setMjesto(mjesto.getText());
        o.setEmail(email.getText());
        o.setIban(iban.getText());
 
        return o;
    }
    
    private void cistiPolja(){
        
        ime.setText("");
        prezime.setText("");
        oib.setText("");
        email.setText("");
        adresa.setText("");
        mjesto.setText("");
        telefon.setText("");
        iban.setText("");
       
    }
     private void reset() {
       
        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof JTextField || c instanceof JPasswordField){
                JComponent jc = (JComponent) c;
                jc.setBackground(Color.white);
                jc.setToolTipText("");
            }
        }
    }
      private void greska(JComponent komponenta, String obavijest){
           komponenta.setBackground(Color.red);
           komponenta.requestFocus();
           komponenta.setToolTipText(obavijest);
           
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresa;
    private javax.swing.JButton akcijaDodajNovi;
    private javax.swing.JButton akcijaObrisi;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPromjeni;
    private javax.swing.JButton akcijaTrazi;
    private javax.swing.JLabel datum;
    private javax.swing.JTextField email;
    private javax.swing.JTextField iban;
    private javax.swing.JTextField ime;
    private javax.swing.JMenuItem izlaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList lista;
    private javax.swing.JTextField mjesto;
    private javax.swing.JMenuItem oNama;
    private javax.swing.JTextField oib;
    private javax.swing.JMenu pomoc;
    private javax.swing.JTextField prezime;
    private javax.swing.JMenuItem promjenaKorisnika;
    private javax.swing.JTextField telefon;
    private javax.swing.JTextField uvjet;
    // End of variables declaration//GEN-END:variables
}
