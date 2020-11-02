/*Implement method findMultiples(x, n)
which returns an array of the first x multiples of the real numbers n */

public class Second {

    public static void main(String[] args) {
        findMultiplies(2, 3);
    }

    public static void findMultiplies(int a, int b) {
        for (int i = 1; i <= a; i++) {
            int num = 0;
            num = b * i;
            System.out.println(num);
        }
    }
}