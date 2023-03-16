/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */
import java.util.*;
public class ThreeSum {
    List<List<Integer>> result=new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || nums[i-1]!=nums[i])
            {
                //keeping the first index intact and finding out the other two numbers
            twoSumsSorted(i+1,nums.length-1,nums,0-nums[i]);

            }
        }
        return result;
        
    }
    void twoSumsSorted(int i,int j,int[] nums,int target)
    {
        int num1=nums[i-1];
        while(i<j)
        {
            if(nums[i]+nums[j]>target)
            j--;
            else if(nums[i]+nums[j]<target)
            i++;
            else
            {
                List<Integer> list=new ArrayList();
                list.add(num1);list.add(nums[i]);list.add(nums[j]);
                result.add(list);//adding the list to the resultant list
                
                //duplicate b
                while(i<j && nums[i]==nums[i+1])
                i++;
                //duplicate c
                while(i<j && nums[j]==nums[j-1])
                j--;
    
                //compressing the search space because there can be more than one result
                i++;
                j--;

            }
           
        }
    }
    public static void main(String[] args)
    {
       
        int[] input={0,1,1};
        List<List<Integer>> ans=new ArrayList();
        ThreeSum obS=new ThreeSum();
        ans=obS.threeSum(input);
        System.out.println(ans);
    }
    
}

