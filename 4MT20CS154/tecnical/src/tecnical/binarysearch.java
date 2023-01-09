package tecnical;
import java.util.*;
public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the search ele:");
		int bsearch=b.nextInt();
		for(int lb=0,ub=arr.length-1;lb<=ub;) {
			int mid=(lb+ub)/2;
			if(arr[mid]==bsearch) {
				System.out.println("Found @----------->"+(mid));
				System.exit(0);
				
			}else if(arr[mid]>bsearch)
			{
				ub=mid-1;
			}
			else
				lb=mid+1;
		}
		System.out.println("----------NOT FOUND---------");
	}

}
