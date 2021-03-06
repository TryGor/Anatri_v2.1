/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anatri.view;

import anatri.controller.ObradaOprema;
import anatri.model.Oprema;
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
public class Opreme extends javax.swing.JFrame {

    private ObradaOprema obrada;
    private Oprema odabrano;

    /**
     * Creates new form Oprema
     */
    public Opreme() {
        initComponents();

        setLocationRelativeTo(null);
        obrada = new ObradaOprema();
        lista.setModel(new DefaultListModel<Oprema>());
        setTitle("Anatri Rent A Car v2.1 Oprema Vozila: "
                + Pomocno.getOperater().getImePrezime());

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
        jLabel2 = new javax.swing.JLabel();
        naziv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nazivVozila = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        datum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        akcijaPromjeni = new javax.swing.JButton();
        akcijaObrisi = new javax.swing.JButton();
        akcijaDodajNovi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vrijednost = new javax.swing.JTextArea();
        autoriziraj = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        izlaz = new javax.swing.JMenuItem();
        promjenaKorisnika = new javax.swing.JMenuItem();
        pomoc = new javax.swing.JMenu();
        oNama = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Uvjet (* za sve)");

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

        jLabel2.setText("Naziv opreme");

        jLabel8.setText("Vrijednost opreme");

        jLabel5.setText("Naziv vozila");

        jToolBar1.setBackground(new java.awt.Color(0, 204, 204));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        datum.setMaximumSize(new java.awt.Dimension(200, 40));
        jToolBar1.add(datum);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/logo.png"))); // NOI18N

        akcijaPromjeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Change.png"))); // NOI18N
        akcijaPromjeni.setText("Promjeni");
        akcijaPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPromjeniActionPerformed(evt);
            }
        });

        akcijaObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/trash.png"))); // NOI18N
        akcijaObrisi.setText("Obriši");
        akcijaObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaObrisiActionPerformed(evt);
            }
        });

        akcijaDodajNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/new-.png"))); // NOI18N
        akcijaDodajNovi.setText("Dodaj novu");
        akcijaDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNoviActionPerformed(evt);
            }
        });

        vrijednost.setColumns(20);
        vrijednost.setRows(5);
        jScrollPane2.setViewportView(vrijednost);

        autoriziraj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/cancel.png"))); // NOI18N
        autoriziraj.setText("Odustani");
        autoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorizirajActionPerformed(evt);
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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(akcijaPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(akcijaObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(autoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uvjet, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(akcijaTrazi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nazivVozila, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(naziv, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addContainerGap())))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(175, 175, 175)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(nazivVozila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akcijaObrisi)
                    .addComponent(akcijaPromjeni)
                    .addComponent(akcijaDodajNovi)
                    .addComponent(autoriziraj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(106, 106, 106)
                    .addComponent(jLabel5)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed

        cistiPolja();

        List<Oprema> entiteti = obrada.
                dohvatiOpremu(uvjet.getText());

        DefaultListModel<Oprema> m = new DefaultListModel<>();
        for (Oprema e : entiteti) {
            m.addElement(e);
        }
        lista.setModel(m);
    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Oprema) lista.getSelectedValue();
        if (odabrano == null) {
            return;
        }

        naziv.setText(odabrano.getNaziv());
        nazivVozila.setText(odabrano.getNazivVozila());
        vrijednost.setText(odabrano.getVrijednost());

    }//GEN-LAST:event_listaValueChanged

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();

        if (naziv.getText().trim().isEmpty()) {
            greska(naziv, "Obavezno unijeti naziv opreme");
            return;
        }

        if (nazivVozila.getText().trim().isEmpty()) {
            greska(nazivVozila, "Obavezno unijeti naziv vozila");
            return;
        }

        Oprema o = new Oprema();

        o.setNaziv(naziv.getText().trim());
        o.setNazivVozila(nazivVozila.getText().trim());
        o.setVrijednost(vrijednost.getText().trim());

        o = obrada.dodaj(o);

        DefaultListModel<Oprema> m = (DefaultListModel<Oprema>) lista.getModel();
        m.addElement(o);
    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
        if (odabrano == null) {
            return;
        }
        reset();
        //kontorle

        if (naziv.getText().trim().isEmpty()) {
            greska(naziv, "Obavezno unijeti naziv opreme");
            return;
        }

        if (nazivVozila.getText().trim().isEmpty()) {
            greska(nazivVozila, "Obavezno unijeti naziv vozila");
            return;
        }
        odabrano.setNaziv(naziv.getText().trim());
        odabrano.setNazivVozila(nazivVozila.getText().trim());
        odabrano.setVrijednost(vrijednost.getText().trim());

        //promjena u bazi
        if (!obrada.promjeni(odabrano)) {
            return;
        }

        //dodavanje/postavljanje
        //nekada ne radi dobro
        lista.repaint();
    }//GEN-LAST:event_akcijaPromjeniActionPerformed

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed
        odabrano = (Oprema) lista.getSelectedValue();
        if (odabrano == null) {
            return;
        }
        if (JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getNaziv() + "?", "Brisanje Opreme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        if (!obrada.obrisi(odabrano)) {
            return;
        }

        DefaultListModel<Oprema> m = (DefaultListModel<Oprema>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

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

    private void autorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorizirajActionPerformed
        
        dispose();
    }//GEN-LAST:event_autorizirajActionPerformed

    private Oprema popuni(Oprema o) {

        o.setNaziv(naziv.getText());
        o.setNazivVozila(nazivVozila.getText());
        o.setVrijednost(vrijednost.getText());

        return o;
    }

    private void cistiPolja() {

        naziv.setText("");
        nazivVozila.setText("");
        vrijednost.setText("");

    }

    private void reset() {

        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof JTextField || c instanceof JPasswordField) {
                JComponent jc = (JComponent) c;
                jc.setBackground(Color.white);
                jc.setToolTipText("");
            }
        }
    }

    private void greska(JComponent komponenta, String obavijest) {
        komponenta.setBackground(Color.red);
        komponenta.requestFocus();
        komponenta.setToolTipText(obavijest);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaDodajNovi;
    private javax.swing.JButton akcijaObrisi;
    private javax.swing.JButton akcijaPromjeni;
    private javax.swing.JButton akcijaTrazi;
    private javax.swing.JButton autoriziraj;
    private javax.swing.JLabel datum;
    private javax.swing.JMenuItem izlaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList lista;
    private javax.swing.JTextField naziv;
    private javax.swing.JTextField nazivVozila;
    private javax.swing.JMenuItem oNama;
    private javax.swing.JMenu pomoc;
    private javax.swing.JMenuItem promjenaKorisnika;
    private javax.swing.JTextField uvjet;
    private javax.swing.JTextArea vrijednost;
    // End of variables declaration//GEN-END:variables
}
