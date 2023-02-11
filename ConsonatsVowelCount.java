import java.util.Scanner;
//WAP to count the number of consonants, vowels, special characters in a String.
public class CountVowelsConsonants {
//	public void  VowelConsonantSpChar(String str){
	public static void VowelConsonantSpChar(String str) {
		int vowels=0;
    	int consonants=0;
		int SpacialChar=0;
		int digit=0;
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
		if((ch>='a' && ch<='z')||(ch>='A' && ch <='Z')){
			ch=Character.toLowerCase(ch);
			
			if(ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u'){
				vowels++;
			}else {
				consonants++;
			}
			
		  }else if(ch>='0' && ch <= '9') {
			  digit++;
		  }else {
			  SpacialChar++;
		  }
		System.out.println("Vowels:"+vowels);
		System.out.println("Consonant:"+consonants);
		System.out.println("Digit:"+digit);
		System.out.println("Special Character:"+SpacialChar);
			  
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
//		CountVowelsConsonants obj =new CountVowelsConsonants();
//		obj.VowelConsonantSpChar(str);
		 VowelConsonantSpChar(str);
		System.out.println("Original String :"+str);
				
		
		

	}

}
