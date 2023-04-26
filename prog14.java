
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
			int count=0;
			int temp1=x;
			int temp2=x;
			while(x!=0){
				count++;
				x=x/10;
			}
			
			
			while(temp1!=0){
				int sum=0;
				while(count!=0){
				int a=temp1%10;
				sum=sum+(a*a);
				count--;
				}
			
				if(sum==temp2){
				System.out.println("Armstrong Number Found At Index: "+ i);
			
				}
				temp1=temp1/10;
		}
		
		}
	}

}
