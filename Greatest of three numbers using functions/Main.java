import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here  
      Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd_of_2_numbers(n1, n2);// Function call
	    System.out.print(gcd_of_2_numbers(result, n3));// Function call
	}
	// Function to find the gcd of 2 numbers
	public static int gcd_of_2_numbers(int num1, int num2)
	{
	    int max_element = 0;
	    if(num1 > num2)
	    {
	        max_element = num1;
	    }
	    else{
	        max_element = num2;
	    }
	    
	    return max_element;
	}
}
	
