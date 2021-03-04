package leetcode203_Remove_LinkedList_Element;

/**
 * 用递归的方法来实现 链表的增删改查
 */

public class homeWrok<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next =next;
        }
        //最后一个有e的Node
        public Node(E e){
            this(e,null);
        }
        //最后的 null
        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    int size;

    public homeWrok(){
        dummyHead = new Node(null,null);
        size = 0;
    }
    //递归实现增
    public void add(Node head ,int index){
        if(index <0 || index >size)
            throw new IllegalArgumentException("Index Error");
        //if(head == null)


    }

}
