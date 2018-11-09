/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalRole;
import Business.Role.Role;
import java.util.ArrayList;

public class ReceptionistOrganization extends Organization{

    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalRole());
        return roles;
    }
     
   
    
    
}
