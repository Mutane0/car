package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(){
        brand=null;
        model=null;
        speed=0;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void SetSpeed(int speed){
        this.speed = speed;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getSpeed(){
        return speed;
    }
    public void printSpecs(){
        System.out.println("Auto: "+brand+" "+model+", Nopeus: "+speed+" km/h");
    }
    public void accelerate(int acceleration){
    if(acceleration > 0){
        SetSpeed(acceleration);
    }
    else{
        System.out.println("Nopeuden täytyy olla positiivinen luku.");
    }
    }
    public void decelerate(int deceleration){
        if(deceleration > 0){
            SetSpeed(getSpeed()-deceleration);
            if(getSpeed() < 0){
                SetSpeed(0);
            }
        }
        else{
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }
}
