/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerWisataKabBdgB;
import javax.swing.JButton;

/**
 *
 * @author Rizky
 */
public class ViewWisataKabBdgB extends javax.swing.JFrame {

    /**
     * Creates new form ViewWisataKabBandungBarat
     */
    public ViewWisataKabBdgB() {
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
        btnKWisataKabBdgB = new javax.swing.JButton();
        btnKulinerKabBdgB = new javax.swing.JButton();
        btnNonAlamKabBdgB = new javax.swing.JButton();
        btnAlamKabBdgB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wisata Kabupaten Bandung Barat");

        btnKWisataKabBdgB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKWisataKabBdgB.setText("Kembali");
        btnKWisataKabBdgB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKWisataKabBdgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKWisataKabBdgBActionPerformed(evt);
            }
        });

        btnKulinerKabBdgB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKulinerKabBdgB.setText("Wisata Kuliner");
        btnKulinerKabBdgB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKulinerKabBdgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKulinerKabBdgBActionPerformed(evt);
            }
        });

        btnNonAlamKabBdgB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNonAlamKabBdgB.setText("Wisata non-Alam");
        btnNonAlamKabBdgB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNonAlamKabBdgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonAlamKabBdgBActionPerformed(evt);
            }
        });

        btnAlamKabBdgB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlamKabBdgB.setText("Wisata Alam");
        btnAlamKabBdgB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlamKabBdgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlamKabBdgBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnKulinerKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnNonAlamKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnAlamKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKWisataKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnKWisataKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKulinerKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNonAlamKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlamKabBdgB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKWisataKabBdgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKWisataKabBdgBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKWisataKabBdgBActionPerformed

    private void btnKulinerKabBdgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKulinerKabBdgBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKulinerKabBdgBActionPerformed

    private void btnNonAlamKabBdgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonAlamKabBdgBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNonAlamKabBdgBActionPerformed

    private void btnAlamKabBdgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlamKabBdgBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlamKabBdgBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlamKabBdgB;
    private javax.swing.JButton btnKWisataKabBdgB;
    private javax.swing.JButton btnKulinerKabBdgB;
    private javax.swing.JButton btnNonAlamKabBdgB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAlamKabBdgB() {
        return btnAlamKabBdgB;
    }

    public JButton getBtnKWisataKabBdgB() {
        return btnKWisataKabBdgB;
    }

    public JButton getBtnKulinerKabBdgB() {
        return btnKulinerKabBdgB;
    }

    public JButton getBtnNonAlamKabBdgB() {
        return btnNonAlamKabBdgB;
    }

    public void addActionListener(ControllerWisataKabBdgB e) {
        btnAlamKabBdgB.addActionListener(e);
        btnKulinerKabBdgB.addActionListener(e);
        btnNonAlamKabBdgB.addActionListener(e);
        btnKWisataKabBdgB.addActionListener(e);
    }

 
    
}
