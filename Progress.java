public abstract class Progress {
    int a,d;

    Progress(int a, int d) {
        this.a = a;
        this.d = d;
    }

    abstract double sum(int n);
    abstract double elem(int n);
    void print(){
        System.out.println("Первый элемент: " + a + "шаг" + d);
    }
}
