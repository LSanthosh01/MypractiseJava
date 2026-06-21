package practice;
import java.util.*;
public class Main {
	public static void checkVotingEligibility(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age "+age+" is too young to vote");
		}else {
			System.out.println("Welcome you are eligible to vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try {
			System.out.println("checking age "+age);
			checkVotingEligibility(age);
		}catch(InvalidAgeException e){
			System.out.println("caught custom exception "+e.getMessage());
		}
		System.out.println("\n---------------------------------------\n");
		 
	}

}
