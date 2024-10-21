package Programs;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] arr1= {6,7,8,9};
		int a=arr.length;
		int b=arr1.length;
		int[] arr2 = new int[9];
		int j=0;
		for ( j=0;j<5;j++)
		{
		arr2[j]=arr[j];
		System.out.println(arr2[j]);
		}
		int k=0;
		for (k=0;k<4;k++)
		{
			arr2[k]=arr1[k];
			System.out.println(arr2[k]);
		}
		
		
	}

}
