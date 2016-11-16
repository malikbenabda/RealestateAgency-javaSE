
package edu.esprit.entites;
/***********************************************************************
 * Module:  Question.java
 * Author:  Stark
 * Purpose: Defines the Class Question
 ***********************************************************************/

import java.util.*;

/** @pdOid 74d179ae-10d8-4d58-bf63-d34f2049f0a9 */
public class Question {
   /** @pdOid 77b485d6-7f51-445c-ae0f-a4e96108035c */
   private Client asker;
   /** @pdOid 2882b8e3-ccf0-4e9e-bd98-611dfd217ab6 */
   private Gerant answerer;
   /** @pdOid c2f0b94f-30ed-4ee8-b54c-2cc6601b91ed */
   private String sujet;
   /** @pdOid f3b9a38a-d2a0-406d-8a22-9fa274883062 */
   private String corps;
   /** @pdOid 6c561443-93d2-4d21-a21a-2015d72a3968 */
   private Date dateEnvoie;
   /** @pdOid 15f3374b-df64-48c3-bf77-e8eb41e4ef43 */
   private String type;
   /** @pdOid d8efb60a-1b6d-4340-9c69-20790af9632c */
   private int idQestion;
   /** @pdOid d2e3ac32-9528-43f8-a609-4dbd709970ed */
   private Boolean etat;

}