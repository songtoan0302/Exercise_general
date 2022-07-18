package binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToanNS
 */
public class BinaryString {

  public static List processBinary(int lengthBinary) {
    int[] array = new int[lengthBinary];
    List listBinary = new ArrayList<>();
    String stringBinary = "";
    int multiplied;
    do {
      multiplied = 1; // default multiplied
      for (int j = 0; j < lengthBinary; j++) {
        stringBinary += array[j];
        multiplied *= array[j];
      }
      listBinary.add(stringBinary);
      stringBinary = "";
      int i = lengthBinary - 1;
      do {
        if (array[i] == 0) {
          array[i] = 1;
          for (int j = lengthBinary - 1; j > i; j--) {
            array[j] = 0;
          }
          break;
        } else i--;
      } while (i >= 0);
    } while (multiplied != 1);
    return listBinary;
  }
}
