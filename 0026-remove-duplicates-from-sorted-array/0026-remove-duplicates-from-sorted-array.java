class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int in=0,n=nums.length;

        for(int j=1;j<n;j++)
        {
            if(nums[in]!=nums[j])
            {
                in++;
                nums[in]=nums[j];
            }
        }
        return ++in;
    }
}
