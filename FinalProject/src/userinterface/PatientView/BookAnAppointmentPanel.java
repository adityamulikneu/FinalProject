/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientView;

import userinterface.SystemAdminWorkArea.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Patient.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
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
    
    public BookAnAppointmentPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPersonVisit = new java.awt.Button();
        btnVideoVisit = new java.awt.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book An Appointment");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientView/VideoVisit.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 210, 210));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientView/In_personVisit.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 200));

        btnPersonVisit.setActionCommand("Sign Up");
        btnPersonVisit.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        btnPersonVisit.setForeground(new java.awt.Color(0, 102, 153));
        btnPersonVisit.setLabel("In-Person Visit");
        btnPersonVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonVisitActionPerformed(evt);
            }
        });
        add(btnPersonVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 250, 50));

        btnVideoVisit.setActionCommand("Sign Up");
        btnVideoVisit.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        btnVideoVisit.setForeground(new java.awt.Color(0, 102, 153));
        btnVideoVisit.setLabel("Request a Video Visit");
        btnVideoVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoVisitActionPerformed(evt);
            }
        });
        add(btnVideoVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonVisitActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPersonVisitActionPerformed

    private void btnVideoVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoVisitActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnVideoVisitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnPersonVisit;
    private java.awt.Button btnVideoVisit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
