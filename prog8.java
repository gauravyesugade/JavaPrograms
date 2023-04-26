
import java.util.Scanner;
class c2w{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		
  		System.out.println("Enter numbers of elements in array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
  		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
			
		int x=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<x){
				x=arr[i];
			}
		}
		System.out.println("Minimum element :"+x);

	}

}
