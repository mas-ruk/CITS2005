import java.util.Scanner;

public class FourToEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            // cannot be chained relational comparisons like Python
            // i.e. cannot do 4 <= num <= 8        
            if (4 <= num && num <= 8) { 
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
