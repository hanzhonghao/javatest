package datastructures.anyTest;

public class TestForLinkedList {

  public class Node {
    private int data;

    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public Node reverse(Node node) {
      Node pre = null;
      Node next = null;
      while (node != null) {
        next = node.next;//next = 1结点.next(2结点)   先把node的下一个结点存起来
        node.next = pre;//1结点.next=pre(null)        把下一个结点断开
        pre = node;//pre = 1结点                       将pre指向当前节点
        node = next;//node = 2结点                     将当前节点向后平移
      }                                              // 依次循环
      return pre;
    }
  }

  public Node removeLastthNode(Node head,int k){
    if(k<=0||head==null){
      return head;
    }
    Node p = head;
    for(int i =0;i<k;i++){
      if(p.next!=null){
        p=p.next;
      }else{
        return head;
      }
    }

    Node q =head;
    while(p.next!=null){
      p=p.next;
      q=q.next;
    }
    q.next= q.next.next;
    return head;
  }
}
