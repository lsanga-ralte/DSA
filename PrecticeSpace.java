import java.util.*;
public class PrecticeSpace {
    //public static void eligibleForVote(int age){
        //if(age>=18)
          //  System.out.println("Eligible");
       // else
           // System.out.println("Not eligible");
    //}
    //public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int age = sc.nextInt();

        //eligibleForVote(age);
    //}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] = new int[size];
            for(int i=0;i<numbers.length;i++)
                numbers[i] = sc.nextInt();

            boolean isAscending = true;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>numbers[i+1]){
                     isAscending = false;
                }
            }
            if(isAscending){
                System.out.println("Numbers in array is in ascending order.");
            }
            else
                System.out.println("Numbers in array are not in ascending order.");
        }
}
