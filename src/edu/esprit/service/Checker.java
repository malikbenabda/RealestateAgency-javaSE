/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.service;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author luca
 */
public class Checker {
    
     public static boolean checkEmail(String s) {
        Pattern p = Pattern.compile("^([A-Za-z0-9_-]||[.])+@{1}([a-z])+.{1}([a-z]){2,3}$");
        Matcher m = p.matcher(s.trim());
        if (m.matches()) {
           
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
    
    
    
    
}
