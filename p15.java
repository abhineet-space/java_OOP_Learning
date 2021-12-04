class Tester {
	public static void main(String[] args) {
		// Implement your code here 
        int day = 1;
        int month = 9;
        int year = 15;
        if (month == 2 & day == 28){
            if (year%4 == 0){
                day = day + 1 ;
            }
            else{
                day = 1; 
                month = month +1;
            }
        }
        else if(month%2 != 0 & day == 31){
            if (month != 12){
                day = 1;
                month = month +1;
            }
            else{
                day =1 ;
                month = 1;
                year = year +1;
            }
        }
        else {
            day = day +1;
        }
        System.out.println(day+"-"+month+"-20"+year);
	}
}

