package replit.Custom;

public class Person {

    private String firstname, lastName, ssn;
    private int birthmonth, birthday, birthyear;

    public Person(String firstname, String lastName, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday(){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }

    public boolean verifySSN(String str){
        if (ssn.equals(str)) return true;
        else return false;
    }
}
