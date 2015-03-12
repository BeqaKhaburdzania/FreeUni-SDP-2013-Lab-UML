import java.util.Scanner;


public class Tester {
	
	
	public static void main(String[] args) {
		
		SortingTemplate temp1 = new IncreasingOrder();
		temp1.templateMethod();	
		
		SortingTemplate temp2 = new DecreasingOrder();
		temp2.templateMethod();	
				
	}
	
}
