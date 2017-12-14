import java.util.*;

class subArraysMultLessThanK{
	
	public static void main(String[] args){
		//program to find the number of subarrays whose multiples are less than K. Subarrays are defines as adjacent elements.
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add?");
		int number = scan.nextInt();

		int [] arr = new int[number];

		for(int i=0; i<number; i++){
			System.out.println("Enter integer:");
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter K (Program will find subarrays mult less than K):");
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
				System.out.println("pr:"+product);
			}
			
			if(product < k){
				System.out.println("end:"+end +",st:"+start);
				int len = end-start + 1;
				counter= counter + len;
			}
		}
	 return counter;
	}
}