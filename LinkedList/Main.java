import java.util.*;

public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        MyList l = new MyList();
        l.createlist();
        System.out.println("List: ");
        System.out.println();
        l.delFirstFromTheEndOfTheList("4");
        l.print();
    }
}
