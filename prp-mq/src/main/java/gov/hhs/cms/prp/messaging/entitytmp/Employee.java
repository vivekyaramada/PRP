package gov.hhs.cms.prp.messaging.entitytmp;

/**
 * Created by jarsen on 10/15/15.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String gender;
    private String ssn;
    private Double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nClass name: Employee\n");
        sb.append("-----------------------\n");
        sb.append("First name: " + this.firstName + "\n");
        sb.append("Last name: " + this.lastName + "\n");
        sb.append("Gender: " + this.gender + "\n");
        sb.append("SSN: " + this.ssn + "\n");
        sb.append("Salary: " + this.salary + "\n");
        return sb.toString();
    }
}
