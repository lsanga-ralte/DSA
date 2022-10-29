import java.util.*;
public class ProblemSolving {
    //public static int sumOfNumbers(int a,int b){
        //int sum = a + b;
        //return sum;
    //}
    public static void printFactorial(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    //public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int b = sc.nextInt();

        //int sum = sumOfNumbers(a,b);
        //System.out.println(sum);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }

}
