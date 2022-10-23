public class Ellipse implements Function {
    float x;
    float a;
    float b;

    public Ellipse(float x, float a, float b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    @Override
    public float findY() {
        return (b/a)*(float)Math.sqrt(a*a-x*x);
    }

    @Override
    public void print() {
        System.out.println("Ellipse: "+x*x + " / " + a*a + '+' + findY()*findY() + '/' + b*b + '=' + '1');
    }
}
