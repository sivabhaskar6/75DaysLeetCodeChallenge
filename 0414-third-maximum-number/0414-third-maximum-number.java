class Solution {
    public int thirdMax(int[] nums) 
    {
        Long f = Long.MIN_VALUE;
        Long s = Long.MIN_VALUE;
        Long t = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if ((nums[i] == f) ||
                ( nums[i] == s) ||
                (nums[i] == t))
                continue;

            if(nums[i]>f)
            {
                t=s;
                s=f;
                f=(long)nums[i];
            }
            else if(nums[i]>s)
            {
                t=s;
                s=(long)nums[i];
            }
            else if(nums[i]>t)
            {
                t=(long)nums[i];
            }
        }
        return t != Long.MIN_VALUE ? t.intValue() : f.intValue();
    }
}