/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */
import java.util.*;
public class TrappingRainWater {
    public int trap(int[] height) {
        int capture,totalRainCaptured=0;
        int[] right=new int[height.length];
        int[] left=new int[height.length];
        int maxLeft=height[0];
        left[0]=maxLeft;
        int maxRight=height[height.length-1];
        right[height.length-1]=maxRight;
        for(int i=1;i<=height.length-1;i++)
        {
            if(height[i]>maxLeft)
            {
                maxLeft=height[i];
                

            }
            if(height[height.length-1-i]>maxRight)
            {
                maxRight=height[height.length-1-i];
            }
            left[i]=maxLeft;
            right[height.length-1-i]=maxRight;
            
        }
        for(int i=0;i<height.length;i++)
        {
            capture=Math.min(right[i],left[i]);
            totalRainCaptured+=capture-height[i];
        }
        return totalRainCaptured;
        
        
    }
    public static void main(String[] args)
    {
        TrappingRainWater trw=new TrappingRainWater();
        int[] height={4,2,0,3,2,5};
        int res=trw.trap(height);
        System.out.println(res);
    }
    
}
