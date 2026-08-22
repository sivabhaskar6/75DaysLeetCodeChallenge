class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] arr = new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    int num=greaterElement(j+1,nums2[j],nums2);
                    arr[k++]=num;
                    
                }
            }
        }
        return arr;
    }
    
    private int greaterElement(int start,int key,int[] arr)
    {
        for(int i=start;i<arr.length;i++)
        {
            if(arr[i]>key)
            {
                return arr[i];
            }
        }
        return -1;
    }
}