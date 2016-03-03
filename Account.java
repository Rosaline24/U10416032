import java.util.Date;
import java.util.ArrayList;
class Account {
	//Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private String name;
	//private Date dateCreated;
	ArrayList transaction = new ArrayList();
	
	
	//Constructor
	Account(){
	}
	Account(int id1, double balance1){
		id = id1;
		balance = balance1;
	}	
	//Set new id, balance, annualInterest for this article
	void setId(int newId){
		id = newId;
	}
	void setBalance(double newBalance){
		balance = newBalance ;
	} 
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate/100;
	}
	void setTransaction(ArrayList newTransaction){
		transaction = newTransaction;
	}
	void setName(String newName){
		name = newName;
	}
	//Return the value of id, balance, annualInterestRate
	int getId(){
		return id;
	}
	double getBalance(){
		return balance;
	}
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	double getMonthlyInterestRate(){
	
		return annualInterestRate/12;
	}
	double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}
	String getName(){
		return name;
	}
	ArrayList getTransaction(){
		return transaction;
	}
	void withdraw(double Money){
	balance = balance - Money;
	Transactions z = new Transactions('W', Money, balance, " ");
	transaction.add(z);
	}
	void deposit(double Money1){
	balance = balance + Money1;
	Transactions z = new Transactions('D', Money1, balance, " ");
	transaction.add(z);
	}
	String gateDate(){
	return dateCreated.toString();}
	
}

		