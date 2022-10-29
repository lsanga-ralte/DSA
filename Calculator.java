import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while(true){
            //take operator from user
            System.out.println("Enter operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                //take two number as input
                System.out.println("Enter any two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+')
                    ans = num1 + num2;
                if(op == '-')
                    ans = num1 - num2;
                if(op == '*')
                    ans = num1 * num2;
                if(op == '/'){
                    if (num2 != 0)
                        ans = num1/num2;
                }
                if(op == '%')
                    ans = num1 % num2;

                System.out.println("Result: ");
                System.out.println(ans);

            }
            else if (op == 'x' || op == 'X')
                break;
            else
                System.out.println("Invalid operations!");
        }

    }
}
