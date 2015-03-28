
public class Account {
	//Data fields
	private int id = 0;
	private String name;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated ;
	private java.util.ArrayList transcations = new java.util.ArrayList();
	
	//Constructors
	public Account(){
		dateCreated = new java.util.Date();
	}
	public Account(String name,int id,double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}   
	
	//Accessor and mutator methods for id, balance, annualInterestRate
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//The accessor methods for name, transcations
	public String getName(){
		return name;
	}
	public java.util.ArrayList getTranscations(){
		return transcations;
	}
	
	//The accessor method for dateCreated
	public java.util.Date getDateCreated(){
		return dateCreated ;
	}
	//Return the monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate/1200 ;
	}
	//Return the monthly interest
	public double getMonthlyInterest(){
		return balance*(annualInterestRate/1200);
	}
	
	//Withdraw a specified amount from the account
	public void withdraw(double amount){
		balance -= amount;
		transcations.add(new Transaction('W',amount,balance,""));
	}
	//Deposit a specified amount to the account
	public void deposit(double amount){
		balance += amount;
		transcations.add(new Transaction('D',amount,balance,""));
	}
	
}
