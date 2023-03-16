/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
import java.util.*;
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String x="",revWord="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isLetterOrDigit((ch)))
            x+=ch;
        }
        if(x.length()==1)
        {
            return true;
        }
        //reverse word
        else{
            for(int i=x.length()-1;i>=0;i--)
        {
            revWord+=x.charAt(i);
        }
        if(x.equalsIgnoreCase(revWord))
        return true;
        else
        return false;

        }
        
        
        
    }
    public static void main(String[] args)
    {
        String s= "0P";
        ValidPalindrome vp=new ValidPalindrome();
        boolean ans=vp.isPalindrome(s);
        System.out.println(ans);
    }
    
}
