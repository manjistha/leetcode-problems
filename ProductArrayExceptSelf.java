/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 * 
 */
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int glideProd=1;

        //leftPass and storing the product
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=glideProd;
            glideProd*=nums[i];
        }

        //updating glideProd again and performing similar operation from right
        glideProd=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=glideProd;
            glideProd*=nums[i];
        }
        return ans;


        
    }
    public static void main(String[] args)
    {
        int[] nums={-1,1,0,-3,3};
        int[] res=new int[nums.length];
        ProductArrayExceptSelf p=new ProductArrayExceptSelf();
        res=p.productExceptSelf(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
    
}
