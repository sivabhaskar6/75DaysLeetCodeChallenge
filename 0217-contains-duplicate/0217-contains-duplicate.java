class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        int n = nums.length;
        if (n < 2) 
            return false;

        Set<Integer> unique = new HashSet<>();
        for(int i=0;i<n;i++)
            if(!unique.add(nums[i]))
                return true;
        
        return false;
    }
}