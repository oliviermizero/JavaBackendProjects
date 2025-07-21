package week04;

public class ArraysAndMethodsAssignment {

	public static void main(String[] args) {
		
		// STEP 1: Create array of ages and perform operations
        System.out.println("STEP 1: Working with ages array");
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // Step 1a: Subtract first element from last element
        int difference1 = ages[ages.length - 1] - ages[0]; // 93 - 3 = 90
        System.out.println("1a. Difference (last - first) in ages array: " + difference1);
        
        // Step 1b: Create ages2 array with 9 elements
        int[] ages2 = {5, 15, 25, 35, 45, 55, 65, 75, 85}; // 9 elements
        
        // Step 1b.ii: Repeat subtraction with ages2 array
        int difference2 = ages2[ages2.length - 1] - ages2[0]; // 85 - 5 = 80
        System.out.println("1b. Difference (last - first) in ages2 array: " + difference2);
        System.out.println("    This shows dynamic indexing works for different array lengths:");
        System.out.println("    ages array length: " + ages.length + ", ages2 array length: " + ages2.length);
        
        // Step 1c: Calculate average age using a loop
        int sum = 0;
        for (int age : ages) {
            sum += age; // Add each age to the total sum
        }
        double averageAge = (double) sum / ages.length; // Cast to double for precise division
        System.out.println("1c. Average age: " + averageAge);
        
        System.out.println(); // Empty line for readability

	}

}
