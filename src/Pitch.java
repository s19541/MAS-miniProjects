import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pitch {
    float surface;
    String address;
    private List<Training> trainings = new ArrayList<>();

    public Pitch(float surface, String address){
        this.surface=surface;
        this.address=address;
    }
    public void addTraining(Training training){
        if(!trainings.contains(training)) {
            trainings.add(training);
            training.setPitch(this);
        }
    }
    public void removeTraining(Training training){
        trainings.remove(training);
    }

    @Override
    public String toString() {
        return "Pitch{" +
                "surface=" + surface +
                ", address='" + address + '\'' +
                ", trainings=" + trainings +
                '}';
    }
}
