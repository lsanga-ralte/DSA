import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /* 1 2 3
           4 5 6
           7 8 9
         */
        //syntax for 2d Array
        //int[][] arr = new int[3][3];  // first [] is for row and second [] is for column
        // int [][] arr = new int[3][];  it is mandatory to declare size of row but not for column

       // int[][] num = {
         //       {1, 2, 3},    0th index
           //     {4, 5, 6},    1st index
              //  {7, 8, 9}     2nd index
        //};
        //System.out.println(num[1][0]); // ---> 4
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // will always give us the length of row....

        //input
        for (int row=0;row < arr.length;row++){
            //for each column in every row
            for(int col=0;col<arr[row].length;col++)       //we use arr[row].length because in every row the sie of
                arr[row][col] = in.nextInt();              //  column may be different
        }
        //output
        for (int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
