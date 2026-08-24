class Solution {
    public int rob(int[] nums) 
    {
        int n = nums.length;
        if(n<2)
            return nums[0];
        int case1 = robrange(nums,0,n-1);
        int case2 = robrange(nums,1,n);


        return Math.max(case1,case2);
    }
    public int robrange(int[] nums,int ii ,int n) 
    {
        int prev1=0;
        int prev2=0;

        for(int i=ii;i<n;i++)
        {
            int cur=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=cur;
        }

        return prev1;
    }
}