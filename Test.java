
public class Test {
	public static void main(String[] args){
		//Create a object of Account
		Account account = new Account("George",1122,1000);
		account.setAnnualInterestRate(1.5);
		
		//Invoke methods
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("Name: " + account.getName());
		System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
		System.out.println("Balance: " + account.getBalance());
		
		//Create ArrayList
		java.util.ArrayList list = account.getTranscations();
		
		System.out.printf("\n%-35s%-15s%-15s%-15s\n","Date","Type","Amount","Balance");
		
		for(int i = 0; i < list.size(); i++){
			//Create a object of Transaction
			Transaction transaction = (Transaction)(list.get(i));
			System.out.printf("%-35s%-15s%-15s%-15s\n",transaction.getDate(),transaction.getType(),
					transaction.getAmount(),transaction.getBalance());
		}
		
	}
}
