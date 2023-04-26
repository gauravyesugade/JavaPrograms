
import java.util.Scanner;
class c2w{
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter size of Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];

	 	System.out.println("Enter elements: ");

		for( int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){

			int x=arr[i];
			int temp=x;
			int rev=0;
			while(x!=0){
				rev=rev*10+(x%10);
				x=x/10;
			}
			if(rev==temp){
			System.out.println("Palindrome present at :"+i);
		}
		}

	}

}
