public class loneSum {
    public static int loneSum(int a, int b, int c) {
        int sum;
        sum = 0;
        if (a != b && a != c) sum += a;
        if (b != c && b != a) sum += b;
        if (c != a && c != b) sum += c;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}