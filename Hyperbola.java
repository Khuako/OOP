public class Hyperbola implements Function{
    float x;
    float a;
    float b;

    public Hyperbola(float x, float a, float b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    @Override
    public float findY() {
        return -(b/a)*(float)Math.sqrt(x*x-a*a);
    }

    @Override
    public void print() {
        System.out.println("Hyperbola: " +x*x + '/' + a*a + " - " + findY()*findY() + '/' + b*b + '=' + '1');
    }
}
