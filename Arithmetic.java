public class Arithmetic extends Progress{
    Arithmetic(int a, int d) {
        super(a, d);
    }
    @Override
    double elem(int n) {
        return a+d*(n-1);
    }
    double sum(int n){
        return (a+elem(n))/2*n;
    }
}
