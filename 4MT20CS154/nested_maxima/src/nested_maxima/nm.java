package nested_maxima;

public class nm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new java.util.Scanner(System.in).nextLine();
		int len=str.length();
		for(int i=1;i<=len;i++) {
			
			System.out.printf("%-"+len+"."+i+"s\n",str);
			System.out.printf("%"+len+"."+i+"s",str);
			}
		for(int i=len;i>=1;i--) {
			
		System.out.printf("%-"+len+"."+i+"s\n",str);
		System.out.printf("%"+len+"."+i+"s",str);
		}
	
		
		
		/*for(int i=1;i<=len;i++)
			System.out.printf("%"+len+"."+i+"s\n",str);*/
	}

}
