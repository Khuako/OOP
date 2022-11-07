
public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator)throws MyException {
        if(denominator == 0)
            throw new MyException("Denominator can't be zero", denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }
    int gcd(int a, int b){
        while(b!= 0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    void plus(Fraction f){
        if(denominator == f.denominator)
            numerator += f.numerator;
        else {
            numerator = numerator * f.denominator + f.numerator * denominator;
            denominator *= f.denominator;
        }
        int z = gcd(numerator, denominator);
        if(z != 0)
        {
            numerator /= z;
            denominator /= z;
        }
    }
    void minus(Fraction f){
        if(denominator == f.denominator)
            numerator -= f.numerator;
        else {
            numerator = numerator * f.denominator - f.numerator * denominator;
            denominator *= f.denominator;
        }
        int z = gcd(Math.abs(numerator), denominator);
        if(z != 0)
        {
            numerator /= z;
            denominator /= z;
        }

    }
    void multiply(Fraction f){
        numerator*= f.numerator;
        denominator*= f.denominator;
        int z = gcd(numerator, denominator);
        if(z != 0)
        {
            numerator /= z;
            denominator /= z;
        }
    }
    void divide(Fraction f){
        numerator *= f.denominator;
        denominator *= f.numerator;
        int z = gcd(numerator, denominator);
        if(z != 0)
        {
            numerator /= z;
            denominator /= z;
        }
    }
    String getFraction(){
        return numerator + "/" + denominator;
    }
}
