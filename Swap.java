import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        swap(arr, 1, 3);
        for(int a : arr)
            System.out.print(a + " ");
        System.out.println();
        System.out.println(max(arr));
        reverse(arr);
        for(int b : arr)
            System.out.print(b + " ");
    }
    static void swap(int[] num,int index1,int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxValue);
            maxValue = arr[i];
        }
        return maxValue;
    }
    //for reverse
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;

        }
    }
}
