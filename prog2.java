import java.util.Scanner;

class c2w{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in array");
		int size = sc.nextInt();

		int arr[]= new int[size];

		
		System.out.println("Enter elements in array");
		int sum=0;
		
		for( int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}


		System.out.println("sum="+ sum);


	}


}
