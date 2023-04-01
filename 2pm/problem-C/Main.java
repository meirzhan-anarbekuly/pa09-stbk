public class Main {
    public static void main(String[] args) {
        IntegerMatrix m = new IntegerMatrix();
        Integer[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
            {-1, 9, 100}
        };
        Integer[][] m2 = {
            {1, 2, 3},
            {4, 5, 6},
            {1, -9, 100}
        };
        System.out.println(m.minMatrix(m1, m2));
    }
}