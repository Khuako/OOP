import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int n1 = in.nextInt();
        int d1 = in.nextInt();
        try {
            Fraction f1 = new Fraction(n, d);
            Fraction f2 = new Fraction(n1, d1);
            f1.plus(f2);
            System.out.println(f1.getFraction());
        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}