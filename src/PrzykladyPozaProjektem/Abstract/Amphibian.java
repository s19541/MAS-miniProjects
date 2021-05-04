package PrzykladyPozaProjektem.Abstract;

public class Amphibian extends Car implements IBoat {
    private float dockingCosts;
    public Amphibian(String name, float fuelCosts, float maintenanceCosts, float dockingCosts) {
        super(name, fuelCosts, maintenanceCosts);
        this.dockingCosts = dockingCosts;
    }

    @Override
    public float getRunningCosts() {
        return super.getRunningCosts() + dockingCosts;
    }
    @Override
    public float getDockingCosts() {
        return dockingCosts;
    }
    @Override
    public void setDockingCosts(float dockingCosts) {
        this.dockingCosts = dockingCosts;
    }
}
