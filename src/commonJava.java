public class commonJava {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[]args){
        //String test="hello";
        //System.out.println(test.toArray());
        Node lhead=new Node(1);
        lhead.next=new Node(2);
        lhead.next.next=new Node(3);
        lhead.next.next.next=new Node(4);

        printList(lhead);
        System.out.println();
        Node temp=dOdd(lhead);

        printList(temp);


    }
    public static Node dOdd(Node head){

        if(head.next==null) return null;
        Node dummyHead=new Node(0);
        dummyHead.next=head;
        Node slow=dummyHead;
        Node fast=head;
        if(head.next==null){
                return head;
        }
        while(fast.next != null) {
            if (fast.value % 2 == 1) {
                slow.next = fast.next;
            }
            slow=fast;
            fast=fast.next;
        }
        if(fast.value%2==1){
            slow.next=null;
        }
        return dummyHead.next;

    }
    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }
}
