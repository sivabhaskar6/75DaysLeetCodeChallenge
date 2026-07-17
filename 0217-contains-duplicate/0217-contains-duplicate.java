class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        int n = nums.length;
        if (n < 2) 
            return false;

        Set<Integer> unique = new HashSet<>();
        for(int num:nums)
            if(!unique.add(num))
                return true;
        
        return false;
    }
}