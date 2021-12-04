//import java.io.*class;

// public class Customer{       //Class
//     public int customerId; // Instances
//     public String customerName;
//     public long contactNumber;
//     public String address;

//     public void displayCustomerDetails(){     // Method of Display Data
//         System.out.println("Displaying customer details \n***********");
// 		System.out.println("Customer Id : " + customerId);
// 		System.out.println("Customer Name : " + customerName);
// 		System.out.println("Contact Number : " + contactNumber);
// 		System.out.println("Address : " + address);
// 		System.out.println();
//     }
// }


public class Tester{
    public static void main(String args){
        // Object creation
        Customer customers =new Customer();
        // Assinging Values to 
        customers.customerId = 101;
        customers.customerName = "Abhineet Kumar";
        customers.contactNumber = 7050630902L;
        customers.address = "D-344/301,Sukhobristi Complex, Shahpoorji";
        
        customers.displayCustomerDetails();



    }
}