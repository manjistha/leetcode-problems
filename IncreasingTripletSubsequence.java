/*
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 


 */
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int size=nums.length;
        int leftMin[]=new int[size];
        int rightMax[]=new int[size];
        leftMin[0]=nums[0];
        rightMax[size-1]=nums[size-1];
        //left min array
        for(int i=1;i<size;i++)
        {
            leftMin[i]=Math.min(nums[i],leftMin[i-1]);
        }
        for(int i=size-2;i>=0;i--)
        {
            rightMax[i]=Math.max(nums[i],rightMax[i+1]);
        }
        for(int i=0;i<size;i++)
        {
            if(nums[i]>leftMin[i] && nums[i]<rightMax[i])
            return true;
        }
        return false;

               
    }
    public static void main(String[] args)
    {
        int arr[]={20,100,10,12,5,13};
        boolean ans=increasingTriplet(arr);
        System.out.println(ans);

    }
    
}
