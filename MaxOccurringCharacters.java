//WAP to find the maximum occurring character in a String.
public class FindMaxChar {
	static final int ascii_Size=256;
	static  char getMaxOcurringChar(String str) {
		
		
		int count [] = new int [ascii_Size];
		int n=str.length();
		for(int i=0;i<n;i++) 
			count [str.charAt(i)]++;
		 int max =-1;
		 char result=' ';
		
		for(int i=0;i<n;i++) {
			if(max<count[str.charAt(i)]) {
				max =count[str.charAt(i)];
				result = str.charAt(i);
			}
			
		}
		
		return result;
		
	}
	
	
	

	public static void main(String[] args) {
         
		String str="xzrt3#####5^&* string";
		System.out.println("Max occurring Character is:"+getMaxOcurringChar(str));
		
		
		
	}

}
