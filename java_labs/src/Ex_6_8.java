import java.util.Scanner;

public class Ex_6_8 {
    public static void main(String[] args) {
        calculateCharges();
    }
    public static void calculateCharges() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how much time did you stay in the parking: ");

        double time = in.nextDouble();
        double bill = 2;
        double exceedingTime = 0.50;
        double twentyFourHoursFee = 10;


        if (time == 24) {
            System.out.println("Your bill is 10 dollar");
        } else if (time == 3) {
            System.out.println("Your bill is 2 dollar");
        } else if (time > 3) {
            for (int i = 3; i < time; i++) {
                bill += exceedingTime;
            }
        }
        if (bill > twentyFourHoursFee) {
            System.out.println("Your bill is 10 dollar");
        } else {
            System.out.println("Your bill is " + bill + " dollar");
        }
    }
}
