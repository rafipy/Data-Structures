import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        boolean running = true;

        while(running) {
            System.out.println("<---------------------------------->");
            System.out.println("1. Enter the queue call.");
            System.out.println("2. Take a queued call.");
            System.out.println("3. Check queue.");
            System.out.println("4. Exit");
            System.out.println("<----------------------------------> \n");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Input your name.");
                    String inp = sc.nextLine();
                    queue.add(inp);
                    break;
                case "2":
                    if (queue.isEmpty()) {
                        System.out.println("No more calls.");
                    }
                    else {
                        queue.remove();
                    }
                    break;
                case "3":
                    System.out.println("Current queue: ");
                    for (String s : queue) {
                        System.out.println(s);
                    }
                    break;
                case "4":
                    running = false;
                    break;


            }

        }

    }
}