import java.util.Scanner;

public class Ex_2_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter thirst number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        in.close();
        int sum = 0;
        int dif = 0;
        int pr = 0;
        int div = 0;
        sum = a + b;
        System.out.println("Sum: " + sum);
        dif = a - b;
        System.out.println("Difference:  " + dif);
        pr = a * b;
        System.out.println("Product: " + pr);

        if (a == 0 || b == 0) {
            System.out.println("division: " + "You can't divide by zero!!!");
        } else {
            div = a / b;
            System.out.println("division: " + div);
        }
    }
}
