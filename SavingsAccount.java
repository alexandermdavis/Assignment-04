
public class SavingsAccount extends BankAccount{
    
private double annualInterestRate;

	public SavingsAccount(double balance, String owner, double annualInterestRate) {
		super(balance, owner);
		this.annualInterestRate = annualInterestRate;
	}

	public void depositMonthlyInterest() {
		super.deposit(annualInterestRate * super.getBalance());
    }
    
	public void withdraw(double amount) {
    	if(amount > super.getBalance()) {
			
    		System.out.println("Cannot withdraw, insufficient funds for: " + super.getOwner());
			return;
			
		}
    	setBalance(super.getBalance() - amount);
    }
    
	public void displaySavingsAcc() {
	System.out.println("Owner: " + this.getOwner());
	System.out.println("Balance: $" + this.getBalance());
	System.out.println(""); 
    }
    
}
