package demo;

public class BankTransactions {

	static int accountBalance = 100000;

	void deposit(String accountType, int depositAmount) {
		
		switch (accountType) {
		case "SAVINGS":
			if(depositAmount <=200000) {
				accountBalance = accountBalance + depositAmount;
				System.out.println("Amount Deposited: "+ depositAmount);
			}else {
				System.out.println("Maximum deposit Limit for Savings account is 200000");
			}
			break;
		case "CURRENT":
			if(depositAmount <=500000) {
				accountBalance = accountBalance + depositAmount;
				System.out.println("Amount Deposited: "+ depositAmount);
			}else {
				System.out.println("Maximum deposit Limit for Savings account is 500000");
			}
			break;
		case "RETAIL":
			if(depositAmount <=1000000) {
				accountBalance = accountBalance + depositAmount;
				System.out.println("Amount Deposited: "+ depositAmount);
			}else {
				System.out.println("Maximum deposit Limit for Savings account is 1000000");
			}
			break;
		default:
			System.out.println("Invalid accout type: "+accountType);
		}		
	}

	void withdrawl(int withdrawlAmount) {
		if(withdrawlAmount < accountBalance ) {
			if(withdrawlAmount >= 100) {
				accountBalance = accountBalance - withdrawlAmount;
				System.out.println("Amount Withdrawn: "+ withdrawlAmount);
			}else {
				System.out.println("Minimum Withdrawal amount must be multiples of 100");
			}		
		}else {
			System.out.println("In-Sufficient Balance");
		}		
	}

	void checkAccountBalance() {
		System.out.println("Account Balance: "+ accountBalance);
	}

	public static void main(String[] args) {		
		BankTransactions sbiBank = new BankTransactions();
		sbiBank.checkAccountBalance();
		sbiBank.deposit("SAVINGS",50000);
		sbiBank.checkAccountBalance();
		
		BankTransactions iciciBank = new BankTransactions();
		iciciBank.withdrawl(10000);
		iciciBank.checkAccountBalance();
		
		iciciBank.withdrawl(200000);
		
		iciciBank.deposit("SAVINGS", 300000);
	}

}
