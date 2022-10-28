
public class MainClass {

	public static void main(String[] args) {

		SavingsAccount savingAcc01 = new SavingsAccount(100, "Joe", 0.01);
		CheckingAccount checkAcc01 = new CheckingAccount(200, "Emily", 10);
		
		checkAcc01.deposit(50);
		savingAcc01.withdraw(25);
		checkAcc01.processCheck(50);
		checkAcc01.withdraw(100);
		savingAcc01.deposit(100);

		SavingsAccount savingAcc02 = new SavingsAccount(250, "Sam", 0.005);

		savingAcc01.depositMonthlyInterest();
		savingAcc02.depositMonthlyInterest();
		checkAcc01.withdraw(500);
		savingAcc01.withdraw(500);
		
		savingAcc01.displaySavingsAcc();
		checkAcc01.displayCheckAcc();
		savingAcc02.displaySavingsAcc();
		
	}

}
