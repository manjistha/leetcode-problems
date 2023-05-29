/*
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that 
 * answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no
 *  future day for which this is possible, keep answer[i] == 0 instead.
 * Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]

 */
import java.util.*;


public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        
        int l=temperatures.length;
        //int top=0;

        int[] ans=new int[l];
        for (int i = 0; i < l; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                ans[st.peek()] = i - st.pop();
            }

            st.push(i);
        }
       
            
            
          
        return ans;
        
    }
    public static void main(String[] args)
    {
        DailyTemperatures dp=new DailyTemperatures();
        int temperatures[]={73,74,75,71,69,72,76,73};
        int[] result=new int[temperatures.length];
        result=dp.dailyTemperatures(temperatures);
        for(int i:result)
        System.out.print(i+" ");
    }

    
}
