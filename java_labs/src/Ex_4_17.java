import java.util.Scanner;

public class Ex_4_17 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int gallons = 0;
            int miles = 0;
            int trip = 0;
            double consumption = 0;
            while (true){
                System.out.println("Write number of your trip, or zero to finish: ");
                trip = input.nextInt();
                if(trip != 0) {
                    System.out.println("Write count of gallons: ");
                    gallons = input.nextInt();
                    if (gallons != 0) {
                        System.out.println("Write count of miles: ");
                        miles = input.nextInt();
                        if (miles != 0) {
                            consumption = (double) gallons / miles;
                            System.out.println("Consumption is: " + consumption);
                        }
                    }
                }
                else if(trip == 0)
                {
                    System.out.println("We can not work with zero trips!!!");
                    break;
                }

            }input.close();
    }
}
