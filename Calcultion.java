public class Calcultion {
    private int a;
    private int b;

    public Calcultion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public static void main(String[] args) {
        Calcultion cal = new Calcultion(5, 7);
        System.out.println( cal.sum());
        System.out.println( cal.minus());
    }
}
