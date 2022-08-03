/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106 */
import java.util.Scanner;
class MedianMerge
{
    public static void main(String[] args)
    {
        int l,i,j,k;
        i=0;
        j=0;
        k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int l1=sc.nextInt();
        int nums1[]=new int[l1];
        System.out.println("Enter the elements of the first array:");
        for(int m=0;m<l1;m++)
        {
            nums1[m]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int l2=sc.nextInt();
        int nums2[]=new int[l2];
        System.out.println("Enter the elements of the second array:");
        for(int m=0;m<l2;m++)
        {
            nums2[m]=sc.nextInt();
        }
        l=l1+l2;

        int res[]=new int[l];
        
       
        while(i<l1 && j<l2)
        {
            if(nums1[i]<nums2[j])
            {
                res[k++]=nums1[i];
                i++;

            }
            else
            {
                res[k++]=nums2[j];
                j++;
            }
           
           

        }
        //copying remaining elements of nums1[] and nums2[]
        while(i<l1)
        {
            res[k++]=nums1[i++];
        }
        while(j<l2)
        {
            res[k++]=nums2[j++];
        }
        
        System.out.println("The merged array is:");
        for(int m=0;m<l;m++)
        {
            System.out.print(res[m]+" ");
        }
        System.out.println("Output:");

        if(l%2 !=0)
        System.out.println((double)res[(int)(Math.floor(l/2))]);
        else
        System.out.println(((double)(res[l/2-1]+res[l/2]))/2.0);

        

    }
}
