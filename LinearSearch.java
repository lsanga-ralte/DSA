import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int top = 0;
        int[] arr = new int[50];

        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the number to be searched: ");
        num = sc.nextInt();

        for(int i=0;i<6;i++) {
            if (arr[i] == num) {
                System.out.println("Number found at index no. " + i);
                top++;
            }
        }
        if(top==0)
            System.out.println("number not found"); 
    }
}
