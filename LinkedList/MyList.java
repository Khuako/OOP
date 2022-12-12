import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MyList {
    LinkedList<String> list;

    public MyList() {
        list = new LinkedList<String>();
    }
    void createlist()
    {
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        while(!s.equals(""))
        {
            list.addLast(s);
            s = in.nextLine();
        }
    }
    void print()
    {
        ListIterator <String> it = list.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    void print_reverse(){
        ListIterator<String> it = list.listIterator(list.size());
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
    void del(String s)
    {
        ListIterator <String> it = list.listIterator();
        while(it.hasNext())
        {
            if(it.next().equals(s))
                it.remove();
        }
    }
    boolean isSym() {
        boolean f = true;
        for(int i= 0; i < list.size()/2+1; i++)
        {
            if(!list.get(i).equals(list.get(list.size()-1-i)))
                f = false;

        }
        return f;
    }
    void delFirstFromTheEndOfTheList(String s)
    {
        ListIterator<String> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            if(it.previous().equals(s)) {
                it.remove();
                break;
            }
        }
    }
}
