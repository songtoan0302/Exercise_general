package org.aibles.exercies.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class BinaryString {
  private static final int DEFAULT_MULTIPLIED = 1;
  private static final int DEFAULT_INDEX_MIN = 0;
  private static final int BINARY_FIRST_NUMBER = 0;
  private static final int BINARY_SECOND_NUMBER = 1;

  public static List<String> processBinary(int lengthBinary) {
    int[] array = new int[lengthBinary];
    List<String> listBinary = new ArrayList<>();
    String stringBinary = "";
    int multiplied;
    do {
      multiplied = DEFAULT_MULTIPLIED; // default multiplied
      for (int j = 0; j < lengthBinary; j++) {
        stringBinary += array[j];
        multiplied *= array[j];
      }
      listBinary.add(stringBinary);
      stringBinary = "";
      int indexMax = lengthBinary - 1; // chỉ số lớn nhất bằng chiều dài mảng -1
      do {
        if (array[indexMax] == BINARY_FIRST_NUMBER) {
          array[indexMax] = BINARY_SECOND_NUMBER; // 0  1 là 2 số của dãy nhị phân
          for (int j = lengthBinary - 1; j > indexMax; j--) {
            array[j] = BINARY_FIRST_NUMBER;
          }
          break;
        } else indexMax--;
      } while (indexMax >= DEFAULT_INDEX_MIN);
    } while (multiplied != DEFAULT_MULTIPLIED);
    return listBinary;
  }
}
