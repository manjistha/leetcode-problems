/*
 * You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] arr=new int[m*n];
        int ctr=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    arr[ctr++]=matrix[i][j];
            }
        int ans=binarySearch(arr,0,arr.length-1,target);
        if(ans!=-1)
            return true;
        else
            return false;
    }
    private int binarySearch(int[] arr,int l,int r,int x)
    {if (r >= l) {
        int mid = l + (r - l) / 2;
 
        // If the element is present at the middle
        // itself
        if (arr[mid] == x)
            return mid;
 
        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
 
        // Else the element can only be present
        // in right subarray
        return binarySearch(arr, mid + 1, r, x);
    }
 
    
    return -1;


    }
    public static void main(String[] args)
    {
        Search2DMatrix ob=new Search2DMatrix();
        int[][] nums={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        boolean ans=ob.searchMatrix(nums,target);
        System.out.println(ans);
    }
}
