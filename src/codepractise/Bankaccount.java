package codepractise;
public class Bankaccount {
	private String AccountNumber;
	private String AccountHolder;
	private double balance;
	
	public Bankaccount(String AccountNumber,String AccountHolder,double Initialbalance) {
		this.AccountNumber=AccountNumber;
		this.AccountHolder=AccountHolder;
		if(Initialbalance>0) {
			this.balance=Initialbalance;
		}else {
			this.balance=0;
			System.out.println("The balance cannot be negative. So setting it to Rs.0.0");
		}
		
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited the Rs."+amount+" to "+AccountHolder+"'s Account.");
		}else {
			System.out.println("Invalid amount! Please enter the correct amount.");
		}
	}
	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("Invalid amount! Please enter the correct amount");
		}else if(amount>balance) {
			System.out.println("Transaction failed! Insufficiant funds "+AccountHolder+" is tried to withdraw "+amount+" but the current balance is "+balance);
		}else {
			balance-=amount;
			System.out.println("Withdrawn "+amount+" from "+AccountHolder+"'s account.");
		}
	}
	public void display() {
		System.out.println("--------------BALANCE DETAILS--------------");
		System.out.println("1.Account Holder name:"+AccountHolder);
		System.out.println("2.Account Number     :"+AccountNumber);
		System.out.println("3.Balance            :"+balance);
		System.out.println("-------------------------------------------");
	}


}
