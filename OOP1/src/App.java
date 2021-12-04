import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Object creation
		Customer cust = new Customer();
		// Assigning values to the instance variables
		
		// cust.customerId = 101;
		// cust.customerName = "Stephen Abram";
		// cust.contactNumber = 7856341287L;
		// cust.address = "D089, St. Louis Street, Springfield, 62729";
		System.out.print("Enter the Customer ID : ");
		cust.customerId = sc.nextInt();
		System.out.print("Enter Customer Name : ");
		cust.customerName = sc.next();
		System.out.print("Enter Customer Contact Numer :");
		cust.contactNumber =sc. nextLong();
		System.out.print("Enter Customer Address : ");
		cust.address = sc.next();

		cust.displayCustomerDetails();
		sc.close();
	}
}
