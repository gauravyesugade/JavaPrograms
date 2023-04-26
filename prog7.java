import java.util.Scanner;
class c2w{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers of elements in array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter element to search: ");
		int x=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				System.out.println("Index of element is :"+i);
			}

		}


	}

}
