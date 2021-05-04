package PrzykladyPozaProjektem.Abstract;

public class Boat extends Vehicle{
    private float dockingCosts;
    public Boat(String name, Float dockingCosts) {
        super(name);
        this.dockingCosts = dockingCosts;
    }

    @Override
    public float getRunningCosts() {
        return dockingCosts;
    }

    public void setDockingCosts(float dockingCosts) {
        this.dockingCosts = dockingCosts;
    }

    public float getDockingCosts() {
        return dockingCosts;
    }
}
