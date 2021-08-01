
/**
 *
 * @author digitcal_edition_world
 */
public class at_avrat_silah extends javax.swing.JFrame {

    /**
     * Creates new form at_avrat_silah
     */
    public at_avrat_silah() {
        initComponents();
        jpanel_oyun_alani.setVisible(false);
        jpanel_skor_alani.setVisible(false);
    }
    String ad = "";
    int myskor = 0, makinaskor = 0, my = 0, makina = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_oyuncu_bilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfield_my_adi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jpanel_oyun_alani = new javax.swing.JPanel();
        button_resim_my = new javax.swing.JButton();
        button_resim_makina = new javax.swing.JButton();
        button_oyna = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combobox_my = new javax.swing.JComboBox<>();
        combobox_makina = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpanel_skor_alani = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_my_skor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_makina_skor = new javax.swing.JLabel();
        jbutton_yenioyun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel_oyuncu_bilgi.setBackground(new java.awt.Color(153, 153, 255));
        jpanel_oyuncu_bilgi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jpanel_oyuncu_bilgi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Oyuncu Adı: ");
        jpanel_oyuncu_bilgi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        textfield_my_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_my_adiActionPerformed(evt);
            }
        });
        jpanel_oyuncu_bilgi.add(textfield_my_adi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Başla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpanel_oyuncu_bilgi.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 130, 90));

        jpanel_oyun_alani.setBackground(new java.awt.Color(153, 255, 255));
        jpanel_oyun_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jpanel_oyun_alani.setForeground(new java.awt.Color(255, 255, 204));
        jpanel_oyun_alani.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_resim_my.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_resim_my.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resim_myActionPerformed(evt);
            }
        });
        jpanel_oyun_alani.add(button_resim_my, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 150));

        button_resim_makina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_resim_makina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resim_makinaActionPerformed(evt);
            }
        });
        jpanel_oyun_alani.add(button_resim_makina, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 210, 150));

        button_oyna.setBackground(new java.awt.Color(0, 153, 0));
        button_oyna.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        button_oyna.setForeground(new java.awt.Color(51, 0, 51));
        button_oyna.setText("Oyna");
        button_oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_oynaActionPerformed(evt);
            }
        });
        jpanel_oyun_alani.add(button_oyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 430, 60));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("MY SEÇİM");
        jpanel_oyun_alani.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("MAKİNA SEÇİMİ");
        jpanel_oyun_alani.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        combobox_my.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        combobox_my.setForeground(new java.awt.Color(51, 51, 255));
        combobox_my.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AT", "AVRAT", "SİLAH" }));
        combobox_my.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_myİtemStateChanged(evt);
            }
        });
        combobox_my.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_myActionPerformed(evt);
            }
        });
        jpanel_oyun_alani.add(combobox_my, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        combobox_makina.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        combobox_makina.setForeground(new java.awt.Color(0, 51, 51));
        combobox_makina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AT ", "AVRAT", "SİLAH" }));
        combobox_makina.setEnabled(false);
        combobox_makina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_makinaActionPerformed(evt);
            }
        });
        jpanel_oyun_alani.add(combobox_makina, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Durum;");
        jpanel_oyun_alani.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Bilgisayar Kazandı");
        jpanel_oyun_alani.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 201, -1));

        jpanel_skor_alani.setBackground(new java.awt.Color(0, 0, 255));
        jpanel_skor_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jpanel_skor_alani.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Oyuncu: ");
        jpanel_skor_alani.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        label_my_skor.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label_my_skor.setForeground(new java.awt.Color(255, 255, 255));
        label_my_skor.setText("0");
        jpanel_skor_alani.add(label_my_skor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 19, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bilgisayar:");
        jpanel_skor_alani.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        label_makina_skor.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label_makina_skor.setForeground(new java.awt.Color(255, 255, 255));
        label_makina_skor.setText("0");
        jpanel_skor_alani.add(label_makina_skor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 22, -1));

        jbutton_yenioyun.setBackground(new java.awt.Color(255, 255, 0));
        jbutton_yenioyun.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jbutton_yenioyun.setText("Yeni Oyun");
        jbutton_yenioyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_yenioyunActionPerformed(evt);
            }
        });
        jpanel_skor_alani.add(jbutton_yenioyun, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 360, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanel_skor_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jpanel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanel_oyuncu_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_oyuncu_bilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_oyun_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpanel_skor_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_resim_makinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resim_makinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_resim_makinaActionPerformed

    private void combobox_myİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_myİtemStateChanged
        if (String.valueOf(combobox_my.getSelectedItem()) == "AT") {
            button_resim_my.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/at.png")));
        } else if (String.valueOf(combobox_my.getSelectedItem()) == "AVRAT") {
            button_resim_my.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/avrat.png")));
        } else if (String.valueOf(combobox_my.getSelectedItem()) == "SİLAH") {
            button_resim_my.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/silah.png")));
        }

    }//GEN-LAST:event_combobox_myİtemStateChanged

    private void button_oynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_oynaActionPerformed
        makina = (int) (Math.random() * 3);
        combobox_makina.setSelectedIndex(makina);
        if (makina == 0) {
            button_resim_makina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/at.png")));
        } else if (makina == 1) {
            button_resim_makina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/avrat.png")));
        } else if (makina == 2) {
            button_resim_makina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/silah.png")));
        }
        kontrol();
    }//GEN-LAST:event_button_oynaActionPerformed

    private void jbutton_yenioyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_yenioyunActionPerformed
        myskor = 0;
        makinaskor = 0;
        ad = "";
        jpanel_oyun_alani.setVisible(false);
        jpanel_skor_alani.setVisible(false);
        combobox_makina.setSelectedIndex(-1);
        combobox_my.setSelectedIndex(-1);
        jpanel_oyuncu_bilgi.setEnabled(true);
        textfield_my_adi.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jbutton_yenioyunActionPerformed

    private void button_resim_myActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resim_myActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_resim_myActionPerformed

    private void combobox_myActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_myActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_myActionPerformed

    private void textfield_my_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_my_adiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_my_adiActionPerformed

    private void combobox_makinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_makinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_makinaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ad = textfield_my_adi.getText();
        jLabel6.setText(ad);
        textfield_my_adi.setEnabled(false);
        jpanel_oyuncu_bilgi.setEnabled(false);
        jpanel_oyun_alani.setVisible(true);
        jpanel_skor_alani.setVisible(true);
        jButton1.setEnabled(false);
        button_resim_my.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/Adsız.png")));
        button_resim_makina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atavratsilah_resim/Adsız.png")));

    }//GEN-LAST:event_jButton1ActionPerformed
    public void kontrol() {
        if (my == 0 & makina == 0 || my == 1 & makina == 1 & my == 2 & makina == 2) {
            jLabel5.setText("berabere");
        } else if (my == 0 & makina == 1 || my == 1 & makina == 2 || my == 2 & makina == 0) {
            jLabel5.setText("makina kazandı");
            makinaskor++;
        } else if (my == 0 & makina == 2 || my == 1 & makina == 0 || my == 2 & makina == 1) {
            jLabel5.setText(ad + " kazandı");
            myskor++;
        }
        label_my_skor.setText(String.valueOf(myskor));
        label_makina_skor.setText(String.valueOf(makinaskor));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(at_avrat_silah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(at_avrat_silah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(at_avrat_silah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(at_avrat_silah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new at_avrat_silah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_oyna;
    private javax.swing.JButton button_resim_makina;
    private javax.swing.JButton button_resim_my;
    private javax.swing.JComboBox<String> combobox_makina;
    private javax.swing.JComboBox<String> combobox_my;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbutton_yenioyun;
    private javax.swing.JPanel jpanel_oyun_alani;
    private javax.swing.JPanel jpanel_oyuncu_bilgi;
    private javax.swing.JPanel jpanel_skor_alani;
    private javax.swing.JLabel label_makina_skor;
    private javax.swing.JLabel label_my_skor;
    private javax.swing.JTextField textfield_my_adi;
    // End of variables declaration//GEN-END:variables
}
