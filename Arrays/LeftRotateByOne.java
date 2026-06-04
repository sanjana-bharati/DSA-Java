class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];int i;
        for( i = 1 ; i < nums.length ; i++)
            {
             nums[i-1] = nums[i];
             }
        nums[i-1] = temp;
    }
}
