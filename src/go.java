import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class go {
    public static void main(String[] args) {
    System();
    }
    public static void System () {
        Scanner in = new Scanner(System.in);
        double a, b;
        String c;
        System.out.println("insert the number");
        a = in.nextDouble();
        System.out.println("insert the second number");
        b = in.nextDouble();
        System.out.println("inter the expressions +,-,/,*");
        c = in.next();
        if (c.equals("+")){
            System.out.println("answers"+(a+b));
        }
        else if (c.equals("-")){
            System.out.println("answers"+(a-b));
        }
        else if (c.equals("/")){
            System.out.println("answers"+(a/b));
        }
        else if (c.equals("*")){
            System.out.println("answers"+(a*b));
        }

    }




}
