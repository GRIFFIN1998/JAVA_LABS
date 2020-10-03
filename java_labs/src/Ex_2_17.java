import java.util.Arrays;
import java.util.Scanner;

public class Ex_2_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[3];
        System.out.println("Enter thirst number: ");
        arr[0] = in.nextInt();
        System.out.println("Enter second number: ");
        arr[1] = in.nextInt();
        System.out.println("Enter third number: ");
        arr[2] = in.nextInt();
        in.close();

        System.out.println("Largest number: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Smollest number: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Sum of numbers: " + Arrays.stream(arr).sum());
        System.out.println("Average: " + Arrays.stream(arr).sum()/ Arrays.stream(arr).count());
        System.out.println("Product: " + arr[0] * arr[1] * arr[2]);





        /*int sum = a + b + c;
        System.out.println("Sum: " + sum);
        int pr = a * b * c;
        System.out.println("Product: " + pr);
        int av = (a + b + c)/3;
        System.out.println("Average " + av);
        if(a > b && a > c){
            System.out.println("first number is the largest");
        }
        if(b > a && b > c){
            System.out.println("second number is the largest");
        }
        if(c > b && c > a){
            System.out.println("third number is the largest");
        }
        else{
            System.out.println("first number, second number and third number are equale");
        }*/
    }
}
