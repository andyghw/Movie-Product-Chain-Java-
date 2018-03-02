/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Sponsor;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MovieManufactureEnterprise;
import Business.Movie.Movie;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.ActorRole;
import Business.Role.DirectorRole;
import Business.UserAccount.UserAccount;
import Interface.Theater.ViewStaffDetailPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyg
 */
public class SponsorViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form SponsorViewPanel
     */
    private JPanel card;
    private EcoSystem business;
    private Movie movie;
    private UserAccount userAccount;
    public SponsorViewPanel(JPanel card,EcoSystem business,UserAccount userAccount,Movie movie) {
        initComponents();
        this.card=card;
        this.business=business;
        this.userAccount=userAccount;
        this.movie=movie;
        movieLabel.setText(String.valueOf(movie));
        displayRelatedInfo();
        populateStaffTable();
        displayDescription();
    }
    
    public void displayRelatedInfo(){
        DefaultTableModel dtm=(DefaultTableModel)directorMovieTable.getModel();
        dtm.setRowCount(0);
        for(Network network:business.getNetworkslist()){
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseslist()){
                if(enterprise instanceof MovieManufactureEnterprise){
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                        for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                            for(Employee employee:movie.getEmployeelist().getEmployeeList()){
                                if(employee.equals(userAccount.getEmployee())){
                                    if(userAccount.getRole() instanceof DirectorRole){
                                        directorText.setText(userAccount.getEmployee().getName());
                                        directorRatingText.setText(String.valueOf(userAccount.getEmployee().getRating()));
                                        for(Movie movie:userAccount.getMovielist().getMovieList()){
                                        Object row[]=new Object[2];
                                        row[0]=movie;
                                        row[1]=movie.getRating();
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
        
        
    }
    
    
    public void populateStaffTable(){
        DefaultTableModel dtm=(DefaultTableModel)staffTable.getModel();
        dtm.setRowCount(0);
        for(Network network:business.getNetworkslist()){
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseslist()){
                if(enterprise instanceof MovieManufactureEnterprise){
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                for(Employee employee:movie.getEmployeelist().getEmployeeList()){
                    if(userAccount.getEmployee().equals(employee)){
                        Object row[]=new Object[3];
                        row[0]=userAccount.getRole();
                        row[1]=userAccount.getEmployee();
                        row[2]=userAccount.getEmployee().getRating();
                        dtm.addRow(row);
                    }
                }
            }
        }
            }
        }
        }
    }
    
    public void displayDescription(){
        descriptionText.setText(movie.getDescription());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        movieLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        directorRatingText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        directorText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        directorMovieTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();

        jPanel1 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("sponsor.png");
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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Staff List");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Director");

        movieLabel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        movieLabel.setText("jLabel4");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jButton1.setText("View staff details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Personal rating");

        directorRatingText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        directorRatingText.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Movie Description");

        directorText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        directorText.setEnabled(false);

        directorMovieTable.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        directorMovieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie", "Rating"
            }
        ));
        jScrollPane1.setViewportView(directorMovieTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Movie History List");

        staffTable.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job", "Name", "Rating"
            }
        ));
        jScrollPane2.setViewportView(staffTable);

        descriptionText.setColumns(20);
        descriptionText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        descriptionText.setRows(5);
        descriptionText.setEnabled(false);
        jScrollPane3.setViewportView(descriptionText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(275, 275, 275)
                                        .addComponent(movieLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(282, 282, 282)
                                        .addComponent(jButton1))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(directorText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(directorRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(directorRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(movieLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
         int selectedrow=staffTable.getSelectedRow();
         if(selectedrow<0){
             JOptionPane.showMessageDialog(null, "Please select an row first.");
             return;
         }
         Employee employee=(Employee)staffTable.getValueAt(selectedrow, 1);
         SponsorViewStaffPanel panel=new SponsorViewStaffPanel(card, business, employee);
         card.add("SponsorViewStaffPanel",panel);
         CardLayout layout=(CardLayout)card.getLayout();
         layout.next(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JTable directorMovieTable;
    private javax.swing.JTextField directorRatingText;
    private javax.swing.JTextField directorText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JTable staffTable;
    // End of variables declaration//GEN-END:variables
}
