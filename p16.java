public class p16 {
    public static void main(String[] args){
        int number = 371;
        int temp = number;
        int len = String.valueOf(temp).length();
        double sum =0;
        // for(int i= 1; i<=len;i++){
        //     int num = temp % 10; // Remainder 
        //     temp = temp/10; // Quotient  
        //     sum = sum + Math.pow(num, len);
        // }
        while(temp>0){
            int num = temp % 10; // Remainder 
            temp = temp/10; // Quotient  
            sum = sum + Math.pow(num, len);
        }
        
        if(sum == number){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
