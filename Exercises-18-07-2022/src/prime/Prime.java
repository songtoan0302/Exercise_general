package prime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class Prime {

  private static final int PRIME_MIN = 2;

  public static List analysisInteger(int integer) {

    List list = new ArrayList();
    for (int i = 2; i <= integer; i++) {
      while (checkPrime(i) && (integer % i == 0)) {
        list.add(i);
        integer /= i;
      }
    }
    return list;
  }

  private static boolean checkPrime(int checkNumber) {
    if (checkNumber <= PRIME_MIN) {
      return true;
    } else {
      for (int i = 2; i <= Math.sqrt(checkNumber); i++) {
        if (checkNumber % i == 0) { // check number chia hết cho i
          return false;
        }
      }
    }
    return true;
  }
}
