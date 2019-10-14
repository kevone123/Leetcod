class Node{
    int val;
    Node next;
    Node(int val, Node next){
        this.next = next;
        this.val = val;
    }

}
public class PalindromeLinkedList {

    public static void printList(Node head){
        Node ptr = head;
        while(ptr!= null){
            System.out.print(ptr.val + " ");
            ptr = ptr.next;
        }
    }

    public static Node reverse(Node head){
        /*
          2-> 3 -> 4 - >5
          s   f
          2 <-3
          slow.next = null

                   3-> 2->null

           temp = fast.next
           fast.next = slow

           slow = fast
           fast = temp;
         */

        //printList(hold);
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;




    }

    public static boolean compare(Node head, Node midHead){

            while (midHead.next != null) {
                if (head.val != midHead.val) return false;
                head = head.next;
                midHead = midHead.next;
        }
        return true;
    }
    public static boolean PalindromeL(Node head){
       /*
           [        ]  /2

           start the second pointer at the ha;f
           pointer
                *
           get the index counter
           if
             2  4 6 4 2
            2* , 4
           * 2 4 7 6

          9-> 8->2-> 4->6->4->2->8->9
          9, 8, 2 , 4,6
          6,4,2,8,9


           find the middle of the list
             reverse the middle half of the list
             check if they are equal
             reverse them back



          // either forwards or backwards

        */
        System.out.println("Hello");
        Node midHead = head;
        Node middleNode = head;
        while( midHead!= null && midHead.next!= null){
            midHead = midHead.next.next;
            middleNode = middleNode.next;
        }
        //System.out.println(half);
        System.out.println("before reverse");
        printList(middleNode);
        reverse(middleNode);
        System.out.println("after reverse");
        printList(middleNode);
        boolean result = compare(head,midHead);
        return result;

    }
    public static void main(String[]args){
        Node fifth = new Node(2,null);
        Node fourth = new Node(4,fifth);
        Node third = new Node(6,fourth);
        Node second = new Node(4, third);
        Node first = new Node(2,second);
        System.out.println(PalindromeL(first));
        System.out.println(first.next.next.val);
    }



}
