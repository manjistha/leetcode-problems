/*
 * 345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        
               char ch[]=s.toCharArray();
               int left=0;
               int right=ch.length-1;

               while(left<right)
               {
                    while(left<right && checkIfVowel(ch, left)==false)
                    {
                        left++;
                    }
                    while(left<right && checkIfVowel(ch,right)==false)
                    {
                        right--;
                    }
                    swap(ch,left,right);
                    left++;
                    right--;
               }

               String res="";
               for(char c:ch)
                res+=c;
            return res;
    }
    private boolean checkIfVowel(char[] arr,int indx)
    {
        char c=arr[indx];
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        else
            return false;
        
    }
    private void swap(char[] arr,int p1,int p2)
    {
        char temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
    }
    
    public static void main(String[] args)
    {
        ReverseVowels rv=new ReverseVowels();
        String result=rv.reverseVowels("leetcode");
        System.out.println(result);
    }
}
