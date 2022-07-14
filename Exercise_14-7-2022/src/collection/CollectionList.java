package collection;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import javax.lang.model.element.Element;

public class CollectionList {

  public void addElement(List list, Element element){
    list.add(element);
  }

  public void addElement(List list, Element element,int index){
    list.add(index,element);
  }
  public void addAllElement(List list, Collection listElement){
    list.add(listElement);
  }
  public void addAllElement(List list, Collection listElement,int index){
    list.add(index,listElement);
  }

  public void deleteAll(List list){
    list.clear();
  }
  public boolean checkElementExist(List list,Element element){
    return list.contains(element);
  }
  public boolean checkCollectionExist(List list,Collection listElement){
    return list.contains(listElement);
  }
  public List sortList(List list){

    return (List) list.stream().sorted().collect(Collectors.toList());
  }

  public void printList(List list){
    list.stream().forEach(System.out::println);
  }
  public Object[] convertListToArray(List list){
    return list.toArray();
  }


}
