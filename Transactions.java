import java.util.Date;
class Transactions{
	//Data fields
	char type;
	double amount = 0;
	double balance = 0;
	String description;
	Date date;
	
	Transactions(char type,double amount,double balance,String description){
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description= description;
	}	
	void setType(char newType){
		type = newType;
	}
	void setAmount(double newAmount){
		amount = newAmount;
	}
	void setBalance(double newBalance){
		balance = newBalance;
	}
	void setDescription(String newDescription){
		description = newDescription;
	}
	void setDate(Date newDate){
		date = newDate;
	}
	char getType(){
		return type;
	}
	double getAmount(){
		return amount;
	}
	double getBalance(){
		return balance;
	}
	String getDescription(){
		return description;
	}
	Date getDate(){
		return date;
	}
}
	