package Persons;

import Enums.CoachRole;
import Persons.Worker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class Coach extends Worker {
    CoachRole coachRole;
    public Coach(){
        super();
    }
    public Coach(long phoneNumber, String firstName, String lastName, float salary, LocalDate dateOfEmployment, CoachRole coachRole){
        super(phoneNumber, firstName, lastName, salary, dateOfEmployment);
        this.coachRole = coachRole;
    }

    @Override
    protected void write(DataOutputStream stream) throws IOException {
        super.write(stream);
        stream.writeUTF(coachRole.name());
    }

    @Override
    protected void read(DataInputStream stream) throws IOException {
        super.read(stream);
        coachRole = CoachRole.valueOf(stream.readUTF());
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) +
                ", coachRole=" + coachRole +
                '}';
    }
}
