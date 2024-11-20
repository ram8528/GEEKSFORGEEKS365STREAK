class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        
        // Step 1: Find the largest index i such that arr[i] < arr[i + 1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // Step 2: If such an index i is found
        if (i >= 0) {
            // Find the largest index j such that arr[j] > arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            
            // Step 3: Swap arr[i] and arr[j]
            swap(arr, i, j);
        }
        
        // Step 4: Reverse the subarray from i + 1 to end
        reverse(arr, i + 1, n - 1);
    }

    // Helper method to swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse the subarray from index 'start' to 'end'
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}