class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int i = 0;
        int two = nums.length - 1;

        while (i <= two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                i++;
                zero++;
            } else if (nums[i] == 2) {
                swap(nums, i, two);
                two--;
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
