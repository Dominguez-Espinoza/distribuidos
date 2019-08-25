/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

/**
 *
 * @author rosario
 */
public class Reloj extends Thread {
    
   //              SimpleDateFormat dt = new SimpleDateFormat("HH:mm:ss");
      //public String time;// dt.format(new Date()); 
    public int hr;
    public int min;
    public int sec;
    public String time;
    public long inter;
    


    public Reloj(int hr, int min, int sec, String time, int inter) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        this.time = time;
        this.inter = inter;
    }

       public Reloj(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        
    }
       
          public Reloj(int hr, int min, int sec, int inter) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
               this.inter = inter;
    }
    
    
    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
         
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public long getInter() {
        return inter;
    }

    public void setInter(long inter) {
        this.inter = inter;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
   
    
    
    @Override
	public void run(){
                 
                           
                            
		while(true){
			//DEJAR PASAR UN SEGUNDO
			///System.out.println("1: "+hrs+":"+min+":"+seg);
			try{
                            
                            sec ++;
                            if(sec>=60)
                            {
                                min++;
                                sec=0;
                                if(min>=60)
                                {
                                   
                                    
                                    hr++;
                                     min=0;
                                    if(hr>=24)
                                    {
                                        hr=0;
                                    }
                                }
                                    
                            }
                           
                                
                           // time= Integer.toString(hr)+":"+Integer.toString(min)+":"+Integer.toString(sec);
                            
                          //  System.out.println(time);
                            Thread.currentThread().sleep(inter);
                        }catch(Exception e){e.printStackTrace();}
			
			
		}
	}
}