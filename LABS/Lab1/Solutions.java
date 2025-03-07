// coding bat solutions
public class Solutions {
    // Q1: 
    public boolean cigarParty(int cigars, boolean isWeekend) {
        // more efficient solution
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }

    // Q2:
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
          if (speed >= 86) {
            return 2;
          } else if (speed >= 66) {
            return 1;
          } else {
            return 0;
          }
        } else {
          if (speed >= 81) {
            return 2;
          } else if (speed >= 61) {
            return 1;
          } else {
            return 0;
          }
        }
      }
    
    // Q3: 
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || c + a == b;
    }
}
