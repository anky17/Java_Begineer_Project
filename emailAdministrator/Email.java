package emailAdministrator;

import java.util.Random;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailCapacity = 300;
	private int defaultPasswordlength = 8;
	private String companySignature = "diyalmart.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("\nEmail Created Successfully for: " + this.firstName + " " + this.lastName);
		this.department = getDepartment();
		email = firstName.toLowerCase() + lastName.toLowerCase() + ".080@" + department + "." + companySignature;
		this.password = generatePassword(defaultPasswordlength);
	}

	private String getDepartment() {
		System.out.println(
				"\n\t\tDepartments:\n\t\t1. IT\n\t\t2. Technician\n\t\t3. Support\n\t\t4. Others\n\nEnter the Department(1-4)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			return "it";
		case 2:
			return "technician";
		case 3:
			return "support";
		case 4:
			return "temp";
		}

		return new String("****Choice is Invalid****");
	}

	private String generatePassword(int length) {
		/*
		 * In Java, the Random class is part of the java.util package and is used to
		 * generate pseudo random numbers.
		 */
		Random random = new Random();

		String Capital_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_letters = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String Symbols = "!@#$%^&*?-";
		String allowedCharacters = Capital_letters + Numbers + Small_letters + Symbols;

		// Generating the password using a while loop and values.charAt

		String password = "";
		while (password.length() <= length) {

			/*
			 * the charAt method is a part of the String class, and it is used to retrieve
			 * the character at a specified index within a string.
			 */
			password += (allowedCharacters.charAt(random.nextInt(allowedCharacters.length())));
		}

		return password;
	}

	public String getPassword() {
		return password;
	}

	public int getMailCapacity() {
		return mailCapacity;
	}

	private void changePassword(String password) {
		this.password = password;
	}

	public void setMailCapacity(int mailCapacity) {
		this.mailCapacity = mailCapacity;
	}

	public String displayInfo() {
		return "\n\t\tEmployee Name: " + firstName + " " + lastName + "\n\t\tDepartment: "
				+ this.department.toUpperCase() + "\n\t\tCompany Email Address: " + email
				+ "\n\t\tCompany Email Password: " + this.password + "\n\t\tEmail Capacity: " + mailCapacity + "mb";
	}

}
