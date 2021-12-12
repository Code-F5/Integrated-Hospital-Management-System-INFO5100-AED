 /* and open the template in the editor.
 */
package Business.Instructor;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;


public class Instructor extends UserAccount {
    private String name;
    private String Type;
    private String ssn;
    private String phone;
    private String gender;
    private String dateOfBirth;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
    

   
    
}
