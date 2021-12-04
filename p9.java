public class p9 {
    public static void main(String[] args){
        int num1=3, num2=4, num3=1;
        if(num1>num2 && num1>num3){
            System.out.println("Greatest Number is : " + num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Greatest Number is : " + num2);
        }
        else{
            System.out.println("Greatest Number is : " + num3);
        }
    }
}
