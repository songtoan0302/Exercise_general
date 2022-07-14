import collection.CollectionList;
import java.util.Arrays;
import java.util.List;

public class MainApplication {
  public static void main(String[] args) {
    List listNumbers= Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");

    CollectionList collectionList=new CollectionList();
    collectionList.printList(listNumbers);
    System.out.println("List sort: ");
    collectionList.printList(collectionList.sortList(listNumbers));

  }
}
