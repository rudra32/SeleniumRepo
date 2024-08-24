package Week1day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[] = {3, 2, 11, 4, 6, 7};
        
        
        int b[] = {1, 2, 8, 4, 9, 7};
        
        // Iterate over the first array
        for (int i = 0; i < a.length; i++) {
            // Nested loop to iterate over the second array
            for (int j = 0; j < b.length; j++) {
                // Compare elements of both arrays
                if (a[i] == b[j]) {
                    // Print the matching element
                    System.out.println("Matching element: " + a[i]);
                }
            }
        }
	}

}
