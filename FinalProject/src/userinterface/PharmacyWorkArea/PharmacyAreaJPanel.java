/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyWorkArea;

import userinterface.DoctorWorkArea.*;
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
public class PharmacyAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    ManageNetworkJPanel manageNetworkPanel;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;
    private EcoSystem system;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public PharmacyAreaJPanel(JPanel userProcessContainer, UserAccount user, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = user;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
//        manageNetworkPanel = new ManageNetworkJPanel(sysAdminWorkAreaContainer, system);
//        sysAdminWorkAreaContainer.add("network", manageNetworkPanel);
    }
    
    public PharmacyAreaJPanel() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sysAdminMenuPanel = new javax.swing.JPanel();
        panelSelectionBg1 = new javax.swing.JPanel();
        lblNetwork = new javax.swing.JLabel();
        panelSelectionBg2 = new javax.swing.JPanel();
        panel = new javax.swing.JLabel();
        panelSelectionBg4 = new javax.swing.JPanel();
        lblEmployees = new javax.swing.JLabel();
        panelSelectionBg3 = new javax.swing.JPanel();
        lblOrganizations = new javax.swing.JLabel();
        sysAdminWorkAreaContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1230, 663));

        sysAdminMenuPanel.setBackground(new java.awt.Color(51, 51, 51));
        sysAdminMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSelectionBg1.setBackground(new java.awt.Color(0, 0, 0));

        lblNetwork.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(204, 0, 51));
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/network.png"))); // NOI18N
        lblNetwork.setText("Manage Work Request");
        lblNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNetworkMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNetworkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSelectionBg1Layout = new javax.swing.GroupLayout(panelSelectionBg1);
        panelSelectionBg1.setLayout(panelSelectionBg1Layout);
        panelSelectionBg1Layout.setHorizontalGroup(
            panelSelectionBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelectionBg1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSelectionBg1Layout.setVerticalGroup(
            panelSelectionBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(panelSelectionBg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 50));

        panelSelectionBg2.setBackground(new java.awt.Color(51, 51, 51));

        panel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enterprise.png"))); // NOI18N
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelSelectionBg2Layout = new javax.swing.GroupLayout(panelSelectionBg2);
        panelSelectionBg2.setLayout(panelSelectionBg2Layout);
        panelSelectionBg2Layout.setHorizontalGroup(
            panelSelectionBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelectionBg2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSelectionBg2Layout.setVerticalGroup(
            panelSelectionBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(panelSelectionBg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 50));

        panelSelectionBg4.setBackground(new java.awt.Color(51, 51, 51));

        lblEmployees.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployees.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employees.png"))); // NOI18N
        lblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEmployeesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelSelectionBg4Layout = new javax.swing.GroupLayout(panelSelectionBg4);
        panelSelectionBg4.setLayout(panelSelectionBg4Layout);
        panelSelectionBg4Layout.setHorizontalGroup(
            panelSelectionBg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelectionBg4Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(lblEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSelectionBg4Layout.setVerticalGroup(
            panelSelectionBg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(panelSelectionBg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 50));

        panelSelectionBg3.setBackground(new java.awt.Color(51, 51, 51));

        lblOrganizations.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblOrganizations.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizations.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrganizations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/organization.png"))); // NOI18N
        lblOrganizations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOrganizationsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelSelectionBg3Layout = new javax.swing.GroupLayout(panelSelectionBg3);
        panelSelectionBg3.setLayout(panelSelectionBg3Layout);
        panelSelectionBg3Layout.setHorizontalGroup(
            panelSelectionBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelectionBg3Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(lblOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSelectionBg3Layout.setVerticalGroup(
            panelSelectionBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrganizations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(panelSelectionBg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 50));

        sysAdminWorkAreaContainer.setPreferredSize(new java.awt.Dimension(940, 663));
        sysAdminWorkAreaContainer.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sysAdminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sysAdminWorkAreaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sysAdminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sysAdminWorkAreaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetworkMouseClicked
        // TODO add your handling code here:                
    }//GEN-LAST:event_lblNetworkMouseClicked

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        // TODO add your handling code here:
        
        setStyleEnterprise();
        
        sysAdminWorkAreaContainer.removeAll();
        
        ManageEnterprisesJPanel manageEnterprises = new ManageEnterprisesJPanel(sysAdminWorkAreaContainer, system);                
        sysAdminWorkAreaContainer.add("enterprises", manageEnterprises);
    }//GEN-LAST:event_panelMousePressed

    private void lblOrganizationsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrganizationsMousePressed
        // TODO add your handling code here:
        
        setStyleOrganization();
        
        sysAdminWorkAreaContainer.removeAll();
        
        ManageEnterpriseAdminJPanel manageOrganizations = new ManageEnterpriseAdminJPanel(sysAdminWorkAreaContainer, system);       
        sysAdminWorkAreaContainer.add("organizations", manageOrganizations);
    }//GEN-LAST:event_lblOrganizationsMousePressed

    private void lblEmployeesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmployeesMousePressed
        // TODO add your handling code here:
        
        setStyleEmployee();
        
        sysAdminWorkAreaContainer.removeAll();
        
//        ManageEmployeesJPanel manageEmployees = new ManageEmployeesJPanel(sysAdminWorkAreaContainer, system);                
//        sysAdminWorkAreaContainer.add("employees", manageEmployees);
    }//GEN-LAST:event_lblEmployeesMousePressed

    private void lblNetworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetworkMousePressed
        // TODO add your handling code here:
        setStyleNetwork();
        
        sysAdminWorkAreaContainer.removeAll();
        
        ManageNetworkJPanel manageNetwork = new ManageNetworkJPanel(sysAdminWorkAreaContainer, system);                        
        sysAdminWorkAreaContainer.add("network", manageNetwork);
    }//GEN-LAST:event_lblNetworkMousePressed

    public void setStyleNetwork() {
        // Set Enterprise to RED
        lblNetwork.setForeground(new Color(204,0,51));
        lblNetwork.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        panel.setForeground(Color.white);
        panel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));        
        
        lblOrganizations.setForeground(Color.white);
        lblOrganizations.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEmployees.setForeground(Color.white);
        lblEmployees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        panelSelectionBg1.setBackground(Color.black);
        panelSelectionBg2.setBackground(new Color(51, 51, 51));
        panelSelectionBg3.setBackground(new Color(51, 51, 51));
        panelSelectionBg4.setBackground(new Color(51, 51, 51));
    }
    
    public void setStyleEnterprise() {
        // Set Enterprise to RED
        panel.setForeground(new Color(204,0,51));
        panel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblOrganizations.setForeground(Color.white);
        lblOrganizations.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEmployees.setForeground(Color.white);
        lblEmployees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        panelSelectionBg1.setBackground(new Color(51, 51, 51));
        panelSelectionBg2.setBackground(Color.black);
        panelSelectionBg3.setBackground(new Color(51, 51, 51));
        panelSelectionBg4.setBackground(new Color(51, 51, 51));
    }
    
    public void setStyleOrganization() {
        // Set Enterprise to RED
        lblOrganizations.setForeground(new Color(204,0,51));
        lblOrganizations.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));        
        
        panel.setForeground(Color.white);
        panel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEmployees.setForeground(Color.white);
        lblEmployees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        panelSelectionBg1.setBackground(new Color(51, 51, 51));
        panelSelectionBg2.setBackground(new Color(51, 51, 51));
        panelSelectionBg3.setBackground(Color.black);
        panelSelectionBg4.setBackground(new Color(51, 51, 51));
    }
    
    public void setStyleEmployee() {
        // Set Enterprise to RED
        lblEmployees.setForeground(new Color(204,0,51));
        lblEmployees.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        panel.setForeground(Color.white);
        panel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblOrganizations.setForeground(Color.white);
        lblOrganizations.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        panelSelectionBg1.setBackground(new Color(51, 51, 51));
        panelSelectionBg2.setBackground(new Color(51, 51, 51));
        panelSelectionBg3.setBackground(new Color(51, 51, 51));
        panelSelectionBg4.setBackground(Color.black);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEmployees;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblOrganizations;
    private javax.swing.JLabel panel;
    private javax.swing.JPanel panelSelectionBg1;
    private javax.swing.JPanel panelSelectionBg2;
    private javax.swing.JPanel panelSelectionBg3;
    private javax.swing.JPanel panelSelectionBg4;
    private javax.swing.JPanel sysAdminMenuPanel;
    private javax.swing.JPanel sysAdminWorkAreaContainer;
    // End of variables declaration//GEN-END:variables
}
