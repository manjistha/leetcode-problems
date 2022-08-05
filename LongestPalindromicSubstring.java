/*
 * Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */
import java.util.Scanner;

public class LongestPalindromicSubstring {
    static String findPalindrome(String x,int strtIndex,int end)
    {
       
        String nstr="";
        
        for(int i=end-1;i>=0;i--)
        {
            nstr+=x.charAt(i);
        }
        if(x.equals(nstr))
        return nstr;
        else 
        {
            strtIndex=0;
            end-=1;
            x=x.substring(strtIndex,end);
            return findPalindrome(x,strtIndex,end);
            

        }
        

    }
    static String longestString(String[] store)
    {
        int index = 0; 
        int elementLength = store[0].length();
        for(int i=1; i< store.length; i++) {
            if(store[i].length() > elementLength) {
                index = i; 
                elementLength = store[i].length();
            }
        }
        return store[index];
        

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String x=sc.nextLine();
        int l=x.length();
        int l1=l;
        String[] store=new String[l];
        
        
        for(int i=0;i<l;i++)
        {
            String y=x.substring(i,l);
            String res=findPalindrome(y,0,l1);
            store[i]=res;
            
            l1--;

        }
       System.out.println("The longest Palindromic Substring is: "+longestString(store));
        

    }
}

    

