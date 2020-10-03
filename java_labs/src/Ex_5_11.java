import java.util.Scanner;

public class Ex_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            int num = sc.nextInt();
            min = min < num ? min : num;
        }
        System.out.print("Minimum is: " + min);
    }
}
