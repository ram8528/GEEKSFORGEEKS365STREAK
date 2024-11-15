class Solution {
    void pushZerosToEnd(int[] arr) {
        int lastNonZeroIndex = 0;  // Pointer to track the position for non-zero elements

        // Traverse the array to move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[lastNonZeroIndex] = arr[i];  // Place non-zero element at 'lastNonZeroIndex'
                lastNonZeroIndex++;  // Increment the position for the next non-zero element
            }
        }

        // After all non-zero elements are moved, fill the remaining array with zeros
        for (int i = lastNonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        Print the array after moving zeros to the end
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}