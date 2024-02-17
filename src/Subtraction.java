public class Subtraction {
    public int a;
    public int b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        Addition addition = new Addition(5, 10);
        int total = a + b;
        System.out.println("sum=" + total);
        return total;
    }
}
