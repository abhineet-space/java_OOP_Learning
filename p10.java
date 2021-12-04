import java.util.Scanner;

public class p10{
    public static void main(String[] args){
        char wantMoreFood ='N';
        int total =0;
        int unitPrice = 10;
        int quantity = 1;
        int totalQuantity = 0;
        Scanner sc = new Scanner(System.in); // Creating a scanner object
        do{
            total = total + (unitPrice * quantity);
            totalQuantity++;
            System.out.println("Your have added " + totalQuantity + " Unit.");
            System.out.println("Want to add more : ");
            String input = sc.next(); // Accept input from customer
            wantMoreFood = input.charAt(0);
        }while(wantMoreFood == 'Y');
        System.out.println("You have ordered " + totalQuantity + " Unit and your bill amount is : RS "+ total);
        sc.close();
    }

}