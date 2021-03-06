/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.MovieRating;

import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.MovieManufactureEnterprise;
import Business.Enterprise.TwitterEnterprise;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import Business.Movie.MovieCatalog;
import Business.Movie.Movie;
import Business.Network.Network;
import Business.Organization.DirectorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.JOptionPane;

/**
 *
 * @author HH
 */
public class DirectorWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    /**
     * Creates new form DirectorWorkAreaJPanel
     */

    public DirectorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem business) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.business = business;
       this.account=account;
       populateMovieCombox();
    }

     public void populateMovieCombox(){
        movieCombox.removeAllItems();
        for(Network network:business.getNetworkslist()){
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseslist()){
                if(enterprise instanceof MovieManufactureEnterprise){
                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof DirectorOrganization){
                    for(UserAccount useraccount:organization.getUserAccountDirectory().getUserAccountList()){
                           if(useraccount.getEmployee().getName().equals(account.getEmployee().getName())){
                        for(Movie movie:useraccount.getMovielist().getMovieList()){
                                                movieCombox.addItem(movie);
                                            }
                                        }
                   }
                    }
                }
            }
        }
                }
    }
     
     public void populateStaffTable(Movie movie){
        DefaultTableModel dtm=(DefaultTableModel)staffTable.getModel();
        dtm.setRowCount(0);
        for(Network network:business.getNetworkslist()){
         for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseslist()){
             if(enterprise instanceof MovieManufactureEnterprise){
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(!(organization instanceof DirectorOrganization)){
            for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                for(Employee employee:movie.getEmployeelist().getEmployeeList()){
                    if(userAccount.getEmployee().equals(employee)){
                        Object row[]=new Object[4];
                        row[0]=userAccount;
                        row[1]=userAccount.getRole();
                        row[2]=userAccount.getEmployee();
                        row[3]=userAccount.getEmployee().getRating();
                        dtm.addRow(row);
                    }
                }
                    }
            }
                }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        movieCombox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("rating.png");
                g.drawImage(img, 0, 0, this.getParent().getWidth(), this.getParent().getHeight(), this);
            }
        };

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rating Director Work Area");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Rate:");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jTextField2.setText(" ");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Staff List");

        staffTable.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account", "Job", "Name", "Rating"
            }
        ));
        jScrollPane1.setViewportView(staffTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Movie");

        movieCombox.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        movieCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieComboxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Name:");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jTextField1.setText(" ");
        jTextField1.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jButton1.setText("Select");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addGap(93, 93, 93)
                                    .addComponent(movieCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(movieCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addContainerGap(79, Short.MAX_VALUE))
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

    private void movieComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieComboxActionPerformed
        Movie movie=(Movie)movieCombox.getSelectedItem();
        populateStaffTable(movie);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_movieComboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = staffTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first to view detail", "Warning", JOptionPane.WARNING_MESSAGE);
        }
         else{
        UserAccount u = (UserAccount) staffTable.getValueAt(selectedRow, 0);
        jTextField1.setText(u.getEmployee().getName().toString());
        
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int n=0;
        int selectedRow = staffTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select an row first.");
            return;
        }
        double rate=0;
        try{
        rate=Double.parseDouble(jTextField2.getText());
        Employee e = (Employee) staffTable.getValueAt(selectedRow, 2);
             double totalRating=rate+e.getRating()*e.getCount();
             e.setRating(totalRating/(e.getCount()+1));      
        JOptionPane.showMessageDialog(null, "successfully rated.", "Information", JOptionPane.INFORMATION_MESSAGE);
        Movie movie=(Movie)movieCombox.getSelectedItem();
        populateStaffTable(movie);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please input a valid rating.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox movieCombox;
    private javax.swing.JTable staffTable;
    // End of variables declaration//GEN-END:variables
}
