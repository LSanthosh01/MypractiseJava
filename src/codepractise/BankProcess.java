package codepractise;
import java.util.*;
public class BankProcess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====WELCOME TO BANK ACCOUNT CREATION PROCESS");
		System.out.println("Enter the account holder name:");
		String Accountholder=sc.nextLine();
		System.out.println("Enter the account number     :");
		String accountnum=sc.nextLine();
		System.out.println("Enter the initial balance    :");
		double Initialbalance=sc.nextDouble();
		Bankaccount bk=new Bankaccount(accountnum,Accountholder,Initialbalance);
		System.out.println("Your bank account successfully created. Enjoy and explore our services");
		int choice;
		do {
			System.out.println("-------BANKING SERVICES--------");
			System.out.println("1.DEPOSIT MONEY");
			System.out.println("2.WITHDRAW MONEY");
			System.out.println("3.BALANCE ENQUIRY");
			System.out.println("4.EXIT");
			System.out.println("-------------------------------");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to deposit:");
				double dept=sc.nextDouble();
				bk.deposit(dept);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw:");
				double withdraw=sc.nextDouble();
				bk.withdraw(withdraw);
				break;
			case 3:
				bk.display();
				break;
			case 4:
				System.out.println("THANK YOU FOR USING OUR BANKING SERVICES...VISIT AGAIN!!!!!");
				break;
			default:
				System.out.println("Invalid option!!! please enter the correct option");
			}
		}while(choice!=4);
		sc.close();

	}

}
