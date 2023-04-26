
import java.util.Scanner;
class c2w{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		
  		System.out.println("Enter numbers of elements in array");
		int size = sc.nextInt();
		char arr[]= new char[size];

  		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("Vovels :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println(arr[i]);
			}
		}
	}

}
