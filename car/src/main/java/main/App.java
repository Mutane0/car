package main;

import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Car car=new Car();

        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        car.setBrand(brand);
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        car.setModel(model);

        boolean exit = false;
        while(!exit){
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i){
                    case 1:
                    car.printSpecs();
                    break;
                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä");
                    exit = true;
                    break;
                    default:
                    System.out.println("Syöte oli väärä");
                    break;
                    
                    case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    String newBrand = sc.nextLine();
                    car.setBrand(newBrand);
                    System.out.print("Anna uusi auton malli: ");
                    String newModel =sc.nextLine();
                    car.setModel(newModel);
                    break;

                    case 3:
                    System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                    int acceleration = Integer.parseInt(sc.nextLine());
                    car.accelerate(acceleration);
                    break;

                    case 4:
                    System.out.print("Kuinka monta km/h haluat hidastaa? ");
                    int deceleration = Integer.parseInt(sc.nextLine());
                    car.decelerate(deceleration);
                    break;
                }
            }
        }
    sc.close();
    }
    
}




