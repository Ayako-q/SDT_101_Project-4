package Part_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        // Doing stuff that will help to test my code
        Search search = new Search(); // Creating a new instance of a Search class

        // 2.1 related stuff
        ArrayList<String> array = new ArrayList<>();
        array.add("Hellow");
        array.add("my name is");
        array.add("Anton");
        // 2.2 related stuff
        int[] intArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};


        // Separator
        System.out.println("\033[35m\nPart 2.1:\nLinear Search:\n\033[0m");

        // Part 2.1
        System.out.println(search.recLinearSearch(array, "Hellow", 0, 2));
        System.out.println(search.recLinearSearch(array, "Hellow33", 0, 2));
        // 'dumb' check, if end index is more than .size
        System.out.println(search.recLinearSearch(array, "Hellow", 2, 134));

        // Part 2.2
        System.out.println("\033[35m\nPart 2.2:\n search for an array:\033[0m");
        // Searching:
        System.out.println("\nSearching for 4:");
        search.binarySearch(intArray, 4);
        // When there is nothing like that in an array:
        System.out.println("\nSearching for 43:");
        search.binarySearch(intArray, 43);

        // REC BINARY search
        System.out.println("\nSearching for 16:");
        search.recursiveBinarySearch(intArray, 4096, 0, 7);

        // Part 2.3
        System.out.println("\033[35m\nPart 2.3:\nTrace of the recursive binary search:\033[0m");
        System.out.println("""
                So, we have this sorted array of numbers:
                a = {2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600}
                And we're looking for the number 10. We call the recursive binary search method with the array, the key (10),
                and the range to search from the first element to the last.
                We start with low = 0 and high = 13. We calculate the middle index as (low + high) / 2, which gives us 6.
                Now, we compare the value at index 6, which is 32, with our search key 10. Since 32 is greater than 10, 
                we move to the left half of the array. We repeat the process with low = 0 and high = 5. The new middle index is 2.
                We compare the value at index 2, which is 5, with our search key. Since 5 is less than 10, we move to the right half of the array.
                Now, we have low = 3 and high = 5. The middle index becomes 4. 
                We compare the value at index 4, which is 16, with our search key. 
                Since 16 is greater than 10, we move to the left half again.
                We're left with low = 3 and high = 3. Since low is equal to high, we've reached the end of our search range. 
                But unfortunately, the number 10 is not found in the array. So the program returns -1 to indicate that it wasn't found.
                In the end, the value assigned to our index variable is -1. We made a total of 3 recursive calls to the recursiveBinarySearch() method, including the initial call.
                """);

        // Part 2.4
        System.out.println("\033[35m\nPart 2.4:\nTrace of the recursive binary search, key 150:\033[0m");
        System.out.println("""
                We start with the same sorted array:
                a = {2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600}
                Now, we call the recursive binary search method with the array, the key (150), and the range to search from the first element to the last.
                We begin with low = 0 and high = 13. The middle index is calculated as (low + high) / 2, which gives us 6.
                We compare the value at index 6, which is 32, with our search key 150. Since 32 is less than 150, we move to the right half of the array.
                Now, we have low = 7 and high = 13. The middle index becomes 10. We compare the value at index 10, which is 240, with our search key. 
                Since 240 is greater than 150, we move to the left half of the array.
                We're left with low = 7 and high = 9. The new middle index is 8. We compare the value at index 8, which is 96, with our search key. 
                Since 96 is less than 150, we move to the right half again.
                Now, we have low = 9 and high = 9. Since low is equal to high, we've reached the end of our search range.
                But unfortunately, the number 150 is not found in the array. So we return -1 to indicate that the search was unsuccessful.
                In the end, the value assigned to our index variable is -1. We made a total of 3 recursive calls to the recursiveBinarySearch() method, including the initial call.
                """);
    }
}
