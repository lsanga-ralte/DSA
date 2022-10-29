import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String st = sc.next();

        //Strings Method
        String name = "Harry";
        //String a1 = new String("Harry");
        //System.out.println(name);
        //int value = name.length();
        //System.out.println(value);
        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //System.out.println(name.substring(3));

        System.out.println(name.replace('r','p'));

        // Problem 2
        String text = "To Lower Case";
        text = text.replace(' ','_');
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|> , thanks a lot!";
        letter = letter.replace("<|name|>","Jack");
        System.out.println(letter);



    }
}
