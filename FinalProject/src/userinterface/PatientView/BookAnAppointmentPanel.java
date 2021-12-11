/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientView;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author adityamulik
 */
public class BookAnAppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    JPanel container;
    private EcoSystem system;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public BookAnAppointmentPanel(JPanel container, EcoSystem system, UserAccount user) {
        initComponents();
        this.container = container;
        this.system = system;
        this.user = user;
        
        txtIssue.setText(this.user.getEmployee().getName());
        
        populateCities();
    }
    
    public void populateCities() {
        for(Network n: system.getNetworkList()) {
            networkCmbBox.addItem(n);
        }
    }
    
    public void populateHospitals(Network network) {
        for (Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()) {
            cmbBoxEnterpriseList.addItem(e);
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

        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtIssue = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        lblCity2 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        networkCmbBox = new javax.swing.JComboBox();
        cmbBoxEnterpriseList = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book An Appointment");

        lblName.setText("Name:");

        txtIssue.setBorder(null);
        txtIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssueActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        lblHospital.setText("Hospital:");

        lblCity2.setText("Issue faced:");

        kButton1.setText("Book Appointment");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        networkCmbBox.setBackground(new java.awt.Color(255, 255, 255));
        networkCmbBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        networkCmbBox.setForeground(new java.awt.Color(25, 56, 82));
        networkCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select City" }));
        networkCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkCmbBoxActionPerformed(evt);
            }
        });

        cmbBoxEnterpriseList.setBackground(new java.awt.Color(255, 255, 255));
        cmbBoxEnterpriseList.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        cmbBoxEnterpriseList.setForeground(new java.awt.Color(25, 56, 82));
        cmbBoxEnterpriseList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Hospital" }));
        cmbBoxEnterpriseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxEnterpriseListActionPerformed(evt);
            }
        });

        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(txtIssue)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(networkCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCity2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                        .addComponent(lblHospital, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbBoxEnterpriseList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(357, 357, 357))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(316, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(293, 293, 293)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addComponent(lblName)
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCity)
                .addGap(18, 18, 18)
                .addComponent(networkCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbBoxEnterpriseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCity2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(510, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssueActionPerformed
        // TODO add your handling code here:
        txtIssue.setText(user.toString());
    }//GEN-LAST:event_txtIssueActionPerformed

    private void networkCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkCmbBoxActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        Network city = (Network) networkCmbBox.getSelectedItem();
        Enterprise hospital = (Enterprise) cmbBoxEnterpriseList.getSelectedItem();
        String issue = txtIssue.getText();
        
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void cmbBoxEnterpriseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxEnterpriseListActionPerformed
        // TODO add your handling code here:
        
        try {
            populateHospitals((Network) networkCmbBox.getSelectedItem());
        } catch (Exception e) {
            System.out.println("Choose correct option");
        }
    }//GEN-LAST:event_cmbBoxEnterpriseListActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBoxEnterpriseList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblName;
    private javax.swing.JComboBox networkCmbBox;
    private javax.swing.JTextField txtIssue;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
