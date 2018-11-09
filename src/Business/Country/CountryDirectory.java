/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import java.util.ArrayList;

public class CountryDirectory {
     private ArrayList<Country> countryDirectory;

    public CountryDirectory() {
        countryDirectory = new ArrayList<>();
    }

    public ArrayList<Country> getCountryDirectory() {
        return countryDirectory;
    }
 
    public Country createAndAddCountry(String name){
    Country country = new Country(name);
    countryDirectory.add(country);
    return country;
    }  
    
    public boolean checkIfCountryIsUnique(String username){
        for (Country ua : countryDirectory){
            if (ua.getName().equals(username))
                return false;
        }
        return true;
    }
}
