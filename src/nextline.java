import java.io.*;
import java.util.*;


class nextline {

    public static void main (String[] args) {

        StringInput g = new StringInput();
        g.getInput();

        }
    }



class StringInput {

    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //Taking the number of testcases
        while (t-- > 0) {
            int a = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            //Your code here

            System.out.println(a);
            System.out.println(s);
        }
    }
}

