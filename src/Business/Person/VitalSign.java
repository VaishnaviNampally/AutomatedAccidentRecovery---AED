/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.*;
import java.text.*;


/**
 *
 * @author SONY
 */
public class VitalSign {
    private int respRate;
    private int heartRate;
    private int bloodPressure;
    private float weight;
    private String timestamp;
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    Calendar cal = Calendar.getInstance();
   
    private String status;
   // private VitalSign vs;
    //private Person pat;

 public String getStatus(Person pa,VitalSign vs) {
      
       // int age=pa.getAge1();
        //int age = pa.getAge();
     int age= (pa.getAge());
        int resp = vs.getRespRate();
        int hrate = vs.getHeartRate();
        int bp = vs.getBloodPressure();
        float weight = vs.getWeight();
        if(age <=3 && age>=1){
            if(resp >= 20 && resp<=30 && hrate <= 130 && hrate>=80 && bp>= 80 && bp<=110 && weight<=31 && weight>=22)
            status = "NORMAL";
            else
                status="ABNORMAL";
        }
        else if(age <=5 && age>=4){
            if(resp >= 20 && resp<=30 && hrate <= 120 && hrate>=80 && bp>= 80 && bp<=110 && weight<=40 && weight>=31)
            status = "NORMAL";
              else
                status="ABNORMAL";
        }
        else if(age <=12 && age>=6){
            if(resp >= 20 && resp<=30 && hrate <= 110 && hrate>=70 && bp>= 80 && bp<=120 && weight<=92 && weight>=41)
            status = "NORMAL";
              else
                status="ABNORMAL";
        }
        else if(age>=13){
            if(resp >= 12 && resp<=20 && hrate <= 105 && hrate>=55 && bp>= 110 && bp<=120 && weight>110)
            status = "NORMAL";
              else
                status="ABNORMAL";
           
        }
        return status;
    }
    

    public void setStatus(String status) {
        this.status = status;
    }
   
    @Override
    public String toString()
    {
        return this.timestamp;
    }
    
    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTimestamp() {
        timestamp = dateFormat.format(cal.getTime());
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    
    
}
