class Solution {
    public int getSecondLargest(int[] arr) {
        // Handle edge case: array must have at least two elements
        if (arr == null || arr.length < 2) {
            return -1; // Return -1 if there aren't enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update largest and second largest accordingly
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // If second largest is still Integer.MIN_VALUE, it means no distinct second largest element was found
        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // Return -1 when there's no valid second largest element
        }

        return secondLargest;
    }
}