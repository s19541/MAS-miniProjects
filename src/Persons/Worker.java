package Persons;

import Persons.Person;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Worker extends Person {
    float salary;
    LocalDate dateOfEmployment;
    public Worker(){
        super();
    }
    public Worker(long phoneNumber, String firstName, String lastName, float salary, LocalDate dateOfEmployment){
        super(phoneNumber,firstName,lastName);
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    protected void write(DataOutputStream stream) throws IOException {
        super.write(stream);
        stream.writeFloat(salary);
        stream.writeLong(dateOfEmployment.toEpochDay());
    }

    @Override
    protected void read(DataInputStream stream) throws IOException {
        super.read(stream);
        salary = stream.readFloat();
        dateOfEmployment = LocalDate.ofEpochDay(stream.readLong());
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) +
                ", salary=" + salary +
                ", dateOfEmployment=" + dateOfEmployment +
                '}';
    }
}
