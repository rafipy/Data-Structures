public class SavingsAccount extends BankAccount{
    float interestRate;

    public SavingsAccount(int ID, String name, float balance, float interestRate) {
        super(ID, name, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += balance * interestRate / 100;
    }


}
