/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 */
import java.util.*;
public class GenerateParantheses {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        findUsingBacktrack("(",1,0,result,n);
        return result;
        
    }
    void findUsingBacktrack(String current,int open,int close,List<String> result,int n)
    {
        //save the string only when the length is n*2
        if(current.length()==2*n)
        {
            result.add(current);
            return;
        }
        if(open<n)
        findUsingBacktrack(current+"(", open+1, close,result,n);
        if(close<open)
        findUsingBacktrack(current+")", open, close+1,result,n);

    }
    public static void main(String[] args)
    {
        GenerateParantheses gp=new GenerateParantheses();
        List<String> ans=new ArrayList<>();
        ans=gp.generateParenthesis(3);
        for(String i:ans)
        System.out.println(i);
    }


    
}
