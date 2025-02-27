
public class ContactBook {
    public Node head = null;
    public Node tail;


    public void addContact(String name, String email, int phoneNum) {
        if (head == null) {
            Node newNode = new Node(name, email, phoneNum);
            head = newNode;
            tail = newNode;


        }

        else {
            tail.next = new Node(name, email, phoneNum);
            tail = tail.next;

        }

    }

    public void removeContact(String name) {
        Node temp = head;
        Node pointer = head;

        if (name.equals(head.name)) {
            head = pointer.next;
        }

        else {
            while (true) {
                pointer = pointer.next;

                if (name.equals(pointer.name)) {
                    temp.next = pointer.next;
                    break;
                }

                else {
                    temp = temp.next;
                }



            }
        }
    }

    public Node searchEmail() {
        return searchEmail(null);
    }

    public Node searchEmail(String email) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.email.equals(email)) {
                return pointer;
            }
            else {
                pointer = pointer.next;
            }
        }
        return pointer;
    }

    public Node searchName(String name) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.email.equals(name)) {
                return pointer;
            }
            else {
                pointer = pointer.next;
            }
        }
        return null;
    }


    public void printList() {
        Node temp = head;
        System.out.println("Current Address Book: ");
        if (temp == null) {
            System.out.println("EMPTY");
        }
        else {
            while (temp != null) {
                System.out.print("");
                System.out.println("-----------------------------------------");
                printSingular(temp);
                System.out.println("-----------------------------------------");
                System.out.print("");
                temp = temp.next;
        }
        }
    }

    public void printSingular(Node node) {
        System.out.println("Name:" + node.name );
        System.out.println("Number:" + node.phoneNum);
        System.out.println("Email:" +node.email);
    }



}

