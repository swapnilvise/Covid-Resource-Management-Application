/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LoginPage;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author swapn
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private String role;
    
    public SignUpJPanel(JPanel userProcessContainer, EcoSystem ecosystem, DB4OUtil dB4OUtil,String role) {
        initComponents();
        this.container = userProcessContainer;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.role=role;
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D)g;
        int width=getWidth();
        int height= getHeight();
        
        Color color1= new Color(0, 105, 146);
        Color color2= new Color(162, 238, 242);
        GradientPaint gp = new GradientPaint(0,0,color1,0,height,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldFirstName = new javax.swing.JTextField();
        labelFirstName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        labelPhoneNumber = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCnfPassword = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldCnfPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelusername = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelStreetName = new javax.swing.JLabel();
        labelState = new javax.swing.JLabel();
        jTextFieldZip = new javax.swing.JTextField();
        jTextFieldState = new javax.swing.JTextField();
        jTextFieldStreetName = new javax.swing.JTextField();
        labelZip = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        labelCity = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        jTextFieldCountry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(60, 63, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 357, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 15, 432));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 45, 192, 25));

        labelFirstName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFirstName.setText("First Name:");
        jPanel1.add(labelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Last Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setText("Personal Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 6, -1, -1));

        jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, 192, 25));
        jPanel1.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 82, 192, 25));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 156, 192, 25));

        labelPhoneNumber.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPhoneNumber.setText("Phone Number:");
        jPanel1.add(labelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 110, 25));

        labelEmail.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("Email ID:");
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 156, 110, 25));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-account-24.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel2.setOpaque(false
        );
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCnfPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCnfPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCnfPassword.setText("Confirm Password:");
        jPanel2.add(labelCnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 110, 25));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 45, 192, -1));

        jTextFieldCnfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCnfPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, 192, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel4.setText("Account Details");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 6, -1, -1));

        labelPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword.setText("Password:");
        jPanel2.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        labelusername.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername.setText("User Name:");
        jPanel2.add(labelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        SignUpButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        SignUpButton.setText("Register");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 162, 100, -1));

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 82, 192, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-mail-account-24.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 40, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelStreetName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelStreetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelStreetName.setText("Street Name:");
        jPanel3.add(labelStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        labelState.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelState.setText("State:");
        jPanel3.add(labelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 110, 25));

        jTextFieldZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldZipActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 193, 192, 25));

        jTextFieldState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStateActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldState, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, 192, 25));

        jTextFieldStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStreetNameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 45, 192, 25));

        labelZip.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelZip.setText("Zip Code:");
        jPanel3.add(labelZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 193, 110, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel2.setText("Address Details");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 6, -1, -1));

        labelCountry.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCountry.setText("Country:");
        jPanel3.add(labelCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 156, 110, 25));

        labelCity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCity.setText("City:");
        jPanel3.add(labelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        jTextFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCityActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 82, 192, 25));

        jTextFieldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCountryActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 156, 192, 25));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-address-24.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team.gif"))); // NOI18N
        jLabel9.setText("jLabel9");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 380, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStreetNameActionPerformed

    private void jTextFieldStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStateActionPerformed

    private void jTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCountryActionPerformed

    private void jTextFieldZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldZipActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldCnfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCnfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCnfPasswordActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane message = new JOptionPane();
        int errorCode = validatePersonalDetails();

        switch (errorCode) {
            case 1:
                message.showMessageDialog(this,
                        "First Name cannot be empty and has to be only alphabets");
                break;
            case 2:
                message.showMessageDialog(this,
                        "Last Name has to be only alphabets");
                break;
            case 3:
                message.showMessageDialog(this,
                        "Phone number is invalid");
                break;
            case 4:
                message.showMessageDialog(this,
                        "Invalid Email format.");
                break;
            case 6:
                message.showMessageDialog(this,
                        "Street Name cannot be empty.");
                break;
            case 7:
                message.showMessageDialog(this,
                        "City cannot be empty and "
                        + "has to be alphabets in home address");
                break;
            case 8:
                message.showMessageDialog(this,
                        "State cannot be empty and "
                        + "has to be alphabets in home address");
                break;
            case 9:
                message.showMessageDialog(this,
                        "Country cannot be empty and "
                        + "has to be alphabets in home address");
                break;
            case 10:
                message.showMessageDialog(this,
                        "Zip Code cannot be empty"
                        + " and has to be numeric in home address");
                break;
            case 11:
                message.showMessageDialog(this,
                        "Username already in use. Try a different username.");
                break;
            case 12:
                message.showMessageDialog(this,
                        "Passwords do not match");
                break;
            case 13:
                message.showMessageDialog(this,
                        "Password fields cannot be empty.");
                break;

            default:
//                if(this.role=="Customer"){
//                    Customer nc = this.ecosystem.getCustomerDirectory().newCustomer();
//                    UserAccount nua = this.ecosystem.getUserAccountDirectory().createUserAccount(
//                            jTextFieldUserName.getText(), jTextFieldPassword.getText(), new CustomerRole());
//                    nc.setCustomerAccount(nua);
//                    nc.setFirstName(jTextFieldFirstName.getText());
//                    nc.setLastName(jTextFieldLastName.getText());
//                    nc.setEmailId(jTextFieldEmail.getText());
//                    nc.setPhoneNo(jTextFieldPhoneNumber.getText());
//                    nc.getAddress().setStreetAddress(jTextFieldStreetName.getText());
//                    nc.getAddress().setCity(jTextFieldCity.getText());
//                    nc.getAddress().setState(jTextFieldState.getText());
//                    nc.getAddress().setCountry(jTextFieldCountry.getText());
//                    nc.getAddress().setZipCode(jTextFieldZip.getText());
//                    message.showMessageDialog(this,
//                            "Registered Successfully. Login to continue.");
//
//                    container.remove(this);
//                    CardLayout layout = (CardLayout) container.getLayout();
//                    layout.previous(container);
//                }
//                else if(this.role=="DeliveryMan"){
//                    DeliveryMan nc = this.ecosystem.getDeliveryManDirectory().newDeliveryMan();
//                    UserAccount nua = this.ecosystem.getUserAccountDirectory().createUserAccount(
//                            jTextFieldUserName.getText(), jTextFieldPassword.getText(), new DeliverManRole());
//                    nc.setDeliveryManAccount(nua);
//                    nc.setFirstName(jTextFieldFirstName.getText());
//                    nc.setLastName(jTextFieldLastName.getText());
//                    nc.setEmailId(jTextFieldEmail.getText());
//                    nc.setPhoneNo(jTextFieldPhoneNumber.getText());
//                    nc.getAddress().setStreetAddress(jTextFieldStreetName.getText());
//                    nc.getAddress().setCity(jTextFieldCity.getText());
//                    nc.getAddress().setState(jTextFieldState.getText());
//                    nc.getAddress().setCountry(jTextFieldCountry.getText());
//                    nc.getAddress().setZipCode(jTextFieldZip.getText());
//                    message.showMessageDialog(this,
//                            "Registered Successfully. Login to continue.");
//
//                    container.remove(this);
//                    CardLayout layout = (CardLayout) container.getLayout();
//                    layout.previous(container);
//                }

                break;
        }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void jTextFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCityActionPerformed

    private int validatePersonalDetails() {

        int errorCode = 0;

        if (jTextFieldFirstName.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldFirstName.getText())) {
            errorCode = 1;
        } else if (!jTextFieldLastName.getText().isEmpty()
                & !Pattern.matches("[a-zA-Z]+", jTextFieldLastName.getText())) {
            errorCode = 2;
        } else if (!jTextFieldPhoneNumber.getText().isEmpty()
                & !Pattern.matches("{10}[0-9]+", jTextFieldPhoneNumber.getText())
                | jTextFieldPhoneNumber.getText().length() != 10) {
            errorCode = 3;
        } else if (jTextFieldEmail.getText().isEmpty()
                | !Pattern.matches(
                        "^(.+)@(.+)$",
                        jTextFieldEmail.getText())) {
            errorCode = 4;
        } else if (jTextFieldStreetName.getText().isEmpty()) {
            errorCode = 6;
        } else if (jTextFieldCity.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldCity.getText())) {
            errorCode = 7;
        } else if (jTextFieldState.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldState.getText())) {
            errorCode = 8;
        } else if (jTextFieldCountry.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldCountry.getText())) {
            errorCode = 9;
        } else if (jTextFieldZip.getText().isEmpty()
                | !Pattern.matches("[0-9]+", jTextFieldZip.getText())) {
            errorCode = 10;
        } else if (!this.ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(jTextFieldUserName.getText())) {
            errorCode = 11;
        }else if (!jTextFieldPassword.getText().equals(jTextFieldCnfPassword.getText())) {
            errorCode = 12;
        }else if(jTextFieldPassword.getText().isEmpty() | jTextFieldCnfPassword.getText().isEmpty()){
            errorCode = 13;
        }

        return errorCode;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldCnfPassword;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JTextField jTextFieldStreetName;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JTextField jTextFieldZip;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelCnfPassword;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelStreetName;
    private javax.swing.JLabel labelZip;
    private javax.swing.JLabel labelusername;
    // End of variables declaration//GEN-END:variables
}