
public class BankAccount {

	private String owner;
	private double balance;
	
	public BankAccount(double balance, String owner) {
		this.setOwner(owner);
		this.setBalance(balance);
	}
	
	public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }
	
	public void withdraw(double amount) {
        this.setBalance(this.getBalance() - amount);
    }
	
   	public double getBalance() {
        return balance;
    }
    
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
