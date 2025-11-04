package exceptions;

public class BankTransactions {

	static int accountBalance = 100000;

	void deposit(AccountType accountType, int depositAmount) {
		
		switch (accountType) {
		case SAVINGS:
			if(depositAmount <=200000) {
				accountBalance = accountBalance + depositAmount;
				System.out.println("Amount Deposited: "+ depositAmount);
			}else {
				throw new BankTransactionException("Maximum deposit Limit for Savings account is 200000");
			}
			break;
		case CURRENT:
			if(depositAmount <=500000) {
				accountBalance = accountBalance + depositAmount;
				System.out.println("Amount Deposited: "+ depositAmount);
			}else {
				throw new BankTransactionException("Maximum deposit Limit for Savings account is 500000");
			}
			break;
		case RETAIL:
			if(depositAmount <=1000000) {
				accountBalance = accountBalance + depositAmount;
				System.out.println("Amount Deposited: "+ depositAmount);
			}else {
				throw new BankTransactionException("Maximum deposit Limit for Savings account is 1000000");
			}
			break;
		default:
			throw new BankTransactionException("Invalid accout type: "+accountType);
		}		
	}

	void withdrawl(int withdrawlAmount) {
		if(withdrawlAmount < accountBalance ) {
			if(withdrawlAmount >= 100) {
				accountBalance = accountBalance - withdrawlAmount;
				System.out.println("Amount Withdrawn: "+ withdrawlAmount);
			}else {
				throw new BankTransactionException("Minimum Withdrawal amount must be multiples of 100");
			}		
		}else {
			throw new BankTransactionException("In-Sufficient Balance");
		}		
	}

	void checkAccountBalance() {
		System.out.println("Account Balance: "+ accountBalance);
	}

}
