public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item riab = new Item("Rain-in-a-Bottle");
        Item rhongo = new Item("Rhongomyniad");
        Item cnpProtag = new Item("Rodion Romanovich Raskolnikov");
        Item shotgun = new Item("Remington M870");

        inventory.addItem(riab);
        inventory.addItem(rhongo);
        inventory.addItem(cnpProtag);

        inventory.displayItems();
        inventory.removeItem(cnpProtag);
        inventory.displayItems();
        inventory.addItem(shotgun);
        inventory.displayItems();


    }
}