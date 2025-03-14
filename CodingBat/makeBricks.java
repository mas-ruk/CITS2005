public class makeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        // #1 fail case - not enough bricks or #2 the remainder after big bricks is not enough small bricks
        return !(goal > (big*5 + small) || (goal % 5 > small));
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 2, 10));
    }
}