/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerWisataKotaBdg;
import javax.swing.JButton;

public class ViewWisataKotaBdg extends javax.swing.JFrame {

    /**
     * Creates new form ViewWisataBandungKota
     */
    public ViewWisataKotaBdg() {
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
        btnKulinerBdgKota = new javax.swing.JButton();
        btnAlamBdgKota = new javax.swing.JButton();
        btnNonAlamBdgKota = new javax.swing.JButton();
        btnKWisataKotaBdg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wisata Kota Bandung");

        btnKulinerBdgKota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKulinerBdgKota.setText("Wisata Kuliner");
        btnKulinerBdgKota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKulinerBdgKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKulinerBdgKotaActionPerformed(evt);
            }
        });

        btnAlamBdgKota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlamBdgKota.setText("Wisata Alam");
        btnAlamBdgKota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlamBdgKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlamBdgKotaActionPerformed(evt);
            }
        });

        btnNonAlamBdgKota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNonAlamBdgKota.setText("Wisata non-Alam");
        btnNonAlamBdgKota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNonAlamBdgKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonAlamBdgKotaActionPerformed(evt);
            }
        });

        btnKWisataKotaBdg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKWisataKotaBdg.setText("Kembali");
        btnKWisataKotaBdg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKWisataKotaBdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKWisataKotaBdgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKWisataKotaBdg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(btnKulinerBdgKota, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnNonAlamBdgKota, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(btnAlamBdgKota, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKWisataKotaBdg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKulinerBdgKota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlamBdgKota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNonAlamBdgKota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(219, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNonAlamBdgKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonAlamBdgKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNonAlamBdgKotaActionPerformed

    private void btnKWisataKotaBdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKWisataKotaBdgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKWisataKotaBdgActionPerformed

    private void btnKulinerBdgKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKulinerBdgKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKulinerBdgKotaActionPerformed

    private void btnAlamBdgKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlamBdgKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlamBdgKotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlamBdgKota;
    private javax.swing.JButton btnKWisataKotaBdg;
    private javax.swing.JButton btnKulinerBdgKota;
    private javax.swing.JButton btnNonAlamBdgKota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    // BUTTON WISATA KOTA BANDUNG

    public JButton getBtnAlamBdgKota() {
        return btnAlamBdgKota;
    }

    public JButton getBtnKWisataKotaBdg() {
        return btnKWisataKotaBdg;
    }

    public JButton getBtnKulinerBdgKota() {
        return btnKulinerBdgKota;
    }

    public JButton getBtnNonAlamBdgKota() {
        return btnNonAlamBdgKota;
    }

    public void addActionListener(ControllerWisataKotaBdg e) {
        btnAlamBdgKota.addActionListener(e);
        btnKulinerBdgKota.addActionListener(e);
        btnNonAlamBdgKota.addActionListener(e);
        btnKWisataKotaBdg.addActionListener(e);
    }
}
