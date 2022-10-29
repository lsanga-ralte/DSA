import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array syntax
        // int[] arr = new int[5];

        //input using for loops
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //shortcut to print all element in the array
        for (int num : arr) {    // here num represents all the elements in the array arr
            System.out.println(num + " ");
        }
        //other shortcut to print all elements in the array
        //System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str = new String[4];
        for (int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        //System.out.println(Arrays.toString(str));
    }
}
