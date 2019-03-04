package datastructures.linkedlist;

public class LinkedListAlgo {

  public static class Node{
    private int data;
    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
    public int getData(){
      return data;
    }
  }

  public static Node createNode(int value){
    return new Node(value,null);
  }

  public static void printAll(Node list){
    Node p = list;
    while(p!=null){
      System.out.println(p.data+ " ");
      p=p.next;
    }
    System.out.println();
  }

//  //1.单链表反转
//  public static Node reverse(Node list){
//
//  }

}
