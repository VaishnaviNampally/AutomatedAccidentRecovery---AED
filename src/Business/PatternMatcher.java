/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Pattern;

/**
 *
 * @author Dell
 */
public class PatternMatcher {
    
     final Pattern pattern = Pattern.compile("^[A-Za-z, ]++$");
    final Pattern USPhoneNumber= Pattern.compile("^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$");
    final Pattern zipCodes = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");
    final Pattern SSN = Pattern.compile("^(\\d{3}-?\\d{2}-?\\d{4}|XXX-XX-XXXX)$");
    final Pattern emailID = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");;
//123-45-6789
//
//OR
//
//XXX-XX-XXXX
    final Pattern username_pattern = Pattern.compile("^[a-z0-9_]{3,16}$");
    final Pattern password_pattern = Pattern.compile("(?=.*\\d)(?=.*[A-Z])[0-9a-zA-Z]{4,}$");
    
    //Valid ZIP codes
//zips.add("12345"); 
//zips.add("12345-6789");

    public Pattern getPattern() {
        return pattern;
    }

    public Pattern getUSPhoneNumber() {
        return USPhoneNumber;
    }

    public Pattern getZipCodes() {
        return zipCodes;
    }

    public Pattern getSSN() {
        return SSN;
    }

    public Pattern getEmailID() {
        return emailID;
    }
    

    public Pattern getUsername_pattern() {
        return username_pattern;
    }

    public Pattern getPassword_pattern() {
        return password_pattern;
    }
    
}
