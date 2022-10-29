import java.util.*;
public class ApnaCollege3 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        //FUNCTIONS AND METHODS
        //Print a given name in a Function
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); //Here, we call function.
    }
}
