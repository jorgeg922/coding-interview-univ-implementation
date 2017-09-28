import java.util.*;
//Finding the prime numbers between 0 to 100
public class primeNumbers {
	
	public static void main (String arg[]){

		boolean[] primes = new boolean[101];

		for(int i=0; i<primes.length; i++){ //initiating all as "primes"
			primes[i] = true;
			//System.out.println(""+i);
		}
		//loop will stop at the square root of 100 because it needs to be factored
		//into two factors. If one is greater than the suare root, the result will be
		//greater than 100
		for(int divisor = 2; divisor*divisor <= primes.length-1; divisor++){ 
			if(primes[divisor]){
				//Checks for multiples of all numbers less than or equal to 100
				//and makes them false. This way we simplify the formula.
				for(int i = 2 * divisor; i<= primes.length-1; i = i + divisor){
					primes[i] = false;
					//System.out.print(""+i+",");
				}
			}
		}
		//print all the primes numbers
		for(int i = 0; i<= primes.length-1; i++){
			if(primes[i]){
				System.out.println("Prime:"+i);
			}
		}
	}
}