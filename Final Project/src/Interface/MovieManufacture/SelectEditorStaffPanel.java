/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.MovieManufacture;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Movie.Movie;
import Business.Organization.EditorOrganization;
import Business.Organization.LightingOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class SelectEditorStaffPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectEditorStaffPanel
     */
    private EcoSystem business;
    private JPanel card;
    private Movie movie;
    private Enterprise enterprise;
    public SelectEditorStaffPanel(JPanel card,EcoSystem business,Movie movie,Enterprise enterprise) {
        initComponents();
        this.card=card;
        this.business=business;
        this.movie=movie;
        this.enterprise=enterprise;
        populateEditorTable();
    }
    
    
    public void populateEditorTable(){
        DefaultTableModel dtm=(DefaultTableModel)EditorStaffTable.getModel();
        dtm.setRowCount(0);
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof EditorOrganization){
                for(Employee employee:organization.getEmployeeDirectory().getEmployeeList()){
                    Object row[]=new Object[2];
                    row[0]=employee;
                    row[1]=employee.getRating();
                    dtm.addRow(row);
                }
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        EditorStaffTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jPanel1 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("bgfilm.png");
                g.drawImage(img, 0, 0, this.getParent().getWidth(), this.getParent().getHeight(), this);
            }
        };

        backButton.setBackground(new java.awt.Color(153, 153, 153));
        backButton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        EditorStaffTable.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        EditorStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rating"
            }
        ));
        jScrollPane1.setViewportView(EditorStaffTable);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton1)
                .addContainerGap(194, Short.MAX_VALUE))
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        card.remove(this);
        CardLayout layout=(CardLayout)card.getLayout();
        layout.previous(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedrow=EditorStaffTable.getSelectedRow();
        if(selectedrow<0){
            JOptionPane.showMessageDialog(null, "Please select an row first");
            return;
        }
        Employee employee=(Employee)EditorStaffTable.getValueAt(selectedrow, 0);
        ViewEditorStaffPanel panel=new ViewEditorStaffPanel(card,movie,employee,enterprise);
        card.add(panel);
        CardLayout layout=(CardLayout)card.getLayout();
        layout.next(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EditorStaffTable;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
