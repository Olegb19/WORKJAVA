package bookTest;

public class MinMax {
    public static void main(String args[]) {
        MinMax minMax = new MinMax();
        minMax.resolve(10, 15);
        minMax.resolve(10, 5);
    }

    private void resolve(int a, int b) {
        int c;
        if (a > b) {

            c = a - b;

            System.out.println(c);
        } else {
            c = a + b;
            System.out.println(c);
        }
    }
}
