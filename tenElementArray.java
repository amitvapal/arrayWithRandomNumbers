
// Amitva Pal, Grade 6

/* 
  Generating random numbers using Random function
  and inserting random numbers into an array of 10 elements.
  
*/ 
import java.util.Random;

public class tenElementArray {

	public static void main(String[] args) {
		
		int[] arrayRandom = new int [10];
		
		for(int x = 0; x < arrayRandom.length; x++) {
			
			Random randomNumber = new Random();
			arrayRandom[x] = randomNumber.nextInt(10) + 1;  // excluding 0
		} // end of for loop
		
		
		for(int i = 0; i < arrayRandom.length; i++) {
			
			System.out.println(arrayRandom[i]);
			
		} // end of for loop
		
	} // end of main
	
} // end of class
