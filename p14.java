import java.util.Scanner;
class p14 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of available 1$ Note : ");
		int OneRNote = sc.nextInt();
		System.out.print("Enter the Number of available 5$ Note : ");
		int FiveRNote = sc.nextInt();
		System.out.print("Enter the Purchase amount : ");
		int purAmount = sc.nextInt();
		int total_available_amount = OneRNote * 1 + FiveRNote * 5;
		System.out.println("Total Amount Available = "+ total_available_amount);
		if(purAmount > 0 & purAmount <= total_available_amount){
			System.out.println("$ 1 notes needed = "+ purAmount%5);
			System.out.println("$ 5 notes needed = "+ purAmount/5);
		}
		else{
			System.out.println("-1");
		}
		sc.close();
		
	}
}


///
