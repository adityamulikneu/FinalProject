/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospAdmin;

import userinterface.SystemAdminWorkArea.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author adityamulik
 */
public class HospAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    ManageHospitalEmployees manageHospitalEmployees;
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;
    private EcoSystem system;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public HospAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount user, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = user;
        this.organization = organization;
        this.network = network;
        this.system = business;
        this.enterprise = this.user.getAssociatedEnterprise();
        manageHospitalEmployees = new ManageHospitalEmployees(hospitalAdminWorkArea, system, this.enterprise);
        hospitalAdminWorkArea.add("network", manageHospitalEmployees);                        
    }
    
    public HospAdminWorkAreaJPanel() {
        
    }
    
    public void getEnterprise() {                
        
        for(UserAccount u: system.getUserAccountDirectory().getUserAccountList()) {
            if (u.getUsername().equals(user.getUsername())) {
                
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

        manageEmployeesHospitalAdminPanel = new javax.swing.JPanel();
        manageEmployeesHospAdmin = new javax.swing.JPanel();
        lblNetwork = new javax.swing.JLabel();
        panelSelectionBg2 = new javax.swing.JPanel();
        panelSelectionBg4 = new javax.swing.JPanel();
        panelSelectionBg3 = new javax.swing.JPanel();
        hospitalAdminWorkArea = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1230, 663));

        manageEmployeesHospitalAdminPanel.setBackground(new java.awt.Color(51, 51, 51));
        manageEmployeesHospitalAdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageEmployeesHospAdmin.setBackground(new java.awt.Color(0, 0, 0));

        lblNetwork.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(204, 0, 51));
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/network.png"))); // NOI18N
        lblNetwork.setText("Manage Employees");
        lblNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNetworkMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNetworkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout manageEmployeesHospAdminLayout = new javax.swing.GroupLayout(manageEmployeesHospAdmin);
        manageEmployeesHospAdmin.setLayout(manageEmployeesHospAdminLayout);
        manageEmployeesHospAdminLayout.setHorizontalGroup(
            manageEmployeesHospAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmployeesHospAdminLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        manageEmployeesHospAdminLayout.setVerticalGroup(
            manageEmployeesHospAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        manageEmployeesHospitalAdminPanel.add(manageEmployeesHospAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 50));

        panelSelectionBg2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelSelectionBg2Layout = new javax.swing.GroupLayout(panelSelectionBg2);
        panelSelectionBg2.setLayout(panelSelectionBg2Layout);
        panelSelectionBg2Layout.setHorizontalGroup(
            panelSelectionBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelSelectionBg2Layout.setVerticalGroup(
            panelSelectionBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageEmployeesHospitalAdminPanel.add(panelSelectionBg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 50));

        panelSelectionBg4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelSelectionBg4Layout = new javax.swing.GroupLayout(panelSelectionBg4);
        panelSelectionBg4.setLayout(panelSelectionBg4Layout);
        panelSelectionBg4Layout.setHorizontalGroup(
            panelSelectionBg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelSelectionBg4Layout.setVerticalGroup(
            panelSelectionBg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageEmployeesHospitalAdminPanel.add(panelSelectionBg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 50));

        panelSelectionBg3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelSelectionBg3Layout = new javax.swing.GroupLayout(panelSelectionBg3);
        panelSelectionBg3.setLayout(panelSelectionBg3Layout);
        panelSelectionBg3Layout.setHorizontalGroup(
            panelSelectionBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelSelectionBg3Layout.setVerticalGroup(
            panelSelectionBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageEmployeesHospitalAdminPanel.add(panelSelectionBg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 50));

        hospitalAdminWorkArea.setPreferredSize(new java.awt.Dimension(940, 663));
        hospitalAdminWorkArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(manageEmployeesHospitalAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hospitalAdminWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEmployeesHospitalAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalAdminWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetworkMouseClicked
        // TODO add your handling code here:                
    }//GEN-LAST:event_lblNetworkMouseClicked

    private void lblNetworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetworkMousePressed
        // TODO add your handling code here:
        setStyleNetwork();
        
        hospitalAdminWorkArea.removeAll();
        
        ManageHospitalEmployees manageEmployeeHospAdmin = new ManageHospitalEmployees(hospitalAdminWorkArea, system, enterprise);                        
        hospitalAdminWorkArea.add("manageEmps", manageEmployeeHospAdmin);
    }//GEN-LAST:event_lblNetworkMousePressed

    public void setStyleNetwork() {
        // Set Enterprise to RED
        lblNetwork.setForeground(new Color(204,0,51));
        lblNetwork.setFont(new Font("Lucida Grande", Font.BOLD, 20));
     
        
        manageEmployeesHospAdmin.setBackground(Color.black);
        panelSelectionBg2.setBackground(new Color(51, 51, 51));
        panelSelectionBg3.setBackground(new Color(51, 51, 51));
        panelSelectionBg4.setBackground(new Color(51, 51, 51));
    }
    
    public void setStyleEnterprise() {
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
       
        manageEmployeesHospAdmin.setBackground(new Color(51, 51, 51));
        panelSelectionBg2.setBackground(Color.black);
        panelSelectionBg3.setBackground(new Color(51, 51, 51));
        panelSelectionBg4.setBackground(new Color(51, 51, 51));
    }
    
    public void setStyleOrganization() {
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));        
        
        
        manageEmployeesHospAdmin.setBackground(new Color(51, 51, 51));
        panelSelectionBg2.setBackground(new Color(51, 51, 51));
        panelSelectionBg3.setBackground(Color.black);
        panelSelectionBg4.setBackground(new Color(51, 51, 51));
    }
    
    public void setStyleEmployee() {
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));  
        
        manageEmployeesHospAdmin.setBackground(new Color(51, 51, 51));
        panelSelectionBg2.setBackground(new Color(51, 51, 51));
        panelSelectionBg3.setBackground(new Color(51, 51, 51));
        panelSelectionBg4.setBackground(Color.black);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hospitalAdminWorkArea;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JPanel manageEmployeesHospAdmin;
    private javax.swing.JPanel manageEmployeesHospitalAdminPanel;
    private javax.swing.JPanel panelSelectionBg2;
    private javax.swing.JPanel panelSelectionBg3;
    private javax.swing.JPanel panelSelectionBg4;
    // End of variables declaration//GEN-END:variables
}
