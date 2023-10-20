package spacecoding.inheritance;

public class Student extends Person{
    int number;
    String school;
    String cl;
    public Student(String firstName, String lastName, int yob, int number){
        super(firstName,lastName,yob);
        this.number=number;
    }

    public void setMatricola(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    @Override
    public String toString() {
        String res;
        res=super.toString();
        res+= "number: " +number;
        return res;
    }

}
