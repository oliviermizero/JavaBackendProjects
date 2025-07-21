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
        
        // STEP 2: Work with names array
        System.out.println("STEP 2: Working with names array");
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        // Step 2a: Calculate average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length(); // Add the length of each name
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("2a. Average number of letters per name: " + averageLetters);
        
        // Step 2b: Concatenate all names with spaces
        String concatenatedNames = "";
        for (int i = 0; i < names.length; i++) {
            concatenatedNames += names[i];
            // Add space after each name except the last one
            if (i < names.length - 1) {
                concatenatedNames += " ";
            }
        }
        System.out.println("2b. All names concatenated: " + concatenatedNames);
        
        System.out.println();
        
        // STEP 3 & 4: Answer array access questions
        System.out.println("STEP 3 & 4: Array Access Questions");
        System.out.println("3. To access the last element of any array: array[array.length - 1]");
        System.out.println("4. To access the first element of any array: array[0]");
        System.out.println("   Example - Last element of ages: " + ages[ages.length - 1]);
        System.out.println("   Example - First element of ages: " + ages[0]);
        
        System.out.println();
        
        // STEP 5: Create nameLengths array
        System.out.println("STEP 5: Creating nameLengths array");
        int[] nameLengths = new int[names.length]; // Create array same size as names
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); // Store length of each name
        }
        
        // Display the nameLengths array for verification
        System.out.print("Name lengths: ");
        for (int i = 0; i < nameLengths.length; i++) {
            System.out.print(nameLengths[i]);
            if (i < nameLengths.length - 1) System.out.print(", ");
        }
        System.out.println();
        
        // STEP 6: Calculate sum of nameLengths array
        System.out.println("STEP 6: Sum of nameLengths array");
        int nameLengthsSum = 0;
        for (int length : nameLengths) {
            nameLengthsSum += length; // Add each length to total
        }
        System.out.println("Sum of all name lengths: " + nameLengthsSum);
        
        System.out.println();
        
        // Step 7: Test repeatWord method
        String repeatedWord = repeatWord("Hello", 3);
        System.out.println("7. repeatWord('Hello', 3): " + repeatedWord);
        
        // Step 8: Test createFullName method
        String fullName = createFullName("John", "Doe");
        System.out.println("8. createFullName('John', 'Doe'): " + fullName);
        
        // Step 9: Test isSumGreaterThan100 method
        int[] testArray1 = {50, 30, 25}; // Sum = 105
        int[] testArray2 = {10, 20, 30}; // Sum = 60
        System.out.println("9. isSumGreaterThan100([50,30,25]): " + isSumGreaterThan100(testArray1));
        System.out.println("   isSumGreaterThan100([10,20,30]): " + isSumGreaterThan100(testArray2));
        
        // Step 10: Test calculateAverage method
        double[] testDoubles = {10.5, 20.3, 15.7, 8.9};
        double average = calculateAverage(testDoubles);
        System.out.println("10. calculateAverage([10.5,20.3,15.7,8.9]): " + average);
        
        // Step 11: Test isFirstAverageGreater method
        double[] array1 = {15.0, 25.0, 35.0}; // Average = 25.0
        double[] array2 = {10.0, 20.0, 20.0}; // Average = 16.67
        System.out.println("11. isFirstAverageGreater([15,25,35], [10,20,20]): " + 
                          isFirstAverageGreater(array1, array2));
        
        // Step 12: Test willBuyDrink method
        System.out.println("12. willBuyDrink(true, 15.00): " + willBuyDrink(true, 15.00));
        System.out.println("    willBuyDrink(false, 15.00): " + willBuyDrink(false, 15.00));
        System.out.println("    willBuyDrink(true, 8.00): " + willBuyDrink(true, 8.00));
        
        // Step 13: Test custom method
        System.out.println("13. findMaxValue([64,2,93,28]): " + findMaxValue(new int[]{64, 2, 93, 28}));

	}
	
	/**
     * STEP 7: Method that concatenates a word to itself n times
     * 
     * @param word The string to repeat
     * @param n The number of times to repeat the word
     * @return The word concatenated n times
     */
    public static String repeatWord(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word; // Concatenate the word n times
        }
        return result;
    }
    
    /**
     * STEP 8: Method that creates a full name from first and last name
     * 
     * @param firstName The first name
     * @param lastName The last name
     * @return Full name with space separator
     */
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName; // Combine with space in between
    }
    
    /**
     * STEP 9: Method that checks if sum of array elements is greater than 100
     * 
     * @param numbers Array of integers to sum
     * @return true if sum > 100, false otherwise
     */
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number; // Calculate total sum
        }
        return sum > 100; // Return true if sum exceeds 100
    }
    
    /**
     * STEP 10: Method that calculates the average of a double array
     * 
     * @param numbers Array of double values
     * @return The average of all elements
     */
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0; // Handle empty array case
        }
        
        double sum = 0;
        for (double number : numbers) {
            sum += number; // Add each number to sum
        }
        return sum / numbers.length; // Calculate and return average
    }
    
    /**
     * STEP 11: Method that compares averages of two double arrays
     * 
     * @param array1 First array to compare
     * @param array2 Second array to compare
     * @return true if average of array1 > average of array2
     */
    public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
        double avg1 = calculateAverage(array1); // Reuse our calculateAverage method
        double avg2 = calculateAverage(array2);
        return avg1 > avg2; // Compare the two averages
    }
    
    /**
     * STEP 12: Method that determines if someone will buy a drink
     * 
     * @param isHotOutside Whether it's hot outside
     * @param moneyInPocket Amount of money available
     * @return true if it's hot AND money > 10.50
     */
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50; // Both conditions must be true
    }
    
    /**
     * STEP 13: Custom method - Finds the maximum value in an integer array
     * 
     * Purpose: This method solves the problem of finding the largest number in an array.
     * Why created: Finding maximum values is a common programming task useful in
     * data analysis, sorting algorithms, and statistical calculations.
     * 
     * @param numbers Array of integers to search
     * @return The maximum value found in the array
     */
    public static int findMaxValue(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int max = numbers[0]; // Start with first element as maximum
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is larger
            }
        }
        return max; // Return the maximum value found
    }

}
