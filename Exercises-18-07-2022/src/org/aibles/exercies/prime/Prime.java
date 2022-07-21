package org.aibles.exercies.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class Prime {

  private static final int PRIME_MIN = 2;
  private static final int DEFAULT_REMAINDER_OF_DIVISIBILITY = 0;

  public static List<Integer> analysisInteger(int integer) {

    List<Integer> listPrime = new ArrayList();
    for (int i = 2; i <= integer; i++) {
      while (checkPrime(i) && (integer % i == DEFAULT_REMAINDER_OF_DIVISIBILITY)) {
        listPrime.add(i);
        integer /= i;
      }
    }
    return listPrime;
  }

  private static boolean checkPrime(int checkNumber) {
    if (checkNumber <= PRIME_MIN) {
      return true;
    } else {
      for (int i = 2; i <= Math.sqrt(checkNumber); i++) {
        if (checkNumber % i
            == DEFAULT_REMAINDER_OF_DIVISIBILITY) { // khi number chia hết cho i số dư sẽ bằng 0
          return false;
        }
      }
    }
    return true;
  }
}
