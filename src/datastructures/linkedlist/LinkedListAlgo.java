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


    // 删除倒数第K个结点
    public static Node removeLastKthNode(Node head, int k) {
      //1.首先判断K值和链表是否为空，如果k<=0,或链表为空，直接返回head；
      if (k <= 0 || head == null)
        return head;
      // 2.满足上面条件后，定义Node P=head，重头开始遍历链表，走k步后，退出循环
      // (在此循环中，如果没到K不p就为null了，说明没有倒数第K个节点，k大于表长度了，直接返回head)。
      Node p = head;
      for (int i = 0; i < k; i++) {
        if (p.next != null)
          p = p.next;
        else
          return head;
      }
      // 3.定义Node q = head，与p同步向后走，直到p的next为空时候，节点为要删除节点的前一个结点。
      Node q = head;
      while (p.next != null) {
        p = p.next;
        q = q.next;
      }
      q.next = q.next.next;
      return head;
    }


    public static void main(String[] args) {


      Node head = new Node(0);
      Node node1 = new Node(1);
      Node node2 = new Node(2);
      Node node3 = new Node(3);
      Node node4 = new Node(4);
      Node node5 = new Node(5);
      head.setNode(node1);
      node1.setNode(node2);
      node2.setNode(node3);
      node3.setNode(node4);
      node4.setNode(node5);
      Node h = head;
      while (null != h) {
        System.out.print(h.getData() + " ");
        h = h.getNode();
      }
//      head = reverse(head);
//
//      System.out.println("\n**************************");
//
//      while (null != head) {
//        System.out.print(head.getData() + " ");
//        head = head.getNode();
//      }

      Node node = removeLastKthNode(head, 2);

      System.out.println("\n**************************");

      while (null != node) {
        System.out.print(node.getData() + " ");
        node = node.getNode();
      }

    }

  }


}
