package Week1day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Input array
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
        
        // Sort the array
        Arrays.sort(arr);
        
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] != i + 1) {
                
                System.out.println("Missing Number: " + (i + 1));
               
                break;
            }
        }
		
	}

}
