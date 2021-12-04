public class p5 {
    public static void main(String[] args) {
        String CustomerType= "Regular";
        int quantity = 2;
        int unitPrice = 10;
        int totalCost = 0;
        int discount = 5;
        totalCost = unitPrice * quantity;
        if(CustomerType == "Regular"){
            totalCost = totalCost - (totalCost* discount/100);
            System.out.println("You are a regular Customer and eligable for getting 5% discount.");
        }
        System.out.println(totalCost);
    }
}
