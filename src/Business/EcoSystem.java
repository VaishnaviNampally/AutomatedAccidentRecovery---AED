package Business;

import Business.Country.CountryDirectory;
import Business.Organization.Organization;
import Business.Organization.PersonOrganization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private CountryDirectory countryList;
    private PersonOrganization personOrg;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        countryList = new CountryDirectory();
        personOrg = new PersonOrganization();

    }

    public PersonOrganization getPersonOrg() {
        return personOrg;
    }

    public void setPersonOrg(PersonOrganization personOrg) {
        this.personOrg = personOrg;
    }

    public CountryDirectory getCountryList() {
        return countryList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        return true;
    }
}
