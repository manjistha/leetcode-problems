/*
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
 */
public class GCDOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int l1=str1.length();
        int l2=str2.length();
        int hcf=findGcd(l1, l2);
        String str="";
        //System.out.println(hcf);
        if((str1+str2).equals(str2+str1))
        {
            str=str1.substring(0, hcf);
        }
        return str;
    }
    private int findGcd(int x,int y)
    {
        int rem=1,divisor,dividend;
        if(x>y)
        {
            divisor=y;
            dividend=x;
        }
        else
        {
            divisor=x;
            dividend=y;

        }
        while(divisor!=0)
        {
            rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;

        }
        return dividend;
    }
    public static void main(String[] args)
    {
        GCDOfStrings ob=new GCDOfStrings();
        String str1="ABABAB";
        String str2="AB";
        String x=ob.gcdOfStrings(str1, str2);
        System.out.println(x);
    }
}

