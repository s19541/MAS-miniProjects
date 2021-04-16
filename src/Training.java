import java.time.LocalDateTime;

public class Training {
    LocalDateTime startDate;
    Pitch pitch;
    public Training(LocalDateTime startDate){
        this.startDate = startDate;
    }
    public void setPitch(Pitch pitch){
        if(this.pitch!=null && this.pitch!=pitch){
            this.pitch.trainings.remove(this);
        }
            this.pitch = pitch;
            pitch.addTraining(this);
    }

    @Override
    public String toString() {
        return "Training{" +
                "startDate=" + startDate +
                ", pitchAddress=" + pitch.address +
                '}';
    }
}
