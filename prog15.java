
import java.util.Scanner;
class c2w {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int arr1[]= new int[size];
		int arr2[]=new int [size];

		System.out.println("Enter elements in array 1");
		for (int i=0; i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements in array 2");
		for (int i=0; i<arr1.length;i++){
			arr2[i]=sc.nextInt();
		}

	System.out.println("Uncommon element");
		for (int i=0; i<arr1.length;i++){
			int x=arr1[i];

				int flag=0;
			for(int j=0; j<arr1.length;j++){
				if (arr1[i]==arr2[j]){
					flag=1;
				}
				
			}
	
			if(flag==0){
				System.out.println(arr1[i]);
			}
		}

		for (int i=0; i<arr1.length;i++){
			int x=arr2[i];

				int flag=0;
			for(int j=0; j<arr1.length;j++){
				if (arr1[j]==arr2[i]){
					flag=1;
				}
				
			}
	
			if(flag==0){
				System.out.println(arr2[i]);
			 }
		}

	}

}
