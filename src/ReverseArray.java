import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //size of the array
        System.out.println("Enter the size of you array:");
        int size = sn.nextInt();
        //create the array of size(size)
        int[] numbers = new int[size];
        //create a for loop to ask user to input numbers at each index
        System.out.println("Enter " + size + " numbers.");
        for (int i = 0; i < size; i++) {
            numbers[i] = sn.nextInt();
        }
        //display the original array
        System.out.println("Original array:");
        for (int elements : numbers)
            System.out.print(elements + " ");
        //call the reverse method to reverse the numbers/ array
        reverseArray(numbers);
        //display the reversed array
        System.out.println();
        System.out.println("Reversed array: ");
        for (int nums : numbers) {
            System.out.print(nums + " ");
        }

        sn.close();

    }
    //method to reverse the array
    //it takes an array and performs the reversing operation
    public static void reverseArray(int[] array) {
        //starting point of the array...first index
        int start = 0;
        //endpoint or the last index
        int end = array.length - 1;

        while (start < end) {
            //create a temporary variable
            //this method is called the two pointers approach
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //start increases while the  end decreases hence
            start++;
            end--;

        }

    }
}


