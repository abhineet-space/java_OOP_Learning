import java.util.Scanner;

// Find Sum of all the digits of given number
public class p11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner Object
        System.out.println("Enter a Number : "); // Displaying Message
        int input = sc.nextInt(); // Taking input as integer
        int temp = 0;
        do{
            temp = temp + (input % 10);
            input = input / 10;
        }while(input != 0);
        System.out.println("The Sum of given number is "+ temp);

        sc.close();
    }
    
}
