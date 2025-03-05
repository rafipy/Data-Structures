public class SinglyListNode {
    static class Node{
        String data;
        Node next;

        //constructor
        Node(String newData){
            data = newData;
            next = null;
        }
    }

    public static void main(String[] args){
        SinglyListNode list = new SinglyListNode();
        //inserting 4 nodes with data
        Node bill = new Node("Bill");
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sue = new Node("Sue");
        Node sam = new Node("Sam");

        Node head = bill;

        bill.next = tom;
        tom.next = dick;
        dick.next = sue;
        sue.next = harry;
        harry.next = sam;

        System.out.println(bill.data);
        System.out.println(bill.next.data);
        System.out.println(bill.next.next.data);
        System.out.println(bill.next.next.next.data);
        System.out.println(bill.next.next.next.next.data);

        System.out.println("\nOther way to print by using head");
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }
}
