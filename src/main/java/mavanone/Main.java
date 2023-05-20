package mavanone;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("mehdi");
        person.setLastName("arghan");
        System.out.println(person.getFirstName()+" "+person.getLastName());
    }
}
