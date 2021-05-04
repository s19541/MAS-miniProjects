package PrzykladyPozaProjektem.Abstract;

import java.util.EnumSet;


public class VehicleOverlapping {
    private String name;

    private float fuelCosts;
    private float maintenanceCosts;
    private float dockingCosts;
    private float hangarCosts;
    private EnumSet<VehicleType> vehicleKind = EnumSet.of(VehicleType.Vehicle);

    public VehicleOverlapping(String name, VehicleType...vehicleTypes){
        this.name = name;
        for(VehicleType vehicleType : vehicleTypes)
            vehicleKind.add(vehicleType);
    }
    public void setFuelCosts(float fuelCosts) throws  Exception{
        if(vehicleKind.contains(VehicleType.Car) || vehicleKind.contains(VehicleType.Airplane))
            this.fuelCosts = fuelCosts;
        else
            throw new Exception("This vehicle doesn't have fuel costs");
    }
    public void setMaintenanceCosts(float maintenanceCosts) throws  Exception{
        if(vehicleKind.contains(VehicleType.Car) || vehicleKind.contains(VehicleType.Airplane))
            this.maintenanceCosts = maintenanceCosts;
        else
            throw new Exception("This vehicle doesn't have maintenance costs");
    }
    public void setDockingCosts(Float dockingCosts) throws Exception{
        if(vehicleKind.contains(VehicleType.Boat))
            this.dockingCosts = dockingCosts;
        else
            throw new Exception("This vehicle doesn't have docking costs");
    }
    public void setHangarCosts(Float hangarCosts) throws Exception{
        if(vehicleKind.contains(VehicleType.Airplane)){
            this.hangarCosts = hangarCosts;
        }
        else
            throw new Exception("This vehicle doesn't have hangar costs");
    }
    public float getFuelCosts() throws  Exception{
        if(vehicleKind.contains(VehicleType.Car) || vehicleKind.contains(VehicleType.Airplane))
            return fuelCosts;
        else
            throw new Exception("This vehicle doesn't have fuel costs");
    }
    public float getMaintenanceCosts() throws  Exception{
        if(vehicleKind.contains(VehicleType.Car) || vehicleKind.contains(VehicleType.Airplane))
            return  maintenanceCosts;
        else
            throw new Exception("This vehicle doesn't have maintenance costs");
    }
    public float getDockingCosts() throws Exception{
        if(vehicleKind.contains(VehicleType.Boat))
           return dockingCosts;
        else
            throw new Exception("This vehicle doesn't have docking costs");
    }
    public float getHangarCosts() throws Exception{
        if(vehicleKind.contains(VehicleType.Airplane)){
            return hangarCosts;
        }
        else
            throw new Exception("This vehicle doesn't have hangar costs");
    }


}
