/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
import java.util.*;
public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> chStack=new Stack<>();
        for(char c:s.toCharArray())
        {
            switch(c)
            {
                case '(':
                case '{':
                case '[':
                chStack.push(c);
                break;
                case ')':
                if(chStack.isEmpty() || chStack.pop()!='(')
                {
                    return false;
                   
                }
                break;
                case '}':
                if(chStack.isEmpty() || chStack.pop()!='{')
                {
                    return false;
                    
                }
                break;
                case ']':
                if(chStack.isEmpty() || chStack.pop()!='[')
                {
                    return false;
                }
                break;
            }
        }
        return chStack.isEmpty();
        
    }
    public static void main(String[] args)
    {
        ValidParantheses vp=new ValidParantheses();
        System.out.println(vp.isValid("()[]{"));
    }
    
}
