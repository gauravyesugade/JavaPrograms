import java.util.Scanner;
class c2w{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		
  		System.out.println("Enter numbers of elements in array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		int mult=1;
  		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				mult=mult*arr[i];
			}
		}

		
  		System.out.println("Multiplication of even Numbers: "+ mult);

	}

}
