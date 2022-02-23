import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> namesArr = new ArrayList<>();
        ArrayList<Integer> ageArr = new ArrayList<>();

        String name;
        int age;
        for(int i=0;i<5;i++){
            System.out.print("Enter name: ");
            name = input.next();
            namesArr.add(name);
            System.out.print("Enter age: ");
            age = input.nextInt();
            ageArr.add(age);
        }

        for(int i=0;i< namesArr.size();i++){
            System.out.println(namesArr.get(i) + " is " + ageArr.get(i) + " years old.");
        }
    }
}
