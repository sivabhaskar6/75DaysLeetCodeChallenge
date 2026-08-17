class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int minl=Integer.MAX_VALUE,j=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                minl=Math.min(minl,(i-j)+1);
                sum-=nums[j++];
            }

        }
        return minl==Integer.MAX_VALUE?0:minl;
    }
}