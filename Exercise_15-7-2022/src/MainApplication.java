import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApplication {
  public static void main(String[] args) {

    List<String> arrayList1 =
        new ArrayList<>(Arrays.asList("Yeu", "la", "chet", "o", "trong", "long", "mot", "it"));

    List<String> arrayList2 =
        new ArrayList<>(Arrays.asList("Vi", "May", "Khi", "Yeu", "Ma", "Chac", "Duoc", "Yeu"));

    System.out.println("Các phần tử có trong danh mảng danh sách 1 là:" + arrayList1);
    System.out.println("Các phần tử có trong danh mảng danh sách 2 là:" + arrayList2);

    // nối 2 mảng
    List<String> arrayList3 = new ArrayList<>();
    arrayList3.addAll(arrayList1);
    arrayList3.addAll(arrayList2);
    System.out.println("Mảng danh sách sau ki nối là" + arrayList3);

    // Sắp xếp mảng danh sách
    Collections.sort(arrayList1);
    System.out.println("Mảng 1 sau khi sắp xếp: " + arrayList1);
    Collections.sort(arrayList2);
    System.out.println("Mảng 2 sau khi sắp xếp: " + arrayList2);

    // Ghi đè mảng array 1= array 3
    Collections.fill(arrayList1, "ahihi");
    System.out.println("Mảng 1 sau khi ghi đè :" + arrayList1);

    // Copy mang và ghi đè vào mang khac
    // Phương thức copy có điều kiện list đích phải có index >= list nguồn
    Collections.copy(arrayList3, arrayList1);
    System.out.println("mang 2 sau khi copy từ mảng 1: " + arrayList3);

    // Đổi giá trị được chỉ định
    Collections.replaceAll(arrayList2, "ahihi", "adu");
    System.out.println("mang 2 sau khi replaceAll: " + arrayList2);

    //    Collections.copy(arrayList1,arrayList3);
    // xoay các phần tử trong mảng
    Collections.rotate(arrayList1, 1);
    System.out.println("mang 1 sau khi xoay: " + arrayList1);
  }
}
