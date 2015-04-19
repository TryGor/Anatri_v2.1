/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.view;

import anatri.controller.ObradaKlijent;
import anatri.model.Klijent;
import anatri.sucelja.TraziDatum;
import anatri.utility.Pomocno;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author TryGor
 */
public class Klijenti extends javax.swing.JFrame implements TraziDatum{
    private ObradaKlijent obrada;
    private Klijent odabrano;
    private Date datumRodenjaOdabrano;
    private SimpleDateFormat df;

    /**
     * Creates new form Klijenti
     */
    public Klijenti() {
        initComponents();
        setLocationRelativeTo(null);
        obrada=new ObradaKlijent();
        lista.setModel(new DefaultListModel<Klijent>());
       setTitle("Anatri Rent A Car v2.1 Klijenti: " + 
               Pomocno.getOperater().getImePrezime());
        
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM);
        datum.setText(df.format(new Date()));
        
        SatNit t = new SatNit(datum);
        t.start();
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datumRodenja = new javax.swing.JTextField();
        uvjet = new javax.swing.JTextField();
        akcijaOdustani = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        akcijaDodajNovi = new javax.swing.JButton();
        akcijaTrazi = new javax.swing.JButton();
        akcijaPromjeni = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        akcijaObrisi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adresa = new javax.swing.JTextField();
        ime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oib = new javax.swing.JTextField();
        prezime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mjesto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        brojVozacke = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        brojOsobne = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        datum = new javax.swing.JLabel();
        akcijaDatumRodenja = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        izlaz = new javax.swing.JMenuItem();
        promjenaKorisnika = new javax.swing.JMenuItem();
        pomoc = new javax.swing.JMenu();
        oNama = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        datumRodenja.setEditable(false);

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

        jLabel7.setText("Adresa");

        jLabel2.setText("Ime");

        jLabel8.setText("OIB");

        jLabel5.setText("Prezime");

        jLabel6.setText("Datum rođenja");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/logo.png"))); // NOI18N

        jLabel10.setText("Mjesto");

        jLabel11.setText("Broj vozačke dozvole");

        jLabel12.setText("Broj osobne iskaznice");

        jLabel13.setText("E-mail");

        jLabel14.setText("Broj Telefona");

        jToolBar1.setBackground(new java.awt.Color(0, 204, 204));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        datum.setMaximumSize(new java.awt.Dimension(200, 40));
        jToolBar1.add(datum);

