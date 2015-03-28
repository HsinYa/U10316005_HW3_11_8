
public class Transaction {
	//Data fields
	private java.util.Date date;
	private char type;
	private double amount;
	
	private double balance;
	private String description;
	
	//Constructors
	public Transaction(){
		
	}
	public Transaction(char type,double amount,double balance,String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		date = new java.util.Date();
	}
	
	//The accessor methods for date, type, amount, balance, description
	public java.util.Date getDate(){
		return date;
	}
	public char getType(){
		return type;
	}
	public double getAmount(){
		return amount;
	}
	public double getBalance(){
		return balance;
	}
	public String getDescription(){
		return description;
	}
	
}
