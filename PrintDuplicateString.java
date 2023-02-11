//WAP to print Duplicates characters from the String.
public class PrintDuplicateStrings {
public static void printDuplicate(char ch [],int n) {
	int count;
	for(int i=0;i<n;i++) {
		count=1;
		for(int j=i+1;j<n;j++) {
			if(ch[i]==ch[j] && ch[i]!=' ') {
				count++;
				ch[j]='0';
			}
			
		}
		if(count>1 && ch[i]!='0')
			System.out.println(ch[i]);
	}
}
	public static void main(String[] args) {
		char []ch="ineuron".toCharArray();
		int n=ch.length;
		printDuplicate(ch,n);
		
		
	}

}
