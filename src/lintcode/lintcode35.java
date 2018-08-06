package lintcode;

import java.util.Stack;

/**
 * Created by zhonghao.han on 8/6/2018.
 * 35. 翻转链表
 * 翻转一个链表
 * <p>
 * 样例
 * 给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
 * <p>
 * 挑战
 * 在原地一次翻转完成
 */
public class lintcode35 {

  /**
   * @param head: n
   * @return: The new head of reversed linked list.
   */
  public static ListNode reverse(ListNode head) {
    // write your code here
    if(head ==null || head.next ==null)
      return head;

    // null->1->2->3->4->5->null
    //  p    c
    ListNode prev = null;
    ListNode curr = head;

    while(curr !=null){
      // null->1->2->3->4->5->null
      //  p    c  n
      ListNode next = curr.next;

      // null<-1  2->3->4->5->null
      //  p    c  n
      curr.next = prev;

      // null<-1  2->3->4->5->null
      //       c  n
      //       p
      prev = curr;

      // null<-1  2->3->4->5->null
      //       p  n
      //          c
      curr = next;

    }
    // null<-1<-2<-3<-4<-5  null
    //                   p  n
    //                      c

    return prev;
  }

  //方法二，利用栈

  public ListNode reverse2(ListNode head) {
    // write your code here
    if (head == null) {
      return head;
    }

    Stack<ListNode> stack = new Stack<>();

    while (head != null) {
      stack.push(head);
      head = head.next;
    }

    ListNode result = stack.pop();
    ListNode node = result;

    while (!stack.isEmpty()) {
      node.next = stack.pop();
      node = node.next;
    }

    node.next = null;

    return result;
  }
  /**
   * Definition for ListNode
   */
  class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }

    public  int printValue(){
      return val;
    }
  }

}


