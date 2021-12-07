/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;

import Business.Organization;
import Business.Patient.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author adityamulik
 */
public class MainJFrame extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private boolean flag = false;
    

    public MainJFrame() {
        initComponents();       
        system = dB4OUtil.retrieveSystem();  
        
        if (user != null) {
            if (user.getEmployee().getName() == "sysadmin") {
                this.setWelcomeMessage("Welcome " + user.getEmployee().getName());
            }
        }
        this.loginJPanel.setVisible(true);
        this.container.setVisible(false);
        this.menubar.setVisible(false);                
     }      
    
    @Override
    public void run() {                    
//        this.progressBarjPanel.setVisible(false);
        for(int i=1; i<=100; i++) {
            try {
                Thread.sleep(20);
                loginProgressBar.setValue(i);
            } catch (Exception e) {
                System.out.println("Check thread!");
            }            
//            lblCount.setText(i + " %");            
        }
        this.loginJPanel.setVisible(false);
        this.container.setVisible(true);
        this.menubar.setVisible(true);   
        loginProgressBar.setValue(0);
        
        txtUserName.setText("");
        txtPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menubar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblWelcomeMessage = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new java.awt.Button();
        lblExit = new javax.swing.JLabel();
        loginProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 723));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubar.setBackground(new java.awt.Color(204, 0, 51));
        menubar.setPreferredSize(new java.awt.Dimension(1230, 60));
        menubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_menu_48px_1.png"))); // NOI18N
        menubar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 60));

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login-png.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLogoutMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        menubar.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 30, 60));

        lblWelcomeMessage.setFont(new java.awt.Font("Geneva", 0, 20)); // NOI18N
        lblWelcomeMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomeMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male_user_50px.png"))); // NOI18N
        lblWelcomeMessage.setText("  Welcome!");
        menubar.add(lblWelcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 170, 60));

        getContentPane().add(menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        container.setPreferredSize(new java.awt.Dimension(1230, 663));
        container.setRequestFocusEnabled(false);
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 1230, 660));

        loginJPanel.setPreferredSize(new java.awt.Dimension(1230, 723));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 723));
        loginJPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 723));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        txtUserName.setBackground(new java.awt.Color(32, 33, 35));
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setBorder(null);
        txtUserName.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 370, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 370, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 370, -1));

        jLabel3.setForeground(new java.awt.Color(57, 113, 177));
        jLabel3.setText("Username:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 20));

        txtPassword.setBackground(new java.awt.Color(32, 33, 35));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 370, 40));

        btnLogin.setBackground(new java.awt.Color(204, 0, 51));
        btnLogin.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setLabel("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 250, 50));
        btnLogin.getAccessibleContext().setAccessibleName("btnLogin");

        lblExit.setFont(new java.awt.Font("Lucida Grande", 1, 22)); // NOI18N
        lblExit.setForeground(new java.awt.Color(204, 0, 51));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setToolTipText("Click to close.");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
        });
        jPanel2.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 50));
        jPanel2.add(loginProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 250, 10));

        loginJPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
//        Login newLogin = new Login(container);       
//        container.add(newLogin);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMousePressed
        logout();          
    }//GEN-LAST:event_lblLogoutMousePressed

    private void lblLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseReleased

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        
    }//GEN-LAST:event_lblExitMousePressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        MainJFrame mainFrame = new MainJFrame();
        CardLayout layout = (CardLayout) container.getLayout();
        
        if (txtUserName.getText().equals("") || txtPassword.getPassword().equals("")) {
           JOptionPane.showMessageDialog(null, "Please enter the required fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            user = system.getUserAccountDirectory().authenticateUser(txtUserName.getText(), String.valueOf(txtPassword.getPassword()));                
            if(user == null) {
                JOptionPane.showMessageDialog(null, "Please enter correct Username and Password!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                 if(user.getRole().toString() == "Business.Role.SystemAdminRole") {
                    System.out.println("This is sys admin!");
                    Employee e = user.getEmployee();   
                    
                    SystemAdminWorkAreaJPanel sysAdmin = new SystemAdminWorkAreaJPanel(container, system);
                    
                    container.add("workArea", user.getRole().createWorkArea(container, user, system));
                    layout.next(container);
                    mainFrame.setWelcomeMessage("Welcome " + e.getName() + "!");
                } else if (user.getRole().toString() == "Business.Role.PatientRole") {
                    System.out.println("This is patient role");
                    Employee e = user.getEmployee();  
                    
                    container.add("workArea", user.getRole().createWorkArea(container, user, system));
                    layout.next(container);
                    mainFrame.setWelcomeMessage("Welcome " + e.getName() + "!");
                }                                     
                 
                Thread t = new Thread(this);
                t.start();

                 
                 
                 
                // Display appropriate layout
//                this.loginJPanel.setVisible(false);
//                this.container.setVisible(true);
//                this.menubar.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public void logout() {
        dB4OUtil.storeSystem(system);
//        container.removeAll();
        this.loginJPanel.setVisible(true);
        this.container.setVisible(false);
        this.menubar.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    public void setWelcomeMessage(String message) {
        lblWelcomeMessage.setText(message);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblWelcomeMessage;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JProgressBar loginProgressBar;
    private javax.swing.JPanel menubar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
