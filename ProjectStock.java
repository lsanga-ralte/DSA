import java.util.Scanner;
public class ProjectStock {

    private int cWhite,cGrey,california,dmLight,dmDark,quantity;
    private String name;

    public static void main(String[] args) {

        ProjectStock P = new ProjectStock();
        Scanner sc = new Scanner(System.in);
        P.cWhite=0;
        P.cGrey=0;
        P.california=0;
        P.dmLight=0;
        P.dmDark=0;
        P.quantity=0;
        P.name=null;
        int choice;
        char a = 'n';
        System.out.println("******************************* GREENHOME STOCK ***********************************");
        System.out.println();
        do{
            System.out.println("1.VIEW STOCK\n2.ADD ITEMS\n3.SELL ITEMS");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1: displayStock(P);
                break;

                case 2: addStock(P);
                break;

                case 3: sellStock(P);

                default:
                    System.out.println("INVALID CHOICE!!!");
            }
            System.out.println();
            System.out.println("DO YOU WANT TO DO ANOTHER PROCESS: ");
            a = sc.next().trim().charAt(0);
            System.out.println();
        }while(a != 'n');

    }
    public static void displayStock(ProjectStock P1)
    {
        System.out.println("1.cWhite: " + P1.cWhite);
        System.out.println("2.cGrey: " + P1.cGrey);
        System.out.println("3.california: " + P1.california);
        System.out.println("4.dmLight: " + P1.dmLight);
        System.out.println("5.dmDark: " + P1.dmDark);
    }
    public static void addStock(ProjectStock P1)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME OF BOARD TO BE ADD: ");
        P1.name = sc.next();
        System.out.println("QUANTITY: ");
        P1.quantity = sc.nextInt();
        System.out.println();
        if(P1.name.equals("cWhite"))
        {
            P1.cWhite = P1.cWhite + P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN ADDED.");
        }
        else if(P1.name.equals("cGrey"))
        {
            P1.cGrey = P1.cGrey + P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN ADDED.");
        }
        else if(P1.name.equals("california"))
        {
            P1.california = P1.california + P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN ADDED.");
        }
        else if(P1.name.equals("dmLight"))
        {
            P1.dmLight = P1.dmLight + P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN ADDED.");
        }
        else if(P1.name.equals("dmDark"))
        {
            P1.dmDark = P1.dmDark + P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN ADDED.");
        }
        else
            System.out.println("ENTERED ITEM NAME IS NOT FOUND!!!");
    }
    public static void sellStock(ProjectStock P1)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME OF BOARD TO BE SOLD: ");
        P1.name = sc.next();
        System.out.println("QUANTITY: ");
        P1.quantity = sc.nextInt();
        System.out.println();
        if(P1.name.equals("cWhite"))
        {
            P1.cWhite = P1.cWhite - P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN SOLD.");
        }
        else if(P1.name.equals("cGrey"))
        {
            P1.cGrey = P1.cGrey - P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN SOLD.");
        }
        else if(P1.name.equals("california"))
        {
            P1.california = P1.california - P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN SOLD.");
        }
        else if(P1.name.equals("dmLight"))
        {
            P1.dmLight = P1.dmLight - P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN SOLD.");
        }
        else if(P1.name.equals("dmDark"))
        {
            P1.dmDark = P1.dmDark - P1.quantity;
            System.out.println(P1.quantity + P1.name + " HAS BEEN SOLD.");
        }
        else
            System.out.println("ENTERED ITEM NAME IS NOT FOUND!!!");
    }

}
