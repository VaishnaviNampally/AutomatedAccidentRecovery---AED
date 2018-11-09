
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Person implements Comparable<Person> {
    private String Name;
    private String SSN;
    private int age;
    private String DOB;
    private String phoneNumber;
    private String emailID;
    private String Address;
    private int accidentNo;
    private VitalSignHistory vitalSignHistory;
    private AccidentHistory accidentHistory;
    private Documents docList;

    public Person() {
        this.vitalSignHistory = new VitalSignHistory();
        this.accidentHistory= new AccidentHistory();
        this.docList= new Documents();
    }

    public Documents getDocList() {
        return docList;
    }

    public void setDocList(Documents docList) {
        this.docList = docList;
    }
    
    

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

     public AccidentHistory getAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(AccidentHistory accidentHistory) {
        this.accidentHistory = accidentHistory;
    }
    
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
   public int getAge() {

        String datetext = getDOB(); // Date in text
        try {
            Calendar birth = new GregorianCalendar();
            Calendar today = new GregorianCalendar();
            age = 0;
            int factor = 0; //to correctly calculate age when birthday has not been yet celebrated
            Date birthDate = new SimpleDateFormat("MM-dd-yyyy").parse(datetext);
            Date currentDate = new Date(); //current date
            birth.setTime(birthDate);
            today.setTime(currentDate);
            // check if birthday has been celebrated this year
            if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
                factor = -1; //birthday not celebrated
            }
            age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
            System.out.println(age);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,"Given date: " + datetext + " not in expected format (Please enter a MM-DD-YYYY date)");
        }
        return age;
    }
  
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAccidentNo() {
        return accidentNo;
    }

    public void setAccidentNo() {
        this.accidentNo = accidentNo+1;
    }

   
    
    

    @Override
    public int compareTo(Person o) {
       int compareNA= ((Person)o).getAccidentNo();
       return compareNA - this.getAccidentNo();
    }
}
