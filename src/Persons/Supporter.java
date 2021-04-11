package Persons;

import Persons.Person;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Supporter extends Person {
    boolean hasFanCard = false;
    public Supporter(){
        super();
    }
    public Supporter(long phoneNumber, String firstName, String lastName){
        super(phoneNumber,firstName,lastName);
    }
    public Supporter(long phoneNumber, String firstName, String lastName, boolean hasFanCard){
        super(phoneNumber,firstName,lastName);
        this.hasFanCard = hasFanCard;
    }

    @Override
    protected void read(DataInputStream stream) throws IOException {
        super.read(stream);
        hasFanCard = stream.readBoolean();
    }

    @Override
    protected void write(DataOutputStream stream) throws IOException {
        super.write(stream);
        stream.writeBoolean(hasFanCard);
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) +
                ", hasFanCard=" + hasFanCard +
                '}';
    }
}
