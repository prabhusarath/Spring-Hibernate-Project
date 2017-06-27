package io.sarath.basic;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by SarathKumar on 6/27/2017.
 */

@Entity
public class Workers {

    @Id
    private String empId;


    private String firstName;
    private String lastNmae;
    private String Email;

    public Workers(){
        this.empId = UUID.randomUUID().toString();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }
}
