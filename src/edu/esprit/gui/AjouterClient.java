/*
 * To change this license heade
 @Override
 public boolean verify(JComponent jc) {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 r, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import com.sun.corba.se.spi.protocol.ClientDelegateFactory;
import edu.esprit.DAO.AdminDAO;
import edu.esprit.DAO.ClientDAO;
import edu.esprit.DAO.GerantDAO;
import edu.esprit.entites.Client;
import java.awt.Color;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author luca
 */
public class AjouterClient extends javax.swing.JFrame {

    /**
     * Creates new form AjouterClient
     */
    public AjouterClient() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHead = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passwordconfirmField = new javax.swing.JPasswordField();
        prenomfield = new javax.swing.JTextField();
        nomfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        adressefield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        telfield = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S'enregistrer");
        setBackground(new java.awt.Color(199, 199, 199));
        setBounds(new java.awt.Rectangle(255, 22, 0, 0));
        setName("ajoutframe"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel2.setBackground(new java.awt.Color(254, 251, 177));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenue");
        jLabel2.setToolTipText("");
        jPanelHead.add(jLabel2);

        getContentPane().add(jPanelHead, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Nom");

        loginfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginfieldActionPerformed(evt);
            }
        });
        loginfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginfieldFocusLost(evt);
            }
        });

        jLabel4.setText("Mot de passe");

        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        btnlogin.setText("S'inscrire");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Confirmer Mot de passe");

        passwordconfirmField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordconfirmFieldFocusLost(evt);
            }
        });
        passwordconfirmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordconfirmFieldKeyReleased(evt);
            }
        });

        prenomfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prenomfieldFocusLost(evt);
            }
        });

        nomfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomfieldFocusLost(evt);
            }
        });

        jLabel7.setText("Login");

        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });
        emailfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailfieldFocusLost(evt);
            }
        });

        adressefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressefieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Prenom");

        jLabel9.setText("email");

        jLabel11.setText("Date naissance");

        jLabel12.setText("Adresse");

        jLabel13.setText("Telephone");

        telfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telfieldActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField)
                            .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                            .addComponent(passwordconfirmField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prenomfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomfield)
                            .addComponent(emailfield)
                            .addComponent(adressefield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telfield)
                            .addComponent(loginfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordconfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private Boolean validEntry() {
        if (//  Test here all cheks with && , if they all are valid then result is TRUE , else 
                //if one is false then result --> FALSE
                (checkPassword()) && (checkPasswordConfirm())
                //check pwd and its confirm ( for more details check method commentation
                && (checkLogin(loginfield.getText())) //check if login already exists before attempting to do anything
                //non et prenom non nul
                && (checkPrenom()) && (checknom()) /*
                 &&
                 (checkDate format and if it's real)
                 &&
                 (checktelephone)*/

                && (checkEmail())) {
            JOptionPane.showMessageDialog(null, "valid entree");
            return Boolean.TRUE;
        } else {

            JOptionPane.showMessageDialog(null, "faulty entree");
            return Boolean.FALSE;
        }

    }

    private Boolean checkLogin(String login) {
        if (!ClientDAO.getInstance().clientExistsByLogin(login) /*
                 && !GerantDAO.getInstance().gerantExistsByLogin(login)
                
                 && !AdminDAO.getInstance().gerantExistsByLogin(login)
                
                 */) {
            loginfield.setForeground(Color.GREEN);
            return Boolean.TRUE;
        } else {
            loginfield.setForeground(Color.red);
            return Boolean.FALSE;
        }

    }


    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        // teste de validation des champs !!!  apres lancer l
        if (validEntry()) {

            Client cl = new Client();
            cl.setLogin(loginfield.getText());
            cl.setPassword(String.valueOf(passwordField.getPassword()));
            cl.setPrenom(prenomfield.getText());
            cl.setNom(nomfield.getText());
            cl.setEmail(emailfield.getText());
            cl.setAdresse(adressefield.getText());
            // java.util.DAte to java.sql.Date
            java.sql.Date dnsql = new java.sql.Date(jCalendar1.getCalendar().getTime().getTime());

            cl.setDateNaissance(dnsql);
            cl.setTelephone(Integer.parseInt(telfield.getText()));
            cl.setEtat(true);
            ClientDAO cldao = ClientDAO.getInstance();

            cldao.ajoutertClient(cl);
            JOptionPane.showMessageDialog(null, "Ajout Client avec succes");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez verifier votre saisie", "entrée non valide", ERROR);
        }


    }//GEN-LAST:event_btnloginActionPerformed

    private Boolean checkPasswordConfirm() {
        String pwd = String.valueOf(passwordField.getPassword()).trim();
        String pwdcnf = String.valueOf(passwordconfirmField.getPassword()).trim();
//check if fields match
        if (pwd.equals(pwdcnf)) {
            passwordconfirmField.setForeground(Color.GREEN);
            return Boolean.TRUE;
        } else {
            passwordconfirmField.setForeground(Color.red);
            passwordconfirmField.setToolTipText("confirmation does not match");
            return Boolean.FALSE;
        }

    }

    private Boolean checkPassword() {
        String pwd = String.valueOf(passwordField.getPassword()).trim();
        //check pwd length
        if (passwordField.getPassword().length >= 8) {
            passwordField.setForeground(Color.GREEN);
            return Boolean.TRUE;
        } else {
            passwordField.setToolTipText("password too shorter than 8 chars reccomanded");

            passwordField.setForeground(Color.red);
            return Boolean.FALSE;
        }
    }

    private Boolean checkPrenom() {
        if (!prenomfield.getText().trim().isEmpty()) {
            prenomfield.setForeground(Color.green);
            return Boolean.TRUE;

        } else {
            prenomfield.setToolTipText("prenom requis");
            prenomfield.setForeground(Color.red);
            return Boolean.FALSE;

        }
    }

    private Boolean checknom() {
        if (!nomfield.getText().trim().isEmpty()) {
            nomfield.setForeground(Color.green);
            return Boolean.TRUE;

        } else {
            nomfield.setToolTipText("non requis");
            nomfield.setForeground(Color.red);
            return Boolean.FALSE;

        }
    }


    private void adressefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressefieldActionPerformed

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void telfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telfieldActionPerformed

    private void passwordconfirmFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordconfirmFieldFocusLost

        checkPasswordConfirm();


    }//GEN-LAST:event_passwordconfirmFieldFocusLost

    private void passwordconfirmFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordconfirmFieldKeyReleased

        checkPasswordConfirm();// TODO add your handling code here:
    }//GEN-LAST:event_passwordconfirmFieldKeyReleased

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost

        checkPassword();        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldFocusLost

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased

        checkPassword();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void prenomfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prenomfieldFocusLost
        checkPrenom();        // TODO add your handling code here:
    }//GEN-LAST:event_prenomfieldFocusLost

    private void nomfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomfieldFocusLost
        checknom();        // TODO add your handling code here:
    }//GEN-LAST:event_nomfieldFocusLost

    private void loginfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginfieldFocusLost
        checkLogin(loginfield.getText().trim());

