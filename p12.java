import java.util.Scanner;
public class p12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;
        int unitPrice = 10;
        System.out.println("Enter the number of food items to be ordered : ");
        int noOfFood = sc.nextInt();
        for(int c = 1; c <= noOfFood; c++){
            System.out.println("Enter Food Name : ");
            String FoodName = sc.next();
            System.out.println("Enter the quantity : ");
            int Quantity = sc.nextInt();
            System.out.println("You have orderd " + FoodName);
            totalCost = unitPrice * Quantity;
            System.out.println("Oder is Successfully PLaced!");
            System.out.println("Total Cost of the order: " + totalCost);
        }
        sc.close();
        
    }
}
