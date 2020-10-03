import java.util.Scanner;

public class Ex_7_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(product(arr));
    }
    public static double product(int[] a) {
        double pr = 1;
        for(int i = 0; i < a.length; i++)
            pr *=  a[i];
        return pr;
    }
    }

