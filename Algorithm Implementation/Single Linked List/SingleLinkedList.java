public class SingleLinkedList{
  public Node head;
  public Node tail;
  public int size;

  // Create the Singly Linked List
  public Node createLL(int value){
    Node node = new Node();
    node.next = null;
    node.value = value;

    head = node;
    tail = node;
    size = 1;

    return head;
  }

  // Delete Entire Linked List
  public void delEntireLL(){
    head = null;
    tail = null;
    size = 0;
    System.out.println("Entire List Deleted");
  }

  //Insert Element in Linked List
  public void insertLL(int value,int pos){
    
    Node newNode = new Node();
    newNode.value = value;

    if(head==null){
      createLL(value);
    }
    else if(pos==0){
        newNode.next = head;
        head = newNode;
    }else if(pos>=size){
      newNode.next = null;
      tail.next = newNode;
      tail = newNode;
    }else{
      Node tmp = head;
      int count = 0;
      while(count<pos-1){
        tmp = tmp.next;
        count++;
      }
      Node nextNode = tmp.next;
      tmp.next = newNode;
      newNode.next = nextNode;
    }
    size++;
  }

  //Search Element in Linked List
  public int searchLL(int value){
    Node tmp = head;
    int pos=0;
    while(tmp!=null){
      if(tmp.value==value)
        return pos;
      
      tmp=tmp.next;
      pos++;
    }
    return -1;
  }


  // Delete ELement in Single Linked List
  public boolean delLL(int ele){
    if(head==null)
      return false;
    
    int flag=0;
    if(head.value==ele){
      flag=1;
      head=head.next;
    }
    else{
      Node prev = head;
      Node curr = head.next;
      while(curr!=null){
        if(curr.value==ele){
          flag=1;
          prev.next = curr.next;
          break;
        }
        prev=curr;
        curr=curr.next;
      }
    }

    if(flag==1){
      size--;
      return true;
    }

    return false;

  }

  //Traverse the Linked List
  public void printLL(){
    Node tmp = head;
    while(tmp!=null){
      System.out.print(tmp.value+" ---> ");
      tmp = tmp.next;
    }
    System.out.println("NULL");
  }



}
