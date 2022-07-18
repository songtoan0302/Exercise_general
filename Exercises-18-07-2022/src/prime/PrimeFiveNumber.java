package prime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class PrimeFiveNumber {

  private static final int PRIME_MIN = 2;

  public static List checkSumOfDigits(int sum) {
    List listPrime = new ArrayList();
    for (int i = 10001; i < 99999; i += 2) {
      if (isPrimeNumber(i) && sumOfDigits(i) == sum) {
        listPrime.add(i);
      }
    }
    return listPrime;
  }

  private static int sumOfDigits(int numberPrime) {
    int sum = 0;
    while (numberPrime > 1) {
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
      if (checkNumber % i == 0) {
        return false;
      }
    }
    return true;
  }
}
