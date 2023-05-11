package Part_2;

import java.util.ArrayList;

public class Search
{
    // Part 2.1
    public int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx)
    {
        // if the list is empty
        if (list.isEmpty())
        {
            return -1;
        }
        // case if there is nothing like key in the given diap
        else if (beginIdx > endIdx)
        {
            System.out.println("\033[31m\nNot found\033[0m");
            return -1;
        }
        // if end index is higher than the size of ArrayList
        else if (endIdx > list.size())
        {
            System.out.println("\033[31m\nERROR!\nEnd index is higher than the size of ArrayList!\033[0m");
            return -1;
        }
        // if the key was found
        else if (list.get(beginIdx).equals(key)) {
            System.out.println("\033[32mFound! ArrayList index: \033[0m" + beginIdx);
            return beginIdx;
        }
        // recursive case
        else {return recLinearSearch(list, key, beginIdx + 1, endIdx);}
    }

    // Part 2.2
    // binary search that returns index of an found int
    // or -1 if there is nothing like that in array
    public int binarySearch(int[] a, int search)
    {
        int low = 0;
        int high = a.length - 1;
        int binaryFound = -1;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (a[mid] == search)
            {
                binaryFound = mid; // Update index if a match is found
                break; // Exit loop
            }
            else if (a[mid] < search) {low = mid + 1;} // Search in the right half
            else {high = mid - 1;} // Search in the left half
        }

        // Output corresponding message
        if (binaryFound == -1) {System.out.println("\033[31mNot found!\033[0m");}
        else {System.out.println("\033[32mFound! Index: \033[0m" + binaryFound);}
        return binaryFound;
    }

    // Same but recursive
    public int recursiveBinarySearch(int[] a, int search, int low, int high)
    {
        if (low > high) {return -1;} // Element not found

        int mid = (low + high) / 2; // divide by two

        // Element found
        if (a[mid] == search)
        {
            System.out.println("\033[32mFound! Index: \033[0m" + mid);
            return mid;
        }
        // Search in the left half
        else  if (a[mid] > search) {return recursiveBinarySearch(a, search, low, mid - 1);}
        else {return recursiveBinarySearch(a, search, mid + 1, high);} // Search in the right half
    }
}
