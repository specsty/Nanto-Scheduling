
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home_label_filePemain = new javax.swing.JLabel();
        home_text_filePemain = new javax.swing.JTextField();
        home_button_filePemain = new javax.swing.JButton();
        home_label_jadwalKandidat = new javax.swing.JLabel();
        home_text_jadwalKandidat = new javax.swing.JTextField();
        home_button_jadwalKandidat = new javax.swing.JButton();
        home_label_jadwalTempat = new javax.swing.JLabel();
        home_text_jadwalTempat = new javax.swing.JTextField();
        home_button_jadwalTempat = new javax.swing.JButton();
        home_button_bikin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nanto-Scheduling");
        setBounds(new java.awt.Rectangle(5, 5, 350, 760));
        setName("home_frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(350, 760));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Data");

        home_label_filePemain.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home_label_filePemain.setForeground(new java.awt.Color(0, 255, 0));
        home_label_filePemain.setText("File Nanto");

        home_button_filePemain.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home_button_filePemain.setText("Cari");
        home_button_filePemain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_filePemainActionPerformed(evt);
            }
        });

        home_label_jadwalKandidat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home_label_jadwalKandidat.setForeground(new java.awt.Color(0, 255, 0));
        home_label_jadwalKandidat.setText("Jadwal Kandidat");

        home_button_jadwalKandidat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home_button_jadwalKandidat.setText("Cari");
        home_button_jadwalKandidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_jadwalKandidatActionPerformed(evt);
            }
        });

        home_label_jadwalTempat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home_label_jadwalTempat.setForeground(new java.awt.Color(0, 255, 0));
        home_label_jadwalTempat.setText("Jadwal Tempat");

        home_button_jadwalTempat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home_button_jadwalTempat.setText("Cari");
        home_button_jadwalTempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_jadwalTempatActionPerformed(evt);
            }
        });

        home_button_bikin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        home_button_bikin.setText("BIKIN");
        home_button_bikin.setActionCommand("");
        home_button_bikin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_bikinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addGap(223, 223, 223))
                    .addComponent(home_text_filePemain)
                    .addComponent(home_text_jadwalKandidat)
                    .addComponent(home_text_jadwalTempat)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(home_button_filePemain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(home_button_jadwalKandidat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(home_button_jadwalTempat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(home_label_filePemain)
                            .addComponent(home_label_jadwalKandidat)
                            .addComponent(home_label_jadwalTempat)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(home_button_bikin, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home_label_filePemain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_text_filePemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_button_filePemain)
                .addGap(18, 18, 18)
                .addComponent(home_label_jadwalKandidat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_text_jadwalKandidat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_button_jadwalKandidat)
                .addGap(18, 18, 18)
                .addComponent(home_label_jadwalTempat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_text_jadwalTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_button_jadwalTempat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_button_bikin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_button_filePemainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_filePemainActionPerformed
        // Inisiasi
        JFileChooser fc = new JFileChooser();
        
        // Membuka dialog open file
        int rVal = fc.showOpenDialog(Home.this);
        
        if (rVal == JFileChooser.APPROVE_OPTION) {
            home_text_filePemain.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_home_button_filePemainActionPerformed

    private void home_button_jadwalKandidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_jadwalKandidatActionPerformed
        // Inisiasi
        JFileChooser fc = new JFileChooser();
        
        // Membuka dialog open file
        int rVal = fc.showOpenDialog(Home.this);
        
        if (rVal == JFileChooser.APPROVE_OPTION) {
            home_text_jadwalKandidat.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_home_button_jadwalKandidatActionPerformed

    private void home_button_jadwalTempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_jadwalTempatActionPerformed
        // Inisiasi
        JFileChooser fc = new JFileChooser();
        
        // Membuka dialog open file
        int rVal = fc.showOpenDialog(Home.this);
        
        if (rVal == JFileChooser.APPROVE_OPTION) {
            home_text_jadwalTempat.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_home_button_jadwalTempatActionPerformed

    private void home_button_bikinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_bikinActionPerformed
        GA ga = new GA();
        File f1 = new File(home_text_filePemain.getText());
        File f2 = new File(home_text_jadwalKandidat.getText());
        File f3 = new File(home_text_jadwalTempat.getText());
        nanto.load(f1);
        Genetic.load(f2, f3);
        ga.setVisible(true);
        ga.start();
    }//GEN-LAST:event_home_button_bikinActionPerformed

    public javax.swing.JTextField getFilePemain() {
        return home_text_filePemain;
    }

    public javax.swing.JTextField getJadwalKandidat() {
        return home_text_jadwalKandidat;
    }

    public javax.swing.JTextField getJadwalTempat() {
        return home_text_jadwalTempat;
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    // Variabel gue
    Nanto nanto = new Nanto();
    // Akhir dari variabel gue
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home_button_bikin;
    private javax.swing.JButton home_button_filePemain;
    private javax.swing.JButton home_button_jadwalKandidat;
    private javax.swing.JButton home_button_jadwalTempat;
    private javax.swing.JLabel home_label_filePemain;
    private javax.swing.JLabel home_label_jadwalKandidat;
    private javax.swing.JLabel home_label_jadwalTempat;
    private javax.swing.JTextField home_text_filePemain;
    private javax.swing.JTextField home_text_jadwalKandidat;
    private javax.swing.JTextField home_text_jadwalTempat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
