/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.service;
import java.sql.Date;
/**
 *
 * @author Stark
 */
public class DateConverter {
    
    public static String date2String( Date d  ){
       return d.toString();
       
    }
    
    public static Date string2Date(String s){
        return Date.valueOf(s);
    }
    
    
    
}
