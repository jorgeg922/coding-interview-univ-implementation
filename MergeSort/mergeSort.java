import java.util.*;

public class mergeSort {
	
	public static void main (String arg[]){

		int[] arr_random = new int [10];

		for(int i=0; i<10; i++){
			arr_random[i]= (int) (Math.random() * 50 + 1);
			System.out.print(arr_random[i]+",");
		} 

		mergeSort_algorithm(arr_random);

		System.out.println("");
		
		for(int i=0; i<10; i++){
		System.out.print(arr_random[i]+",");
		}

	}

	static void mergeSort_algorithm(int[] passed){

		int n = passed.length;

		if(n<2){
			return;
		}

		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];

		for(int i=0; i<=mid-1; i++){
			left[i]=passed[i];
		}
		for(int i=mid; i<n; i++){
			right[i-mid]=passed[i];
		}

		mergeSort_algorithm(left);
		mergeSort_algorithm(right);

		merge(left,right, passed);
	}

	static void merge(int[] left, int[] right, int[] passed){

		int length_left	= left.length;
		int length_right = right.length;
		int i = 0; int j=0; int k=0;

		while(i<length_left && j<length_right){
			if(left[i] <= right[j]){
				passed[k] = left[i];
				k++;
				i++;
			}
			else{
				passed[k] = right[j];
				k++;
				j++;
			}
		}
			
		while(i < length_left){
			passed[k]=left[i];
			i++;
			k++;
		}

		while(j < length_right){
			passed[k]=right[j];
			j++;
			k++;
		}
		
	}

}