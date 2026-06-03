import java.util.Scanner;

class Solution {

    public int secondLargestElement(int[] nums) {

        if (nums.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;   // No second largest element exists
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        Solution obj = new Solution();

        System.out.println("Second Largest Element = "
                           + obj.secondLargestElement(arr));

        in.close();
    }
}
