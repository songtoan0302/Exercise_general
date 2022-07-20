package org.aibles.exercies.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class BinaryString {
    private static final int DEFAULT_MULTIPLIED=1;
    private static final int DEFAULT_INDEX_MIN=0;

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
      int i = lengthBinary - 1;
      do {
        if (array[i] == 0) {
          array[i] = 1;//0  1 là chỉ số
          for (int j = lengthBinary - 1; j > i; j--) {
            array[j] = 0;
          }
          break;
        } else i--;
      } while (i >= DEFAULT_INDEX_MIN);
    } while (multiplied != DEFAULT_MULTIPLIED);
    return listBinary;
  }
}
