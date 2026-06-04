class Solution {

    public int position(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }

    public boolean sorted(int[] nums, int pos) {

        int[] B = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            B[i] = nums[(i + pos) % nums.length];
        }

        for(int i = 0; i < B.length - 1; i++) {
            if(B[i] > B[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean check(int[] nums) {
        int pos = position(nums);
        return sorted(nums, pos);
    }
}
