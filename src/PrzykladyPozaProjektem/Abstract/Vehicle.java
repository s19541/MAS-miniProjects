package PrzykladyPozaProjektem.Abstract;

import java.time.LocalDate;

public abstract class Vehicle {
    private String name;
    private Status status = Status.Available;

    private int price;
    private LocalDate saleDate;
    public Vehicle(String name){
        this.name = name;
    }
    public abstract float getRunningCosts();

    public String getName() {
        return name;
    }
    public void sellVehicle(LocalDate saleDate) throws Exception {
        if(status == Status.Available) {
            status = Status.Sold;
            this.saleDate = saleDate;
        }
        else
            throw new Exception("This vehicle is already sold");
    }
    public void returnVehicle(int price) throws Exception {
        if(status == Status.Sold) {
            status = Status.Available;
            this.price = price;
        }
        else
            throw new Exception("This vehicle is already available");
    }
    public void returnVehicle() throws Exception {
        if(status == Status.Sold) {
            status = Status.Available;
        }
        else
            throw new Exception("This vehicle is already available");
    }
    public void setPrice(int price) throws Exception{
        if(status == Status.Available)
            this.price = price;
        else
            throw new Exception("This vehicle is sold");
    }
    public int getPrice() throws  Exception{
        if(status == Status.Available)
            return price;
        else
            throw new Exception("This vehicle is sold");
    }
    public LocalDate getSaleDate() throws Exception{
        if(status == Status.Sold)
            return saleDate;
        else
            throw new Exception("This vehicle is not sold");
    }
}
