/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AssitantDoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class AssitantDoctorOrganization extends Organization {
  public AssitantDoctorOrganization() {
        super(Organization.Type.AssitantDoctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AssitantDoctorRole());
        return roles;
    }
     
}
