class Solution {
    public int majorityElement(int[] nums) {

        int cnt = 0;
        int ele = 0;

        // Find the candidate
        for (int i = 0; i < nums.length; i++) {

            if (cnt == 0) {
                cnt = 1;
                ele = nums[i];
            }
            else if (nums[i] == ele) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        // Verify the candidate
        int cnt1 = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == ele) {
                cnt1++;
            }
        }

        if (cnt1 > nums.length / 2) {
            return ele;
        }

        return -1;
    }
}
