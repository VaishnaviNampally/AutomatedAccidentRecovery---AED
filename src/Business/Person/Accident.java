/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Dell
 */
public class Accident {
    private String Impact;
    private String State;
    private String Country;
    private String ZipCode;
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
    
    public String getImpact() {
        return Impact;
    }

    public void setImpact(String Impact) {
        this.Impact = Impact;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getTimestamp() {
        timestamp = dateFormat.format(cal.getTime());
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    
}
