/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1,l2,x1=0,x2=0;
        String longer,shorter,mergedStr="";
        l1=word1.length();
        l2=word2.length();
        if(l1<l2)
        {
            shorter=word1;
            longer=word2;

        }
            
        else 
        {
            shorter=word2;
            longer=word1;

        }
            

        
        for(int i=0;i<(shorter.length()*2);i++)
        {
            if(i%2==0)
            {
                mergedStr+=word1.charAt(i-x2);
                x1++;

            }

               
            else
            {
                mergedStr+=word2.charAt(i-x1);
                x2++;

            }
            


        }
        mergedStr+=longer.substring(shorter.length());
        return mergedStr;
    }
    public static void main(String[] args)
    {
        Solution ob=new Solution();
        String x=ob.mergeAlternately("abcdef","pqrstuvx");
        System.out.println(x);
    }
}