package tecnical;

public class merg2arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry1[]= {1,2,3,4};
		int arry2[]= {5,6,7,8};
		int c[]=new int[10];
		for (int i=0;i<arry1.length-1;i++) {
			//for (int j=i+1;j<arry2.length-1;j++) 
				if(arry1[i]>arry2[i]) {
					c[i]=arry1[i];
				}
				else
					c[i]=arry2[i];
			}
	}

}
