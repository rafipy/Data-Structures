public class Node {
    String name;
    String email;
    int phoneNum;
    Node next = null;

    public Node(String name, String email,int phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }


}
