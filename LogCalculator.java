import java.util.Scanner;
import java.lang.Math;
public class LogCalculator
{
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
	    	while (true){	
		    System.out.println("Tell me if want to calculate a LOG or a DEC, or EXIT");
		    String request = sc.nextLine().toUpperCase();
		
		    switch(request){
		        case "LOG" : 
		            System.out.println("Enter the number you want to calculate the LOG");
		            float log = sc.nextFloat();
		            System.out.printf("The log is: %.4f ", Math.log10(log)*10);
		        break;
		        case "DEC" : 
		            System.out.println("Enter the number you want to calculate the DEC");
		            float dec = sc.nextFloat();
		            System.out.printf("The decimal number is: %.4f ", Math.pow(10, (dec/10)));
		        break;
		        case "EXIT" :
		            System.out.println("Goodbye!");
		        return;
		        default : 
		        System.out.println("Incorrect data entry, try again");
		    }
		    System.out.println();
		    sc.nextLine();
	    	}	
	}
}
