package spacecoding.inheritance;

public class TestPersons {
    public static void main(String[] args) {
        Person person=new Person("Gino","Rossi",2017);
        Student student=new Student("Balza","Verifiche",2005,1);
        System.out.println("Nome della persona: "+ person.getFirstName());
        System.out.println("Nome dello studente: "+ student.getFirstName());
        System.out.println("Matricola dello studente: " + student.toString());
        /* uso errato
        System.out.println("Matricola della persona: "+ person.getMatricola());
        */
        System.out.println(person.toString());
        System.out.println(student.toString());
    }
}
