import java.util.Scanner;
class c2w{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[]= new int[size];

		System.out.println("Enter elements");
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length;i++){

		    int	x=arr[i];

			for (int j=i;j<arr.length;j++){

				if (arr[i]+arr[j]==9){

					System.out.println("Sum 9 found at:" + i+" and "+j);
			
				}
				
			
			}

		}

	}
}
