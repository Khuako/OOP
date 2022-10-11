public class Geom extends Progress{

    Geom(int a, int d) {
        super(a, d);
    }
    @Override
    double elem(int n) {
        return a*Math.pow(d,(n-1));
    }

    @Override
    double sum(int n) {
       return a*(1-Math.pow(d,n))/(1-d);
    }
}
