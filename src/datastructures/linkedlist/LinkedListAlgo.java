package datastructures.linkedlist;

import java.util.Arrays;
import java.util.List;

public class LinkedListAlgo {

  public static class Node {
    private int data;

    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public Node(int data) {
      this.data = data;
    }

    public int getData() {
      return data;
    }

    public  Node getNode() {
      return next;
    }

    public void setNode(Node node) {
      this.next = node;
    }

    public static void printAll(Node list) {
      Node p = list;
      while (p != null) {
        System.out.println(p.data + " ");
        p = p.next;
      }
      System.out.println();
    }

    //1.单链表反转
    public static Node reverse(Node node) {
      Node pre = null;
      Node next = null;
      while (node != null) {
        next = node.next;//next = 1结点.next(2结点)
        node.next = pre;//1结点.next=pre(null)
        pre = node;//pre = 1结点
        node = next;//node = 2结点
      }
      return pre;
    }

    public static void main(String[] args) {


      Node head = new Node(0);
      Node node1 = new Node(1);
      Node node2 = new Node(2);
      Node node3 = new Node(3);
      head.setNode(node1);
      node1.setNode(node2);
      node2.setNode(node3);
      Node h = head;
      while (null != h) {
        System.out.print(h.getData() + " ");
        h = h.getNode();
      }
      head = reverse(head);

      System.out.println("\n**************************");

      while (null != head) {
        System.out.print(head.getData() + " ");
        head = head.getNode();
      }

    }

  }

  public static class LinkedListCreator {
    //构建函数
    public Node createLinkedList(List<Integer> list){
      if (list.isEmpty()){
        return null;
      }
      Node headNode = new Node(list.get(0));
      Node tempNode = createLinkedList(list.subList(1, list.size()));
      headNode.setNode(tempNode);
      return headNode;
    }

    //测试方便的打印函数
    public void printList(Node node){
      while (node != null){
        System.out.print(node.getData());
        System.out.print(" ");
        node = node.getNode();
      }
      System.out.println();
    }
  }


}
