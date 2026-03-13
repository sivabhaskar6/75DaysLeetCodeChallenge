class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> unique= new HashSet<>();
        for(int value:nums)
        {
            if(!unique.add(value))
            {
                return true;
            }
        }
        return false;
    }
}