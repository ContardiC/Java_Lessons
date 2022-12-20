package spacecoding.inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    String firstName;
    String lastName;
    int yob;

    public Person(String firstName, String lastName, int yob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.yob=yob;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    public int getYob() {
        return yob;
    }
    public int getCurrentAge(){
        GregorianCalendar calendar=new GregorianCalendar();
        int currentYear=calendar.get(Calendar.YEAR);
        return currentYear-yob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yob=" + yob +
                '}';
    }
}
