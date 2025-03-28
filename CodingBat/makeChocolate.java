



public class makeChocolate {
    public static int calculateChocolate(int small, int big, int goal) {
        // want to make a package of goal kilos of chocolate
        // we have small 1 kilo bar choccies and big 5kg bars
        int remain = goal % 5;
        System.out.println("printing remainder: " + remain);
        int noOfBig = Math.floorDiv(goal, 5); 
        System.out.println("printing number of times 5 can fit in goal: " + noOfBig);
        int firstCalc = goal - noOfBig;

        if (firstCalc > small || firstCalc < 0) {
            System.out.println("Catching on first statemnt");
            return -1;
        } else {
            } if (small >= remain) {
                return remain;
            } else {
                return remain - small; 
            }
        }
    

    public static void main(String[] args) {
        System.out.println(calculateChocolate(4, 1, 5));
    }
}