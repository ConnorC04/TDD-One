package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass

    private String accNum;
    private String ownName;
    private double accBalance = 0.0;

    public BankAccount(String accountNumber, String ownerName) {
        // Your implementation here
        this.accNum = accountNumber;
        this.ownName = ownerName;
        this.accBalance = accBalance;
    }
    
    public String getAccountNumber() {
        // Your implementation here
        return this.accNum;
    }
    
    public String getOwnerName() {
        // Your implementation here
        return this.ownName;
    }
    
    public double getBalance() {
        // Your implementation here
        return this.accBalance;
    }
    
    public void deposit(double amount) {
        if (amount < 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        else{
            this.accBalance += amount;
        }
    }
    
    public void withdraw(double amount) {
        // Your implementation here
        if (this.accBalance < amount){
            throw new IllegalStateException("Insufficient funds");
        }else{
            if(amount < 0){
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }else{
                this.accBalance -= amount;
            }

        }
    }
}
