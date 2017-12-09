import java.util.*;

class subArraysMultLessThanK{
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements?");
		int number = scan.nextInt();

		int [] arr = new int[number];

		for(int i=0; i<number; i++){
			System.out.println("Enter integer:");
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter K");
		int k = scan.nextInt();

		int result = findProducts(arr,k);

		System.out.println("The result is: "+result);
	}

	static int findProducts(int[] array, int k){
		int size = array.length;
		int counter = 0;
		int product = 1;

		for(int start=0, end=0; end<size; end++){
			product = product * array[end];
			while(start < end && product>=k){
				product = product / array[start++];
			}
			
			if(product < k){
				int len = end-start + 1;
				counter= counter + len;
			}
		}
	 return counter;
	}
}