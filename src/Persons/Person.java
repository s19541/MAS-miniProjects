package Persons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Person {
    long phoneNumber;
    String firstName;
    String lastName;
    Optional<String> emailAddress = Optional.empty();
    private static List<Person> extent = new ArrayList<>();
    public Person(){
        addPerson(this);
    }
    public Person(long phoneNumber, String firstName, String lastName){
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
       addPerson(this);
    }
    public static void showExtent() {
        System.out.println("Extent of the class: " + Person.class.getName());
        for (Person person : extent) {
            System.out.println(person);
        }
    }
    public static void addPerson(Person person){
        extent.add(person);
    }
    public static void removePerson(Person person){
        extent.remove(person);
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = Optional.of(emailAddress);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    protected void write(DataOutputStream stream) throws IOException {
        stream.writeUTF(this.getClass().getName());
        stream.writeUTF(firstName);
        stream.writeUTF(lastName);
        stream.writeLong(phoneNumber);
        if(emailAddress.isPresent())
            stream.writeUTF(emailAddress.get());
        else
            stream.writeUTF("");
    }
    protected void read(DataInputStream stream) throws IOException {
        firstName = stream.readUTF();
        lastName = stream.readUTF();
        phoneNumber = stream.readLong();
        String emailAddress = stream.readUTF();
        if(!emailAddress.equals(""))
            this.emailAddress = Optional.of(emailAddress);
    }
    public static void writeExtent(DataOutputStream stream) throws IOException {
        stream.writeInt(extent.size());
        for (Person person : extent) {
            person.write(stream);
        }
    }
    public static void readExtent(DataInputStream stream) throws IOException {
        Person person = null;
        int objectCount = stream.readInt();
        extent.clear();
        for (int i = 0; i < objectCount; i++) {
            switch(stream.readUTF()){
                case "Persons.Player":
                    person = new Player();
                    break;
                case "Persons.Coach":
                    person = new Coach();
                    break;
                case "Persons.Dietician":
                    person = new Dietician();
                    break;
                case "Persons.Worker":
                    person = new Worker();
                    break;
                case "Persons.Supporter":
                    person = new Supporter();
                    break;
                default:
                    System.out.println("Wrong class name");
            }
            person.read(stream);
        }

    }


    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "phoneNumber=" + phoneNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                (emailAddress.isPresent() ? ", emailAdress='" + emailAddress.get() + '\'' : "") +
                '}';
    }
}
