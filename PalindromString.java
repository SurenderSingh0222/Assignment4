import java.util.Scanner;
//WAP to check if “2552” is palindrome or not.
public class PalindromeString {

    public static void main(String[] args) {
				
		    String original,reverse="";
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter the String or number :");
		    original=in.nextLine();
		    
		    int length = original.length();
		    for(int i=length-1;i>=0;i--) 
		    	reverse=reverse+original.charAt(i);
		    	
		    	if(original.equals(reverse))
		    		System.out.println("It is palindrome");
		    	else
		    		System.out.println("It is not a palindrome");
		    	
		    
		    
		   
			
     }	

}
