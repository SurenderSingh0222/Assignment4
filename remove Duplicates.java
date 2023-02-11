import 

//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
public class RemoveDuplicate {

    public static void removeDuplicates(char s[], int n)
    {
        String ans="";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(s[i]==s[j]){
                    break;    
                }              
                               
            }
            if(j==i){        
                ans+=s[i];   
            }                 
        }
        System.out.print(ans);
    }
    public static void main(String[] args){
    	Scanner sc= new Scanner (System.in);
    	System.out.println("Enter the string :");
    	String st =sc.nextLine();
    	char s[] =st.toCharArray();
    	
        //char s[] = "aaabaababbccbccd".toCharArray();
        int n = s.length;
        removeDuplicates(s, n);
    }
}