// TODO add your handling code here:
    }//GEN-LAST:event_loginfieldFocusLost

    private void emailfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusLost
        checkEmail();        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldFocusLost

    private void loginfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginfieldActionPerformed

    /*   private Boolean checkDate() {
     try {

     Date dn = Date.valueOf(datenaissancefield.getText().trim());
     datenaissancefield.setForeground(Color.GREEN);

     return Boolean.TRUE;
     } catch (Exception e) {
     datenaissancefield.setToolTipText("must be in format : yyyy-mm-dd");
     datenaissancefield.setForeground(Color.red);

     return Boolean.FALSE;

     }
     }
     */
    private boolean checkEmail() {
        Pattern p = Pattern.compile("^([A-Za-z0-9_-]||[.])+@[a-z]+.[a-z]{2,3}");
        Matcher m = p.matcher(emailfield.getText().trim());
        if (m.matches()) {
            emailfield.setForeground(Color.GREEN);

            return Boolean.TRUE;
        } else {
            emailfield.setForeground(Color.red);
            emailfield.setToolTipText("enter a valid email adress");
            return Boolean.FALSE;
        }
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
            java.util.logging.Logger.getLogger(AjouterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressefield;
    private javax.swing.JButton btnlogin;
    private javax.swing.JTextField emailfield;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField loginfield;
    private javax.swing.JTextField nomfield;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordconfirmField;
    private javax.swing.JTextField prenomfield;
    private javax.swing.JTextField telfield;
    // End of variables declaration//GEN-END:variables
}
