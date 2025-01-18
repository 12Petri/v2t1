package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Car newCar = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        int startingSpeed = 0;
        newCar = new Car(brand, model, startingSpeed);
        int speed = newCar.getSpeed();

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila\r\n" + //
                                "2) Muokkaa auton merkkiä ja mallia\r\n" + //
                                "3) Kiihdytä autoa\r\n" + //
                                "4) Hidasta autoa\r\n" + //
                                "0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
            
            switch (i) {
                case 1:
                    newCar.printSpecs();
                    break;
                case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    String newBrand = sc.nextLine();
                    System.out.print("Anna uusi auton malli: ");
                    String newModel = sc.nextLine();
                    newCar.setBrand(newBrand);
                    newCar.setModel(newModel);
                    break;
                case 3:
                    System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                    int acceleration = Integer.parseInt(sc.nextLine());
                    if(acceleration < 0) {
                        System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        break;
                    }
                    speed = newCar.getSpeed();
                    int fasterSpeed = newCar.accelerate(speed, acceleration);
                    newCar.setSpeed(fasterSpeed);
                    break;
                case 4:
                    System.out.print("Kuinka monta km/h haluat hidastaa? ");
                    int deceleration = Integer.parseInt(sc.nextLine());
                    if(deceleration < 0) {
                        System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        break;
                    }
                    speed = newCar.getSpeed();
                    int slowerSpeed = newCar.decelerate(speed, deceleration);
                    newCar.setSpeed(slowerSpeed);
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
            //exit = true;
            
        }
    }
    sc.close();
    }
}