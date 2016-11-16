/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.service;

/**
 *
 * @author luca
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class Mail {

    //  private static String USER_NAME;  // GMail user name (just the part before "@gmail.com")
    //private static String PASSWORD; // GMail password
    //private static String RECIPIENT;
    public static Boolean send(String from, String pass, String to, String subject, String body) {
        try {
            sendFromGmailTSL(from, pass, to, subject, body);
            JOptionPane.showMessageDialog(null, "Email envoye avec succes");
            return Boolean.TRUE;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifiez votre adresse et mot de passe SVP");
            return Boolean.FALSE;

        }
    }

    private static void sendFromGmailTSL(String from, String pass, String to, String subject, String body) {
        try {
            Properties props = System.getProperties();
            String host = "smtp.gmail.com";
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.password", pass);
            props.put("mail.smtp.port", "587"); //465 SSL   --- 587 TSL
            props.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            InternetAddress toAddress = new InternetAddress(to);
            message.addRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException ae) {
            ae.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
        }
    }

}
