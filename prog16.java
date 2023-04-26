import java.util.Scanner;
class c2w{

	public static void main(String[] args ){

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter elements:");

		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		
		fun(arr);

	}
	
	static void fun(int arr[]){
		int sum=0;
		for(int x : arr){
			sum=sum+x;
		}

		System.out.println(sum);

	}
}
