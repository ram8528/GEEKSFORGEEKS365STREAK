class Solution {
  public:
    int getMinDiff(vector<int> &arr, int k) {
        int n = arr.size();

        // If there's only one tower, the difference will be 0
        if (n == 1) return 0;

        // Sort the array to easily find the min and max values
        sort(arr.begin(), arr.end());

        // Initialize the answer with the initial difference
        int ans = arr[n - 1] - arr[0];

        // Initialize the smallest and largest heights
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        // Variables to track the possible smallest and largest values in the modified array
        int mi, ma;

        // Iterate through the array and check the minimum difference possible
        for (int i = 0; i < n - 1; i++) {
            // Calculate the new smallest and largest values after modifying the heights
            mi = min(smallest, arr[i + 1] - k);
            ma = max(largest, arr[i] + k);

            // If the minimum value is negative, skip this iteration
            if (mi < 0) continue;

            // Update the answer with the minimum difference
            ans = min(ans, ma - mi);
        }

        return ans;
    }
};