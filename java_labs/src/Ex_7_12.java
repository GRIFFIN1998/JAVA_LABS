public class Ex_7_12 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] numbers = new int[5];
        boolean[] usedBefore = new boolean[5];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            usedBefore[i] = false;
            for(int k = 0; k < i; k++) {
                if(numbers[k] == numbers[i]) {
                    usedBefore[i] = true;
                    break;
                }
            }
        }

        for(int j = 0; j < numbers.length; j++) {

            if(!usedBefore[j]) {
                System.out.print(String.valueOf(numbers[j])+" ");
            }
        }
    }
}
