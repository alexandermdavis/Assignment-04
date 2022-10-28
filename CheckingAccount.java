
public class CheckingAccount extends BankAccount{

	private double insufficientFundsFee;
	
	public CheckingAccount(double balance, String owner, double insufficientFundsFee) {
		super(balance, owner);
		this.insufficientFundsFee = insufficientFundsFee;
	}
	
	public void processCheck(double checkAmount) {
		super.deposit(checkAmount);
	}
	
	public void withdraw(double amount) {
		if(amount > super.getBalance()) {
			
			setBalance(super.getBalance() - amount);
			this.insufficientFundsFee = 0;
			
		}else {
			
			setBalance(super.getBalance() - amount);
		
		}
		
	}
	
	public void displayCheckAcc() {
	System.out.println("Owner: " + super.getOwner());
	System.out.println("Balance: $" + super.getBalance());
	System.out.println("Insufficient Fund Fee: " + insufficientFundsFee);
	System.out.println("");      
    }
	
}
