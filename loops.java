import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        //Conditionals
        System.out.println("Enter your age:");
        Scanner Age = new Scanner(System.in);
        int age = Age.nextInt();

        if (age>=18)
        {
            System.out.println("You can drive");
        }
        else
        {
            System.out.println("You cannot drive");
        }
    }
}
