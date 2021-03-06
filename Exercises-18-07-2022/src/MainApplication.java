import org.aibles.exercies.binary.BinaryString;
import org.aibles.exercies.prime.Prime;
import org.aibles.exercies.prime.PrimeFiveNumber;

/**
 * @author ToanNS
 */
public class MainApplication {
  public static void main(String[] args) {
    int sum = 37;
    System.out.println("Số nguyên tố có tổng là "+sum+" là :\n"+PrimeFiveNumber.processRangeNumber(sum));

    int integer=16;
    System.out.println("Dãy số nguyên tố được phân tích từ "+integer+" : \n"+Prime.analysisInteger(16));

    int lengthBinary=6;
    System.out.println("Xâu nhị phân có độ dài là "+lengthBinary+" gồm: \n"+BinaryString.processBinary(6));
  }

}
