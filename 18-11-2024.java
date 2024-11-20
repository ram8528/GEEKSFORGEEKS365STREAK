class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        
        // To handle d > n case, reduce d to a smaller equivalent value
        d = d % n;
        
        // Step 1: Reverse the first part of the array (from 0 to d-1)
        reverse(arr, 0, d - 1);
        
        // Step 2: Reverse the second part of the array (from d to n-1)
        reverse(arr, d, n - 1);
        
        // Step 3: Reverse the entire array (from 0 to n-1)
        reverse(arr, 0, n - 1);
    }
    
    // Helper function to reverse the array between indices start and end
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            // Swap the elements at indices start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move towards the center
            start++;
            end--;
        }
  
    }
}