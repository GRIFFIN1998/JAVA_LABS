import java.util.Scanner;

public class Ex_2_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter thirst number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        in.close();

        if(a > b){
            System.out.println("first number is larger than second number");
        }
        else if(b > a){
            System.out.println("second number is larger than first number");
        }
        else{
            System.out.println("first number and second number are equale");
        }
    }
}
