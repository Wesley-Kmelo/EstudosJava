/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.util.Date;
import java.lang.System;







/**
 *
 * @author W_TheVirous
 */
public class HoradoSIstema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        Date dia = new Date();
        System.out.println("A hora do sistema é  : ");
        System.out.println(dia.toString());
        System.out.println(System.getProperty("user.language"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user"));
                
       
    }
    
}
