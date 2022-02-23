import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i< arr.length;i++){
            System.out.println("Enter an integer:");
            arr[i] = input.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            System.out.println("Result is " + (arr[i]*2));
        }
    }
}
