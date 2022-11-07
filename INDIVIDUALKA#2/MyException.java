public class MyException extends Exception{
    int denominator;
    String name;

    public MyException(String name, int denominator) {
        super(name);
        this.denominator = denominator;
    }
}
