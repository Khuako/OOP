import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of functions");
        int k = in.nextInt();
        Function[] f = new Function[k];
        for(int i = 0; i < f.length; i++){
            System.out.println("1 = ellipse, 2 = Huperbola");
            int p = in.nextInt();
            if(p==1){
                System.out.println("x: ");
                float x = in.nextFloat();
                System.out.println("a: ");
                float a = in.nextFloat();
                System.out.println("b: ");
                float b = in.nextFloat();
                Ellipse e = new Ellipse(x,a,b);
                f[i] = e;
                System.out.println("Y= " + e.findY());
                e.print();
            }
            if(p==2){
                System.out.println("x: ");
                float x = in.nextFloat();
                System.out.println("a: ");
                float a = in.nextFloat();
                System.out.println("b: ");
                float b = in.nextFloat();
                Hyperbola h = new Hyperbola(x,a,b);
                f[i] = h;
                System.out.println("Y= "+ h.findY());
                h.print();
            }
        }
    }
}