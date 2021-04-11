package Persons;

import Enums.Position;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class Player extends Worker {
    Position position;
    int jerseyNumber;

    public Player(){
        super();
    }
    public Player(long phoneNumber, String firstName, String lastName, float salary, LocalDate dateOfEmployment, Position position, int jerseyNumber){
        super(phoneNumber, firstName, lastName, salary, dateOfEmployment);
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    protected void write(DataOutputStream stream) throws IOException {
        super.write(stream);
        stream.writeUTF(position.name());
        stream.writeInt(jerseyNumber);
    }

    @Override
    protected void read(DataInputStream stream) throws IOException {
        super.read(stream);
        position = Position.valueOf(stream.readUTF());
        jerseyNumber = stream.readInt();
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) +
                ", position=" + position +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
