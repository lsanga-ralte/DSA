import java.util.Scanner;
public class Switch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String capital = sc.next();

        switch (capital) {
            case "India" -> System.out.println("Capital is New Delhi");
            case "Germany" -> System.out.println("Capital is Berlin");
            case "Japan" -> System.out.println("Capital is Tokyo");
            case "Switzerland" -> System.out.println("Capital is Bern");
            default -> System.out.println("Pls Enter a Valid Country");
        }

    }
}
