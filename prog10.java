import java.util.Scanner;
class c2w{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter Array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Element with even sum:");
		for(int i=0; i<arr.length;i++){
			int x=arr[i];
			int sum=0;
			while(x!=0){
				sum=sum+(x%10);
				x=x/10;
			 }
			if (sum%2==0){
				System.out.println(arr[i]);
			}

		}

	}
}
