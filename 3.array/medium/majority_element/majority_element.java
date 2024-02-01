// below code will run only till the input >= 10^6 
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int maxVal = Integer.MIN_VALUE;
//         int minVal = Integer.MAX_VALUE;

//         for (int num : nums) {
//             maxVal = Math.max(maxVal, num);
//             minVal = Math.min(minVal, num);
//         }

//         int range = maxVal - minVal + 1;
//         int[] hash = new int[range];
//         Arrays.fill(hash, 0);

//         for (int num : nums) {
//             hash[num - minVal]++;
//         }

//         for (int i = 0; i < range; i++) {
//             if (hash[i] > n / 2) {
//                 return i + minVal;
//             }
//         }

//         return nums[0];
//     }
// }

class Solution {
    public int majorityElement(int[] v) {
        int n = v.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return v[i];
        }

        return -1;
    }
}