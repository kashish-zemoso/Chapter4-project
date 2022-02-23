import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

//        String num = "250";
//        int val = Integer.parseInt(num);
//        val+=10;
//
//        System.out.println(val);

        String db = "3.14159";
        double val = Double.parseDouble(db);
        val+=0.1;

        System.out.println(val);

    }
}
