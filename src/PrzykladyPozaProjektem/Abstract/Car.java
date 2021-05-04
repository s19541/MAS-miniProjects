package PrzykladyPozaProjektem.Abstract;

public class Car extends Vehicle{
    private float fuelCosts;
    private float maintenanceCosts;
    public Car(String name, float fuelCosts, float maintenanceCosts) {
        super(name);
        this.fuelCosts = fuelCosts;
        this.maintenanceCosts = maintenanceCosts;
    }

    @Override
    public float getRunningCosts() {
        return fuelCosts + maintenanceCosts;
    }

    public float getFuelCosts() {
        return fuelCosts;
    }

    public float getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setFuelCosts(float fuelCosts) {
        this.fuelCosts = fuelCosts;
    }

    public void setMaintenanceCosts(float maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }
}
