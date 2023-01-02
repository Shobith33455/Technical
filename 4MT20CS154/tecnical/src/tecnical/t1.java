package tecnical;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,11,7,4,291,17};
		for (int i=0;i<arr.length-1;i++)
			for (int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
				//swapping 
				arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
		}
		for (int i=0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");

	}

}
