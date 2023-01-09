package vovelrev;

import java.util.Scanner;

public class swapvowels {
	public static boolean isConsonent(char ch) {
		return "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".contains(""+ch);
	}
	public static boolean isVovel(char ch) {
		return Character.isLetter(ch)&&!isVovel(ch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int n=s.length();
		char[] g = s.toCharArray();
		
			
				for(int i=0,j=n-1;i<j;i++,j--) 
			{
				//if(i<j)
			{
					
				if(isConsonent(g[i])&&isConsonent(g[j]))
					{
						char t=g[i];
						g[i]=g[j];
						g[j]=t;
					}
						if(isConsonent(g[i]))
						i--;
						else if(isConsonent(g[j]))
						j++;
//						else {
//							char t=g[i];
//							g[i]=g[j];
//							g[j]=t;
//						}
//					
			
				}

			}
		System.out.println(new String(g));
	
		
	
}
}
