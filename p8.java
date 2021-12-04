public class p8 {
    public static void main(String[] args){
        String customerType = "Premium";
        int discount;
        switch(customerType){
            case "Normal":
                discount = 5;
                //System.out.println("You have 5% discount.");
                break;
            case "Premium" :
                discount = 10;
                //System.out.println("You have 10% discount.");
                break;
            default:
                discount = 0;
                break;
        }
        System.out.println("You have a discount of "+ discount +"% as you are a "+ customerType +" customer.");

    }
}
