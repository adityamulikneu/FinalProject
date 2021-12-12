/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Appointment.AppointmentDirectory;
import Business.Appointment.PatientAppointment;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Role.PharmacistRole;
import Business.UserAccount.UserAccount;
import Constants.StringConstants;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityamulik
 */
public class RequestPrescriptionMedicines extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    JPanel container;
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private int currentSelectedRow;
    private List<PatientAppointment> appointments;
    
    public RequestPrescriptionMedicines(JPanel container, EcoSystem system, UserAccount user) {
        initComponents();
        this.container = container;
        this.system = system;
        this.user = user;
        this.enterprise = user.getAssociatedEnterprise();
        
        populateWorkQueueTable();
        populatePharmacistComboList();
    }       
    
    public void populateWorkQueueTable() {
        
        AppointmentDirectory apptDir = system.getAppointmentDirectory();
        
//        System.out.println(apptDir.getAppointmentAccountList().size());
        
        DefaultTableModel model = (DefaultTableModel) tblWorkQueue.getModel();

        model.setRowCount(0);
        
        appointments = apptDir.getAppointmentAccountList();
        
        for (PatientAppointment w: appointments) {
            if (w.getStatus().equalsIgnoreCase(StringConstants.Status.GetMedications.toString()) && w.getReceiver() == null) {
                // System.out.println(w);
                Object[] row = new Object[5];
                row[0] = w.getSender();
                row[1] = w.getIssue();
                row[2] = w.getRequestDate().toString();
//                row[3] = null;
                row[3] = w.getReceiver();
                row[4] = w.getMessage();
                model.addRow(row);
            }
        }
    }
    
    public void populatePharmacistComboList() {
        
        for (UserAccount u: system.getUserAccountDirectory().getUserAccountList()) {  
            //System.out.println(u.getRole());
            if (u.getRole() instanceof PharmacistRole) {
//                    System.out.println(u);
                bmcPharmacistList.addItem(u);
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkQueue = new rojeru_san.complementos.RSTableMetro();
        bmcPharmacistList = new javax.swing.JComboBox();
        lblSender = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIssue = new javax.swing.JLabel();
        btnAssignWorkQueue = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Manage Prescriptions");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        tblWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Issue", "Request Date", "Reciever", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblWorkQueue.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorBordeFilas(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorBordeHead(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblWorkQueue.setColorFilasForeground1(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorFilasForeground2(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorSelBackgound(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setFuenteFilas(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblWorkQueue.setFuenteFilasSelect(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblWorkQueue.setFuenteHead(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tblWorkQueue.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblWorkQueue.setRowHeight(32);
        tblWorkQueue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkQueueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorkQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 680, 220));

        bmcPharmacistList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Pharmacist" }));
        bmcPharmacistList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmcPharmacistListActionPerformed(evt);
            }
        });
        add(bmcPharmacistList, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 390, -1));
        add(lblSender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 360, 20));

        jLabel3.setText("Select Patient from Work Queue");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel4.setText("Select Pharmacist:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, 20));

        jLabel5.setText("Issue:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, 20));

        jLabel6.setText("Sender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, 20));
        add(lblIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 350, 20));

        btnAssignWorkQueue.setText("Assign");
        btnAssignWorkQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignWorkQueueActionPerformed(evt);
            }
        });
        add(btnAssignWorkQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tblWorkQueueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkQueueMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblWorkQueue.getModel();
        currentSelectedRow = tblWorkQueue.getSelectedRow();
        
        String sender = model.getValueAt(tblWorkQueue.getSelectedRow(), 0).toString();
        String issue = model.getValueAt(tblWorkQueue.getSelectedRow(), 1).toString();
        
        lblSender.setText(sender);
        lblIssue.setText(issue);
        
        
    }//GEN-LAST:event_tblWorkQueueMouseClicked

    private void btnAssignWorkQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignWorkQueueActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblWorkQueue.getModel();
        currentSelectedRow = tblWorkQueue.getSelectedRow();
        
        String selectedUser = bmcPharmacistList.getSelectedItem().toString();
        UserAccount pharmacist = system.getUserAccountDirectory().getUserAccountList()
                .stream().filter(x -> x.getUsername().equals(selectedUser)).findFirst().orElse(null);
        
        PatientAppointment appointment = appointments.get(currentSelectedRow);
        if (pharmacist != null && appointment != null) {
            appointment.setReceiver(pharmacist);
        }
        populateWorkQueueTable();
    }//GEN-LAST:event_btnAssignWorkQueueActionPerformed

    private void bmcPharmacistListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmcPharmacistListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmcPharmacistListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bmcPharmacistList;
    private javax.swing.JButton btnAssignWorkQueue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIssue;
    private javax.swing.JLabel lblSender;
    private rojeru_san.complementos.RSTableMetro tblWorkQueue;
    // End of variables declaration//GEN-END:variables
}
