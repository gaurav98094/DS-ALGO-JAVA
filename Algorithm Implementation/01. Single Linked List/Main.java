import java.util.*;

class Main {
  public static void main(String[] args) {
    
    SingleLinkedList sLL = new SingleLinkedList();
    sLL.createLL(11);

    //INSERT VALUE
    sLL.insertLL(10, 0);
    sLL.insertLL(12, 2);
    sLL.insertLL(13, 3);
    sLL.insertLL(9, 0);
    sLL.insertLL(8, 0);
    sLL.insertLL(14, 22);
    sLL.insertLL(15, 35);
    sLL.insertLL(7, 0);
    sLL.printLL();

    //Searching the Element
    System.out.println("Search 9 : " + sLL.searchLL(9));
    System.out.println("Search 2 : " + sLL.searchLL(2));
    System.out.println("Search 13 : " + sLL.searchLL(13));


    // Delete Element in Singly SingleLinkedList
    System.out.println("Delete 7 : "+ sLL.delLL(7));
    System.out.println("Delete 9 : "+sLL.delLL(9));
    System.out.println("Delete 11 : "+sLL.delLL(11));
    System.out.println("Delete 13 : "+sLL.delLL(13));
    System.out.println("Delete 15 : "+sLL.delLL(15));
    System.out.println("Delete 17 : "+sLL.delLL(17));
    sLL.printLL();

    //Delete Entire SingleLinkedList
    sLL.delEntireLL();
    sLL.printLL();


  }
}