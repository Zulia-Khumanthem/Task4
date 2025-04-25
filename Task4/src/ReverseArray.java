
public class ReverseArray {

    // Function to reverse the array
    public static void reverse(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        // Swap the elements at start and end
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // Recursive call to reverse the remaining array
        reverse(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Call the reverse function
        reverse(array, 0, array.length - 1);

        System.out.println("\nReversed Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
