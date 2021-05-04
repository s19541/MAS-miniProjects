package PrzykladyPozaProjektem.Abstract;

public class Airplane extends Vehicle{
    private float fuelCosts;
    private float hangarCosts;
    private float maintenanceCosts;
    public Airplane(String name, float fuelCosts, float hangarCosts, float maintenanceCosts) {
        super(name);
        this.fuelCosts = fuelCosts;
        this.hangarCosts = hangarCosts;
        this.maintenanceCosts = maintenanceCosts;
    }

    @Override
    public float getRunningCosts() {
        return fuelCosts + hangarCosts + maintenanceCosts;
    }

    public void setMaintenanceCosts(float maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public void setFuelCosts(float fuelCosts) {
        this.fuelCosts = fuelCosts;
    }

    public void setHangarCosts(float hangarCosts) {
        this.hangarCosts = hangarCosts;
    }

    public float getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public float getFuelCosts() {
        return fuelCosts;
    }

    public float getHangarCosts() {
        return hangarCosts;
    }
}
