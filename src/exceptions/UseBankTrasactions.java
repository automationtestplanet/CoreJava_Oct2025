package exceptions;

public class UseBankTrasactions {

	public static void main(String[] args) {
		BankTransactions sbiBank = new BankTransactions();
		sbiBank.checkAccountBalance();
		sbiBank.deposit(AccountType.SAVINGS, 50000);
		sbiBank.checkAccountBalance();

		BankTransactions iciciBank = new BankTransactions();
		iciciBank.withdrawl(10000);
		iciciBank.checkAccountBalance();

		try {
			iciciBank.withdrawl(200000);
			
		} catch (Exception e) {

		}
		
		try {
			iciciBank.deposit(AccountType.SAVINGS, 300000);			
		} catch (Exception e) {

		}
		
		
//		int a = 100;
//		
//		Exception e = new ArithmeticException();

		
	}
}
