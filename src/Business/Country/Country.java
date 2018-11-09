/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.State.StateDirectory;
import java.util.ArrayList;

public class Country extends Organization {
    
    private String name;
    private StateDirectory stateList;

    public Country(String name) {
        super(name);
        setName(name);
        stateList= new StateDirectory();
    }

    public StateDirectory getStateList() {
        return stateList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
