import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> arrNew = new ArrayList<>();

        double value;
        System.out.println("Enter 0 or more to put in the list or -1 to exit");
        value = input.nextDouble();

        while(value >= 0){
            arrNew.add(value);

            System.out.println("Enter 0 or more to put in the list or -1 to exit");
            value = input.nextDouble();
        }

        for(int i=arrNew.size()-1;i >=0; i--){
            System.out.println(arrNew.get(i));
        }
    }
}
