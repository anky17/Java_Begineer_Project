package emailGenerator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstName = sc.next();
		System.out.println("Enter the last name: ");
		String lastName = sc.next();
		
		Email email = new Email(firstName,lastName);
		System.out.println(email.displayInfo());
		
		
	}

}
