/*
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */
import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        //creating a hashset of all the numbers in the array
        
        HashSet<Integer> hashset=new HashSet<Integer>();
        //adding the numbers one by one in the hashset
        for(int n:nums)
        {
            hashset.add(n);
        }
        int res=0;//initialzing longest length with 0
        for(int n:nums)
        {
            //if the set doesnt contain n-1, then check possibility for (n+1) as n might be the smallest
            if(!hashset.contains(n-1))

            {
                int trapLen=1;
                int trapNum=n;

                while(hashset.contains(trapNum+1))
                {
                    //keep trapping the longest steak until the consecutive pattern breaks

                    trapNum++;
                    trapLen++;
                }
                //update the result with the longest trapped length
            res=Math.max(res,trapLen);

            }
            
            
        }
        return res;
    }
    public static void main(String[] args)
    {
        LongestConsecutiveSequence lcs=new LongestConsecutiveSequence();
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        int longestSteak=lcs.longestConsecutive(arr);
        System.out.println("The longest steak is:"+longestSteak);
    }
    
}
