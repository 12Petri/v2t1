package main;
public class Car {
    private String brand;
    private String model;
    private int speed = 0;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int accelerate(int speed, int acceleration) {
        int newSpeed = speed + acceleration;
        return newSpeed;
    }

    public int decelerate(int speed, int deceleration) {
        int newSpeed = speed - deceleration;
        if(newSpeed < 0) {
            newSpeed = 0;
        }
        return newSpeed;
    }

    public void printSpecs() {
        System.out.print("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
        System.out.println();
    }
}

