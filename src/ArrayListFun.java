import java.util.ArrayList;

public class ArrayListFun {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("kashish");
        arrList.add("Puneet");
        arrList.add("Aleena");
        arrList.add("Shaheen");
        arrList.add("Sarthak");

        for(String str : arrList){
            System.out.println(str);
        }
    }
}
