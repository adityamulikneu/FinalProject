/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
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
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    ManageNetworkJPanel manageNetworkPanel;
    JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        manageNetworkPanel = new ManageNetworkJPanel(sysAdminWorkAreaContainer, system);
        sysAdminWorkAreaContainer.add("network", manageNetworkPanel);
    }
    
    public SystemAdminWorkAreaJPanel() {
        
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
        jPanel2 = new javax.swing.JPanel();
        lblNetwork = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblEnterprises = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblEmployees = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblOrganizations = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        sysAdminWorkAreaContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1230, 663));

        sysAdminMenuPanel.setBackground(new java.awt.Color(51, 51, 51));
        sysAdminMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblNetwork.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(204, 0, 51));
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/network.png"))); // NOI18N
        lblNetwork.setText(" Manage Network");
        lblNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNetworkMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNetworkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lblEnterprises.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblEnterprises.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprises.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnterprises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enterprise.png"))); // NOI18N
        lblEnterprises.setText(" Manage Enterprises");
        lblEnterprises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEnterprisesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lblEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEnterprises, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 50));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        lblEmployees.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployees.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employees.png"))); // NOI18N
        lblEmployees.setText(" Manage Employees");
        lblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEmployeesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lblEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 50));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        lblOrganizations.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblOrganizations.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizations.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrganizations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/organization.png"))); // NOI18N
        lblOrganizations.setText(" Manage Organizations");
        lblOrganizations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOrganizationsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lblOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrganizations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sysAdminMenuPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 50));

        jTree1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTree1);

        sysAdminMenuPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 149, 240));

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

    private void lblEnterprisesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterprisesMousePressed
        // TODO add your handling code here:
        
        setStyleEnterprise();
        
        sysAdminWorkAreaContainer.removeAll();
        
        ManageEnterprisesJPanel manageEnterprises = new ManageEnterprisesJPanel(sysAdminWorkAreaContainer, system);                
        sysAdminWorkAreaContainer.add("enterprises", manageEnterprises);
    }//GEN-LAST:event_lblEnterprisesMousePressed

    private void lblOrganizationsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrganizationsMousePressed
        // TODO add your handling code here:
        
        setStyleOrganization();
        
        sysAdminWorkAreaContainer.removeAll();
        
        ManageOrganizationsJPanel manageOrganizations = new ManageOrganizationsJPanel(sysAdminWorkAreaContainer, system);       
        sysAdminWorkAreaContainer.add("organizations", manageOrganizations);
    }//GEN-LAST:event_lblOrganizationsMousePressed

    private void lblEmployeesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmployeesMousePressed
        // TODO add your handling code here:
        
        setStyleEmployee();
        
        sysAdminWorkAreaContainer.removeAll();
        
        ManageEmployeesJPanel manageEmployees = new ManageEmployeesJPanel(sysAdminWorkAreaContainer, system);                
        sysAdminWorkAreaContainer.add("employees", manageEmployees);
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
        lblEnterprises.setForeground(Color.white);
        lblEnterprises.setFont(new Font("Lucida Grande", Font.PLAIN, 20));        
        
        lblOrganizations.setForeground(Color.white);
        lblOrganizations.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEmployees.setForeground(Color.white);
        lblEmployees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
    }
    
    public void setStyleEnterprise() {
        // Set Enterprise to RED
        lblEnterprises.setForeground(new Color(204,0,51));
        lblEnterprises.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblOrganizations.setForeground(Color.white);
        lblOrganizations.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEmployees.setForeground(Color.white);
        lblEmployees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
    }
    
    public void setStyleOrganization() {
        // Set Enterprise to RED
        lblOrganizations.setForeground(new Color(204,0,51));
        lblOrganizations.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));        
        
        lblEnterprises.setForeground(Color.white);
        lblEnterprises.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEmployees.setForeground(Color.white);
        lblEmployees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
    }
    
    public void setStyleEmployee() {
        // Set Enterprise to RED
        lblEmployees.setForeground(new Color(204,0,51));
        lblEmployees.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        
        // Roll back others to white
        lblNetwork.setForeground(Color.white);
        lblNetwork.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblEnterprises.setForeground(Color.white);
        lblEnterprises.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        
        lblOrganizations.setForeground(Color.white);
        lblOrganizations.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblEmployees;
    private javax.swing.JLabel lblEnterprises;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblOrganizations;
    private javax.swing.JPanel sysAdminMenuPanel;
    private javax.swing.JPanel sysAdminWorkAreaContainer;
    // End of variables declaration//GEN-END:variables
}
