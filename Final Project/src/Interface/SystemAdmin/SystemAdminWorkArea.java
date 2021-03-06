/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author andyg
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    private JPanel card;
    private EcoSystem business;
    public SystemAdminWorkArea(JPanel card,EcoSystem business) {
        initComponents();
        this.card=card;
        this.business=business;
        populateTree();
    }
    
    
     public void populateTree() {
        
        DefaultTreeModel dtm=(DefaultTreeModel)JTree.getModel();
        ArrayList<Network> networklist=business.getNetworkslist();
        ArrayList<Enterprise> enterpriseslist;
        ArrayList<Organization> organizationslist;
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");  //new child of the JTree
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)dtm.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networklist.size(); i++) {
            network = networklist.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseslist = network.getEnterpriseDirectory().getEnterpriseslist();

            for (int j = 0; j < enterpriseslist.size(); j++) {
                enterprise = enterpriseslist.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationslist = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationslist.size(); k++) {
                    organization = organizationslist.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        dtm.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        manageAdminJButton = new javax.swing.JButton();
        manageEnterpriseJButton = new javax.swing.JButton();
        manageNetworkJButton = new javax.swing.JButton();
        selectedNodeJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("sysadmin.png");
                g.drawImage(img, 0, 0, this.getParent().getWidth(), this.getParent().getHeight(), this);
            }
        };

        JTree.setBackground(new java.awt.Color(240, 240, 240));
        JTree.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        JTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTreevalueChangedAction(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("sysadmin.png");
                g.drawImage(img, 0, 0, this.getParent().getWidth(), this.getParent().getHeight(), this);
            }
        };

        manageAdminJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageAdminJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageAdminJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/camera1.png"))); // NOI18N
        manageAdminJButton.setText("Manage Enterprise Admin");
        manageAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdminJButtonActionPerformed(evt);
            }
        });

        manageEnterpriseJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageEnterpriseJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageEnterpriseJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clapboard1.png"))); // NOI18N
        manageEnterpriseJButton.setText("Manage Enterprise");
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });

        manageNetworkJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageNetworkJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageNetworkJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1.png"))); // NOI18N
        manageNetworkJButton.setText("Manage Network");
        manageNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkJButtonActionPerformed(evt);
            }
        });

        selectedNodeJLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        selectedNodeJLabel.setText("System Admin Work Area");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(manageEnterpriseJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageAdminJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageNetworkJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selectedNodeJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(selectedNodeJLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)))
                .addGap(36, 36, 36)
                .addComponent(manageNetworkJButton)
                .addGap(49, 49, 49)
                .addComponent(manageEnterpriseJButton)
                .addGap(56, 56, 56)
                .addComponent(manageAdminJButton)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTreevalueChangedAction(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTreevalueChangedAction
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) JTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_JTreevalueChangedAction

    private void manageAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdminJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(card, business);
        card.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);

        CardLayout layout = (CardLayout) card.getLayout();
        layout.next(card);
    }//GEN-LAST:event_manageAdminJButtonActionPerformed

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed

        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(card, business);
        card.add("manageEnterpriseJPanel", manageEnterpriseJPanel);

        CardLayout layout = (CardLayout) card.getLayout();
        layout.next(card);
    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void manageNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkJButtonActionPerformed
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(card, business);
        card.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) card.getLayout();
        layout.next(card);
    }//GEN-LAST:event_manageNetworkJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageAdminJButton;
    private javax.swing.JButton manageEnterpriseJButton;
    private javax.swing.JButton manageNetworkJButton;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
