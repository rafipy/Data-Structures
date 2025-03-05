public class DoublyListNode {
    static class Node {
        String data;
        Node next;
        Node prev;

        // Constructor
        Node(String newData) {
            data = newData;
            next = null;
            prev = null;
        }
    }

    public static void main(String[] args) {
        DoublyListNode list = new DoublyListNode(); // empty doubly linked list
        // inserting nodes with data
        Node john = new Node("John");
        Node will = new Node("Will");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node down = new Node("Down");
        Node sam = new Node("Sam");

        Node head = john;
        Node tail = sam;

        john.next = will;
        will.next = dick;
        dick.next = harry;
        harry.next = down;
        down.next = sam;


        will.prev = john;
        dick.prev = will;
        harry.prev = dick;
        down.prev = harry;
        sam.prev = down;

        System.out.println("Print from the head.");
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
        System.out.println(head.next.next.next.next.next.data);

        System.out.println("Print from the tail.");
        System.out.println(tail.data);
        System.out.println(tail.prev.data);
        System.out.println(tail.prev.prev.data);
        System.out.println(tail.prev.prev.prev.data);
        System.out.println(tail.prev.prev.prev.prev.data);
        System.out.println(tail.prev.prev.prev.prev.prev.data);
    }
}