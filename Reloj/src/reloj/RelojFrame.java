/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.awt.Frame;
import java.time.LocalTime;
import java.util.Formatter;

/**
 *
 * @author rosar
 */
public class RelojFrame {
    static Reloj r1;
     static    Reloj r2;
     static    Reloj r3;
     static    Reloj r4;
    static  VistaReloj v ;
  
        
    public static void main (String [] args)
    {
        
       LocalTime myObj = LocalTime.now();
      
         r1= new Reloj( myObj.getHour(),myObj.getMinute(),myObj.getSecond(),1000);
        r2= new Reloj(12,30,55,1000);
        r3= new Reloj(3,1,1,1000);
        r4= new Reloj(4,1,1,1000);
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        v= new VistaReloj();
         v.setVisible(true);
        while(true)
        {
            v.jLabel1.setText(String.format("%02d", r1.getHr())+":"+String.format("%02d", r1.getMin())+":"+String.format("%02d", r1.getSec()));
            v.jLabel2.setText(String.format("%02d", r2.getHr())+":"+String.format("%02d", r2.getMin())+":"+String.format("%02d", r2.getSec()));
            v.jLabel3.setText(String.format("%02d", r3.getHr())+":"+String.format("%02d", r3.getMin())+":"+String.format("%02d", r3.getSec()));
            v.jLabel4.setText(String.format("%02d", r4.getHr())+":"+String.format("%02d", r4.getMin())+":"+String.format("%02d", r4.getSec()));
       
        }
        
        
    }            
}
