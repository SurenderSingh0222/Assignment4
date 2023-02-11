import java.util.Scanner;

//WAP to find if String contains all unique characters.
public class StringUniqueChar {
    boolean uniqueCharacters(String str) {
    	
    	for(int i=0;i<str.length();i++) {
    		for(int j=i+1;j<str.length();j++) { 
    			if(str.charAt(i)==str.charAt(j)) {
    		        return false;
    			   }
    	     }
    	}	
    return true;  
}
	public static void main(String[] args) {
		StringUniqueChar obj=new StringUniqueChar();
        
		String str="Singh";
		if(obj.uniqueCharacters(str))
			System.out.println("All unique Characters :"+str);
		else
			System.out.println("Non unique Characters :"+str);
	}

}
