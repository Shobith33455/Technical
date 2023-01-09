package vovelrev;
import java.util.*;
public class swappingvo {
	public static boolean isVowel(char s) {
		return "aeiouAEIOU".contains(""+'s');
	}
	public static boolean isConsonent(char s) {
		return Character.isLetter(s)&&!isVowel(s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int n=s.length();
		char[] g = s.toCharArray();
		for(int i=0;i<=(n-1)/2;i++) 
			for(int j=n-1;j>=0;j++)
			{
				if(i<j)
			{
//					if(g[i]=='a'||g[i]=='e'||g[i]=='i'||g[i]=='o'||g[i]=='u')
//					{
//						String t=
//					}
					if(isVowel(g[i])&&isVowel(g[j]))
					{
						char t=g[i];
						g[i]=g[j];
						g[j]=t;
					}
					else if(isVowel(g[i]))
							i--;
					else if(isVowel(g[j]))
						j++;
					
			
				}

			}
	
	}
	
}
