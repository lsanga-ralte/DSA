import java.util.Scanner;
import java.util.Random;
class RockPaperScissor {

    static void user(int n) {
        if (n == 1)
            System.out.println("You choose ROCK");
        else if (n == 2)
            System.out.println("You choose PAPER");
        else
            System.out.println("You choose SCISSORS");
    }

    static void comp(int p) {
        if (p == 1)
            System.out.println("Computer choose ROCK");

        else if (p == 2)
            System.out.println("Computer choose PAPER");

        else
            System.out.println("Computer choose SCISSORS");
    }

    static void game(int n, int p) {
        if (n == p)
            System.out.println("IT'S A DRAW...");
        if (n == 1 && p == 2)
            System.out.println("YOU LOST!!!");
        if (n == 1 && p == 3)
            System.out.println("YOU WIN!!!");
        if (n == 2 && p == 1)
            System.out.println("YOU WIN!!!");
        if (n == 2 && p == 3)
            System.out.println("YOU LOST");
        if (n == 3 && p == 1)
            System.out.println("YOU LOST!!!");
        if (n == 3 && p == 2)
            System.out.println("YOU WIN!!!");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int user, comp;
        char choice ='n';
        System.out.println("*************************ROCK PAPER SCISSOR GAME************************");
        System.out.println();
        System.out.println("INSTRUCTION BEFORE PLAYING THE GAME:\n\nDigit 1 is for ROCK\nDigit 2 is for PAPER\nDigit 3 is for SCISSOR");
        System.out.println();
        System.out.println("NOW YOU ARE READY TO GO......");
        System.out.println();
        do {
            System.out.println("Please enter your draw: ");
            user = in.nextInt();
            user(user);
            System.out.println();
            comp = ran.nextInt(1, 4);
            comp(comp);
            System.out.println();
            game(user, comp);
            System.out.println();
            System.out.println("DO YOU WANT TO PLAY AGAIN ('y' for yes, 'n' for no) : " );
            choice = in.next().trim().charAt(0);



        }while(choice!='n');
    }
}