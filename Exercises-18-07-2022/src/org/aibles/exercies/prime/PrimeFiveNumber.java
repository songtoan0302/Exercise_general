package org.aibles.exercies.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class PrimeFiveNumber {

  private static final int PRIME_MIN = 2;
  private static final int DEFAULT_SUM=0;
  private static final int DEFAULT_NUMBER_PRIME=1;
  private static final int DEFAULT_REMAINDER_OF_DIVISIBILITY=0;

  public static List<Integer> processRangeNumber(int sum) {
    List<Integer> listPrime = new ArrayList();
    for (int i = 10001; i < 99999; i += 2) {
      if (isPrimeNumber(i) && sumOfDigits(i) == sum) {
        listPrime.add(i);
      }
    }
    return listPrime;
  }

  private static int sumOfDigits(int numberPrime) {
    int sum = DEFAULT_SUM;
    while (numberPrime > DEFAULT_NUMBER_PRIME) {
      sum += numberPrime % 10;
      numberPrime /= 10;
    }
    return sum;
  }

  private static boolean isPrimeNumber(int checkNumber) {
    if (checkNumber < PRIME_MIN) {
      return false;
    }
    int squareRoot = (int) Math.sqrt(checkNumber);
    for (int i = 2; i <= squareRoot; i++) {
      if (checkNumber % i == DEFAULT_REMAINDER_OF_DIVISIBILITY) {
        return false;
      }
    }
    return true;
  }
}
