
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Kolvo elementov");
        int k = in.nextInt();
        Progress[]m = new Progress[k];
        for(int i = 0; i < m.length; i++){
            System.out.println("1 - arifm, 2 - geometricheskaya");
            int p = in.nextInt();
            System.out.println("1 elem i shag");
            int a = in.nextInt();
            int d = in.nextInt();
            if(p==1)
            {
                Arithmetic arithmetic = new Arithmetic(a,d);
                m[i] = arithmetic;
            }
            else {
                Geom geom = new Geom(a,d);
                m[i] = geom;
            }
        }
        for(int i = 0; i < m.length; i++){
            m[i].print();
            System.out.println("Type n for sum");
            int n = in.nextInt();
            System.out.println("Summa = "+ m[i].sum(n));
            System.out.println("Type Number Element");
            int j = in.nextInt();
            System.out.println("Element = " + m[i].elem(j));
        }
    }
}
