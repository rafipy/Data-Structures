import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        // Initialize the items list
        this.items = new ArrayList<>();
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        // Adds an item
        items.add(item);
        System.out.println("You stash a " + item.getName() + " in your inventory.");
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        // Removes an item if it exists, if it doesn't then implement proper error handling
        if (hasItem(item)) {
            items.remove(item);
            System.out.println("You discard the " + item.getName() + " from your inventory.");
        }
        else {
            System.out.println("You rummage to find a " + item.getName() + " but it never existed.");
        }

    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        // Checks if an item exists
        return items.contains(item);
    }

    // Method to display all items in the inventory
    public void displayItems() {
        // Displays all items
        if (items.isEmpty()){
            System.out.println("You own no material possession.");
        }
        else{
            System.out.println("You find your pockets be filled with: ");
            for (Item item : items) {
                System.out.println(item);

            }
        }

    }

    // Method to get the total number of items
    public int getItemCount() {
        // Gets the total number of items
        return items.size();
    }
}