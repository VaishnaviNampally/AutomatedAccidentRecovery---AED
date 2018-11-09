/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AmbulanceRole.AmbulanceAdminWorkAreaJPanel;
import javax.swing.JPanel;

public class AmbulanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmbulanceAdminWorkAreaJPanel(userProcessContainer,business, account, (AmbulanceOrganization)organization, enterprise);
    }
    
    
}
