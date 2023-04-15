package classwork;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		System.out.println("The first five fermat's prime number are :-");
		 int n = 0;        
	        long result = 0;
	        int count = 0;	
	        
	        while (n <= 10) {
	            result= (long) (Math.pow (2, Math.pow(2, n)) + 1);
	            n++;
		        for(int i = 2;i<=result/2;i++) {
		    		if(result%i==0) {
		    			count++;
		    		}
		    		
		    				
		        
		}
		        if(count==0) {
		        	System.out.println("prime" +result);
		        }
		        else {
		        	System.out.println("not prime");
		        }
		}
	            System.out.println (result);
	            }
	      
}



	