        akcijaDatumRodenja.setText("Odaberite datum");
        akcijaDatumRodenja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDatumRodenjaActionPerformed(evt);
            }
        });

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
                        .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(akcijaPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(akcijaObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(oib)
                                        .addComponent(ime)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(brojVozacke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(mjesto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(akcijaDatumRodenja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(datumRodenja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(brojOsobne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(prezime)
                                    .addComponent(adresa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brojOsobne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mjesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brojVozacke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(datumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(akcijaDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akcijaDodajNovi)
                    .addComponent(akcijaPromjeni)
                    .addComponent(akcijaOdustani)
                    .addComponent(akcijaObrisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();
        
        Klijent o = new Klijent();
        
        if(ime.getText().trim().isEmpty()){
            greska(ime, "Obavezno unijeti ime");
            return;
        }

        if(prezime.getText().trim().isEmpty()){
            greska(prezime, "Obavezno unijeti prezime");
            return;
        }
        if(brojOsobne.getText().trim().isEmpty()){
            greska(brojOsobne, "Obavezno unijeti broj osobne iskaznice");
            return;
        }
        
        if(brojVozacke.getText().trim().isEmpty()){
            greska(brojVozacke, "Obavezno unijeti broj vozačke dozvole");
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
        if(datumRodenja.getText().trim().isEmpty()){
           
        /*
        try {
            o.setDatumRodenja(df.parse(datumRodenja.getText().trim().replace(" ","")));
        } catch (Exception e) {
            greska(datumRodenja, "datum nije dobrog formata");
            return;
        }
        }else{
            o.setDatumRodenja(null);*/
        }
        o=popuni(o);

        o=obrada.dodaj(o);
        if(o==null){
            //obavijest
            return;
        }
        DefaultListModel<Klijent> m =(DefaultListModel<Klijent>) lista.getModel();
        m.addElement(o);

        // System.out.println(o.getSifra());
    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed

        cistiPolja();

        List<Klijent> entiteti = obrada.
        dohvati(uvjet.getText());

        DefaultListModel<Klijent> m = new DefaultListModel<>();
        for (Klijent e : entiteti) {
            m.addElement(e);
        }
        lista.setModel(m);
    }//GEN-LAST:event_akcijaTraziActionPerformed

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
         if(brojOsobne.getText().trim().isEmpty()){
            greska(brojOsobne, "Obavezno unijeti broj osobne iskaznice");
            return;
        }
        
        if(brojVozacke.getText().trim().isEmpty()){
            greska(brojVozacke, "Obavezno unijeti broj vozačke dozvole");
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
        odabrano=popuni(odabrano);

        //promjena u bazi
        if(!obrada.promjeni(odabrano)){
            return;
        }

        //dodavanje/postavljanje
        //nekada ne radi dobro
        lista.repaint();
        //manje optimizirano
        // akcijaTraziActionPerformed(evt);
        /*
        DefaultListModel<Operater> m = (DefaultListModel<Operater>) lista.getModel();

        Enumeration<Operater> e = m.elements();
        Operater o;
        while(e.hasMoreElements()){
            o=e.nextElement();
            if(o.getSifra()==odabrano.getSifra()){
                System.out.println(" treba zamijeniti " + o.getPrezime() + " u " +
                    odabrano.getPrezime());
                break;
            }
        }
        */
    }//GEN-LAST:event_akcijaPromjeniActionPerformed
    private Klijent popuni(Klijent o){
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM_UNOS);
        o.setIme(ime.getText());
        o.setPrezime(prezime.getText());
        o.setOib(oib.getText());
        o.setAdresa(adresa.getText());
        o.setTelefon(telefon.getText());
        o.setMjesto(mjesto.getText());
        o.setBrojosobne(brojOsobne.getText());
        o.setBrojvozacke(brojVozacke.getText());
        o.setEmail(email.getText());
        
            
        o.setDatumRodenja(datumRodenjaOdabrano);
        /*try {
            o.setDatumRodenja(df.parse(datumRodenja.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(Klijenti.class.getName()).log(Level.SEVERE, null, ex);
        }*/
          //  datumRodenja.setText(df.format(odabrano.getDatumRodenja()));
                
        return o;
    }
    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Klijent) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }

        ime.setText(odabrano.getIme());
        prezime.setText(odabrano.getPrezime());
        oib.setText(odabrano.getOib());
        email.setText(odabrano.getEmail());
        adresa.setText(odabrano.getAdresa());
        mjesto.setText(odabrano.getMjesto());
        brojOsobne.setText(odabrano.getBrojosobne());
        brojVozacke.setText(odabrano.getBrojvozacke());
        telefon.setText(odabrano.getTelefon());
        
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM_UNOS);
        try {
            datumRodenja.setText(df.format(odabrano.getDatumRodenja()));
        } catch (Exception e) {
            datumRodenja.setText("");
        }
        
    }//GEN-LAST:event_listaValueChanged

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed

        odabrano = (Klijent) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        if(JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getImePrezime() + "?","Brisanje Klijenta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        if(!obrada.obrisi(odabrano)){
            return;
        }

        DefaultListModel<Klijent> m = (DefaultListModel<Klijent>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void akcijaDatumRodenjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDatumRodenjaActionPerformed
      
        
        
      Kalendar kalendar = new Kalendar(this);
      kalendar.setVisible(true);
       // System.out.println(kalendar.getDatum());
               
    }//GEN-LAST:event_akcijaDatumRodenjaActionPerformed

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

    private void cistiPolja(){
        
        ime.setText("");
        prezime.setText("");
        oib.setText("");
        email.setText("");
        datumRodenja.setText("");
        adresa.setText("");
        mjesto.setText("");
        brojOsobne.setText("");
        brojVozacke.setText("");
        telefon.setText("");
       
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
    private javax.swing.JButton akcijaDatumRodenja;
    private javax.swing.JButton akcijaDodajNovi;
    private javax.swing.JButton akcijaObrisi;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPromjeni;
    private javax.swing.JButton akcijaTrazi;
    private javax.swing.JTextField brojOsobne;
    private javax.swing.JTextField brojVozacke;
    private javax.swing.JLabel datum;
    private javax.swing.JTextField datumRodenja;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ime;
    private javax.swing.JMenuItem izlaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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

    @Override
    public void setDatum(Date datum) {
        SimpleDateFormat df =new SimpleDateFormat(Pomocno.FORMAT_DATUM);
        
         if(odabrano==null){
            }else{ 
            datumRodenja.setText(df.format(datum));
            return;
            
        }
        
        datumRodenja.setText(df.format(datum));
        datumRodenjaOdabrano=datum;
    }

    @Override
    public Date getDatum() {
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM);
        
        if(odabrano==null){
            return null;
            
        }
        else{ 
            
        return odabrano.getDatumRodenja();
        
    }

   
}
}
