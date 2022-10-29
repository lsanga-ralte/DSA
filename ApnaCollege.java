import java.util.*;
public class ApnaCollege {
    public static void main(String[] args) {

        //switch
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter button number: ");
        int button = sc.nextInt();
        switch(button){
            case 1 :
                System.out.println("Good Morning");
                break;
            case 2 :
                System.out.println("Guten Morgen");
                break;
            case 3 :
                System.out.println("Ohayo");
                break;
            default :
                System.out.println("INVALID BUTTON");
        }

        //loops
        for(int i=0;i<5;i++)
            System.out.println("Hello World");
        int a=0;
        while(a<5){
            System.out.println(a);
            a++;
        }

        //d0-while loop execute at least one time even if conditions is false.
        int b=0;
        do{
            System.out.println(b);
            b++;
        }while(b<5);


    }
}
