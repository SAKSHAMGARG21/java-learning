//User function Template for Java

// class Solution 
// {
//     long solve(int arr[], int n)
//     {
//         // Complete this function
//         long c=0;
//         for (int i=0;i<n;i++){
//             for (int j=i;j<n;j++){
//                 if (arr[i]!=arr[j] && i<j){
//                     c++;
//                 }
//             }
//         }
//         return c;
//     }
// }



//User function Template for Java

class Solution 
{
    public static int binarysearch(int[]arr,int ele){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=ele){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr.length-start;
    }
    long solve(int arr[], int n)
    {
        //Complete this function
        Arrays.sort(arr);
        long total=(long)n*(long)(n-1)/2;
        long cnt=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                cnt++;
            }
            else
            {
                total=total-cnt*(cnt-1)/2;
                cnt=1;
            }
        }
        
        return total-((cnt*(cnt-1))/2);
        // long ans=0;
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     int cnt=binarysearch(arr,arr[i]);
        //     ans+=cnt;
         
        // }
        //  return ans;
        
        
    }
}

public class goodpairs {
    
}
