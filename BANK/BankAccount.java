public class BankAccount {
    int ID;
    String name;
    float balance;

    public BankAccount(int ID, String name, float balance){
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public void withdraw(float amount) {
        if (this.balance > amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient balance!");
        }
    }
    // More like print Balatro hahaha KILL ME KILL ME THIS COLD IS KILLING ME
    public void printBalance(){
        System.out.println(this.name + " " + this.ID + ": " + this.balance);
    }
}

