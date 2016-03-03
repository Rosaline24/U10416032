import java.util.ArrayList;
public class main{
	public static void main(String[] args){
		Account A = new Account(1122,1000);
		A.setAnnualInterestRate(1.5);
		A.setName("George");
		A.deposit(30);
		A.deposit(40);
		A.deposit(50);
		
		A.withdraw(5);
		A.withdraw(4);
		A.withdraw(2);
		
		System.out.printf("name:%s ,interest rate:%f ,balance:%f ",A.getName(),A.getAnnualInterestRate(),A.getBalance());
		ArrayList list = A.getTransaction();
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(((Transactions)list.get(i)).getType() +" " + ((Transactions)list.get(i)).getAmount() 
			+" "+ ((Transactions)list.get(i)).getBalance() + " " +((Transactions)list.get(i)).getDate());
		}
	
	}
	
}
