import java.util.*;

class overlapArr{
	
	public static void main(String [] args){
		System.out.println("Printing the overlaps from two arrays:");
		
		String A[] = {"2017-02-15","2017-05-15","2017-09-16","2017-12-15"};
		String B[] = {"2017-01-20","2017-02-15","2017-05-15","2017-09-16","2017-12-15","2017-12-31"};
		int size = A.length;
		int end=0, start=0;
		List<String> myList= new ArrayList<String>();

		outerloop:
		for(int i=0; i<size; i++){
			for(int k=0; k<B.length; k++){
				if(A[i] == B[k]){
					start = i;
					//System.out.println(start);
					break outerloop;
				}
			}

		}
		sOuterloop:
		for(int i = size-1; i>=0; i--){
			for(int k=B.length-1; k>=0; k--){
				if(A[i] == B[k]){
					end = i;
					//System.out.println(end);
					break sOuterloop;
				}
			}
		}

		System.out.println("Overlaps:");
		for(int i=start; i<=end; i++){
			myList.add(A[i]);
			System.out.println(A[i]);
		}

		

	}
}