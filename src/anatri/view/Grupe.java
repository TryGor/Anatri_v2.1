/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.view;

import anatri.controller.ObradaGrupa;
import anatri.model.Grupa;
import anatri.utility.Pomocno;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author TryGor
 */
public class Grupe extends javax.swing.JFrame {

    private Grupa odabrano;
    private ObradaGrupa obradaGrupa;
  
    public Grupe() {
        initComponents();

        obradaGrupa = new ObradaGrupa();
        
        setLocationRelativeTo(null);
        
        lista.setModel((new DefaultListModel<Grupa>()));
        setTitle("Anatri Rent A Car v2.1 Grupe vozila: " + 
               Pomocno.getOperater().getImePrezime());
        
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM);
        datum.setText(df.format(new Date()));
             
        SatNit t = new SatNit(datum);
        t.start();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uvjet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        akcijaTrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jToolBar1 = new javax.swing.JToolBar();
        datum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vozilo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        registracija = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        naziv = new javax.swing.JTextField();
        akcijaDodajNovi = new javax.swing.JButton();
        akcijaPromjeni = new javax.swing.JButton();
        akcijaObriši = new javax.swing.JButton();
        akcijaOdustani = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        oprema = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        izlaz = new javax.swing.JMenuItem();
        promjenaKorisnika = new javax.swing.JMenuItem();
        pomoc = new javax.swing.JMenu();
        oNama = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Uvjet * za ispis svih grupa");

        akcijaTrazi.setText("Traži");
        akcijaTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziActionPerformed(evt);
            }
        });

        lista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        jToolBar1.setBackground(new java.awt.Color(0, 204, 204));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        datum.setMaximumSize(new java.awt.Dimension(200, 40));
        jToolBar1.add(datum);

        jLabel2.setText("Naziv grupe");

        jLabel3.setText("Naziv vozila");

        jLabel4.setText("Registracija");

        akcijaDodajNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/new-.png"))); // NOI18N
        akcijaDodajNovi.setText("Dodaj novu");
        akcijaDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNoviActionPerformed(evt);
            }
        });

        akcijaPromjeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Change.png"))); // NOI18N
        akcijaPromjeni.setText("Promjeni ");
        akcijaPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPromjeniActionPerformed(evt);
            }
        });

        akcijaObriši.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/trash.png"))); // NOI18N
        akcijaObriši.setText("Obriši");
        akcijaObriši.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaObrišiActionPerformed(evt);
            }
        });

        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/cancel.png"))); // NOI18N
        akcijaOdustani.setText("Odustani");
        akcijaOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdustaniActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/logo.png"))); // NOI18N

        jLabel5.setText("Oprema vozila");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Groups.png"))); // NOI18N

        oprema.setBackground(new java.awt.Color(0, 204, 204));
        oprema.setColumns(20);
        oprema.setRows(5);
        jScrollPane2.setViewportView(oprema);

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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(akcijaPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(akcijaObriši, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(naziv)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vozilo)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(registracija, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(akcijaTrazi))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akcijaOdustani)
                            .addComponent(akcijaObriši)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vozilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registracija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akcijaDodajNovi)
                            .addComponent(akcijaPromjeni))
                        .addGap(2, 2, 2)))
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed
   
        cistiPolja();
        
        List<Grupa> grupe = obradaGrupa.
                dohvati(uvjet.getText());
       
        DefaultListModel<Grupa> m = new DefaultListModel<>();
        for (Grupa grupa : grupe) {
            m.addElement(grupa);
        }
        lista.setModel(m);
        
    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Grupa) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        naziv.setText(odabrano.getNaziv());
        vozilo.setText(odabrano.getVozilo());
        registracija.setText(odabrano.getRegistracija());
        oprema.setText(odabrano.getOpremaVozila());
       
            
                
    }//GEN-LAST:event_listaValueChanged

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
       reset();
       
        Grupa o = new Grupa();
        if(naziv.getText().trim().isEmpty()){
            greska(naziv, "Obavezno unijeti naziv grupe");
            return;
        }
        
        if(vozilo.getText().trim().isEmpty()){
            greska(vozilo, "Obavezno unijeti naziv vozila");
            return;
        }
       
        if(registracija.getText().trim().isEmpty()){
            greska(registracija, "Obavezno unijeti registraciju vozila");
            return;
        }
        
        if(oprema.getText().trim().isEmpty()){
            greska(oprema, "Obavezno unijeti opremu vozila");
            return;
        }
        
        o.setNaziv(naziv.getText().trim());
        o.setVozilo(vozilo.getText().trim());
        o.setRegistracija(registracija.getText().trim());
        o.setOpremaVozila(oprema.getText().trim());
               
        o=obradaGrupa.dodaj(o);

        DefaultListModel<Grupa> m =(DefaultListModel<Grupa>) lista.getModel();
        m.addElement(o);
        
        
    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
        if(odabrano==null){
            return;
        }
        reset();
        //kontorle
        if(naziv.getText().trim().isEmpty()){
            greska(naziv, "Obavezno unijeti naziv grupe");
            return;
        }
        
        if(vozilo.getText().trim().isEmpty()){
            greska(naziv, "Obavezno unijeti naziv vozila");
            return;
        }
       
        if(registracija.getText().trim().isEmpty()){
            greska(registracija, "Obavezno unijeti registraciju vozila");
            return;
        }
        
        if(oprema.getText().trim().isEmpty()){
            greska(oprema, "Obavezno unijeti opremu vozila");
            return;
        }
        
        odabrano.setNaziv(naziv.getText().trim());
        odabrano.setVozilo(vozilo.getText().trim());
        odabrano.setRegistracija(registracija.getText().trim());
        odabrano.setOpremaVozila(oprema.getText().trim());
        
        //promjena u bazi
        if(!obradaGrupa.promjeni(odabrano)){
            return;
        }

        //dodavanje/postavljanje
        lista.repaint();
    }//GEN-LAST:event_akcijaPromjeniActionPerformed

    private void akcijaObrišiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrišiActionPerformed
       odabrano = (Grupa) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        if(JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getNaziv() + "?","Brisanje Grupe",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        if(!obradaGrupa.obrisi(odabrano)){
            return;
        }

        DefaultListModel<Grupa> m = (DefaultListModel<Grupa>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrišiActionPerformed

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

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
        naziv.setText("");
        vozilo.setText("");
        registracija.setText("");
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
    
    
        /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaDodajNovi;
    private javax.swing.JButton akcijaObriši;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPromjeni;
    private javax.swing.JButton akcijaTrazi;
    private javax.swing.JLabel datum;
    private javax.swing.JMenuItem izlaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList lista;
    private javax.swing.JTextField naziv;
    private javax.swing.JMenuItem oNama;
    private javax.swing.JTextArea oprema;
    private javax.swing.JMenu pomoc;
    private javax.swing.JMenuItem promjenaKorisnika;
    private javax.swing.JTextField registracija;
    private javax.swing.JTextField uvjet;
    private javax.swing.JTextField vozilo;
    // End of variables declaration//GEN-END:variables
}