package tecnical;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"safhjj","fddfdhd","kytury","ajhjjh"};
		for (int i=0;i<names.length-1;i++)
			for (int j=i+1;j<names.length;j++)
		{
			if(names[i].compareToIgnoreCase(names[j])>0) {
				//swapping 
				String temp=names[i];
				names[i]=names[j];
				names[j]=temp;
			}
			
			
		}
		for (int in=0;in<=names.length-1;in++)
			System.out.print(names[in]+" ");
	}

}
