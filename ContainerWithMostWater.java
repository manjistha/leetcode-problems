/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */
import java.util.*;
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int ptr1=0;
        int ptr2=height.length-1;
        int max=0;
        
        while(ptr1 < ptr2){
            int w = ptr2-ptr1;
            int h = Math.min(height[ptr1], height[ptr2]);
            int currArea = h * w;
            max = Math.max(max, currArea);
            if(height[ptr1] < height[ptr2]) ptr1++;
            else if(height[ptr1] > height[ptr2]) ptr2--;
            else {
                ptr1++;
                ptr2--;
            }
        }
        return max;
        
        
    }

    public static void main(String args[])
    {
        int ht[]={1,1};
        ContainerWithMostWater cw=new ContainerWithMostWater();
        int result=cw.maxArea(ht);
        System.out.println(result);
    }
    
}
