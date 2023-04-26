
import java.util.Scanner;
class c2w{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		
  		System.out.println("Enter numbers of elements in array");
		int size = sc.nextInt();
		int arr1[]= new int[size];
		int arr2[]=new int [size];
  		
		System.out.println("Enter elements in array 1");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

  		System.out.println("Enter elements in array 2");
		for(int i=0;i<arr1.length;i++){
			arr2[i]=sc.nextInt();
		}
		
  		System.out.println("Common Elements :");
		for(int i=0;i<arr1.length;i++){
			int x=arr1[i];
			for(int j=0;j<arr2.length;j++){
				if(arr2[j]==arr1[i]){
					System.out.println(x);
				}
			}
		}

	}

}
