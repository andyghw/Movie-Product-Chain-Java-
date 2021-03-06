/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.MovieManufacture;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Movie.Movie;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author andyg
 */
public class SelectStaffPanel extends javax.swing.JPanel {
    private JPanel card;
    private EcoSystem business;
    private Movie movie;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form SelectStaffPanel
     */
    public SelectStaffPanel( JPanel card,EcoSystem business,Movie movie,Enterprise enterprise,UserAccount userAccount) {
        initComponents();
        this.card=card;
        this.business=business;
        this.movie=movie;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
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
        backButton = new javax.swing.JButton();
        selectLightingButton = new javax.swing.JButton();
        selectEditorButton = new javax.swing.JButton();
        selectCameraButton = new javax.swing.JButton();
        selectCostumeButton = new javax.swing.JButton();
        selectActorButton = new javax.swing.JButton();

        jPanel1 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("bgfilm.png");
                g.drawImage(img, 0, 0, this.getParent().getWidth(), this.getParent().getHeight(), this);
            }
        };

        backButton.setBackground(new java.awt.Color(153, 153, 153));
        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("< Back to WorkArea");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        selectLightingButton.setBackground(new java.awt.Color(153, 153, 153));
        selectLightingButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectLightingButton.setText("Select Lighting Staff");
        selectLightingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectLightingButtonActionPerformed(evt);
            }
        });

        selectEditorButton.setBackground(new java.awt.Color(153, 153, 153));
        selectEditorButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectEditorButton.setText("Select Editor");
        selectEditorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEditorButtonActionPerformed(evt);
            }
        });

        selectCameraButton.setBackground(new java.awt.Color(153, 153, 153));
        selectCameraButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectCameraButton.setText("Select Camera Staff");
        selectCameraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCameraButtonActionPerformed(evt);
            }
        });

        selectCostumeButton.setBackground(new java.awt.Color(153, 153, 153));
        selectCostumeButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectCostumeButton.setText("Select Costume Manager");
        selectCostumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCostumeButtonActionPerformed(evt);
            }
        });

        selectActorButton.setBackground(new java.awt.Color(153, 153, 153));
        selectActorButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectActorButton.setText("Select Actor");
        selectActorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectCameraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectCostumeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectActorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectLightingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectEditorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(110, 110, 110)
                .addComponent(selectCameraButton)
                .addGap(43, 43, 43)
                .addComponent(selectLightingButton)
                .addGap(43, 43, 43)
                .addComponent(selectActorButton)
                .addGap(43, 43, 43)
                .addComponent(selectCostumeButton)
                .addGap(31, 31, 31)
                .addComponent(selectEditorButton)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectCostumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCostumeButtonActionPerformed
         SelectCostumePanel panel=new SelectCostumePanel(card,business,movie,enterprise);
        card.add("SelectCostumePanel",panel);
         CardLayout layout=(CardLayout)card.getLayout();
         layout.next(card);        
// TODO add your handling code here:
    }//GEN-LAST:event_selectCostumeButtonActionPerformed

    private void selectCameraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCameraButtonActionPerformed
         SelectCameraStaffPanel panel=new SelectCameraStaffPanel(card,business,movie,enterprise);
         card.add("SelectCameraStaffPanel",panel);
         CardLayout layout=(CardLayout)card.getLayout();
         layout.next(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCameraButtonActionPerformed

    private void selectActorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActorButtonActionPerformed
        SelectActorPanel panel=new SelectActorPanel(card,business,movie,enterprise,userAccount);
        card.add("SelectActorPanel",panel);
         CardLayout layout=(CardLayout)card.getLayout();
         layout.next(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActorButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

          card.remove(this);
           CardLayout layout=(CardLayout)card.getLayout();
         layout.previous(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void selectLightingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectLightingButtonActionPerformed
           SelectLightingStaffPanel panel=new SelectLightingStaffPanel(card,business,movie,enterprise);
         card.add("SelectLightingStaffPanel",panel);
         CardLayout layout=(CardLayout)card.getLayout();
         layout.next(card);   
        // TODO add your handling code here:
    }//GEN-LAST:event_selectLightingButtonActionPerformed

    private void selectEditorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEditorButtonActionPerformed
        // TODO add your handling code here:
        SelectEditorStaffPanel panel=new SelectEditorStaffPanel(card,business,movie,enterprise);
         card.add("SelectEditorStaffPanel",panel);
         CardLayout layout=(CardLayout)card.getLayout();
         layout.next(card); 
    }//GEN-LAST:event_selectEditorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectActorButton;
    private javax.swing.JButton selectCameraButton;
    private javax.swing.JButton selectCostumeButton;
    private javax.swing.JButton selectEditorButton;
    private javax.swing.JButton selectLightingButton;
    // End of variables declaration//GEN-END:variables
}
