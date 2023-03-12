import java.util.Map;

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1] */
import java.util.*;
class KFrequentElements
{
    public static int[] topKFrequent(int[] nums, int k)
    {
        if(nums.length==k)
        return nums;

        Map<Integer,Integer> map=new HashMap<>();

        //storing frequency of each element
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            pq.add(new int[]{e.getKey(),e.getValue()});
            while(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int a[]={1,2,2,1,1,3};
        int k=2;
        int res[]=topKFrequent(a, k);
        for(int i=0;i<k;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}