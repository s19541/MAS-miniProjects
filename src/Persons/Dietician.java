package Persons;

import Persons.Worker;

import java.time.LocalDate;

public class Dietician extends Worker {
    public Dietician(){
        super();
    }
    public Dietician(long phoneNumber, String firstName, String lastName, float salary, LocalDate dateOfEmployment){
        super(phoneNumber, firstName, lastName, salary, dateOfEmployment);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
