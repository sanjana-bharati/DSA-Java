class Solution {
    public int largestElement(int[] nums) {
       int max = nums[0];
       for(int i=0 ; i < nums.length ; i++)
       {
        if(nums[i] > max)
        max = nums[i];
       }
       return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int[] arr = new int[5];
         for(int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
         Solution obj = new Solution();

        System.out.println("Largest Element = " + obj.largestElement(arr));

    }
}
