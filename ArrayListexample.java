import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListexample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Syntax for Array list

        ArrayList<Integer> list = new ArrayList<>(10);

        //list.add(17);
        //list.add(56);
        //list.add(988);
        //list.add(8900);
        //list.add(67);

        //System.out.println(list);
        //list.set(0,23);   // changing 0th index value to 23
        //System.out.println(list);

        //input
        for(int i=0;i<5;i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
