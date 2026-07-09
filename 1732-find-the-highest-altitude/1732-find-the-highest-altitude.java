class Solution {
    public int largestAltitude(int[] gain) 
    {
        int n = gain.length;

        int high=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=gain[i];
            high=Math.max(high,sum);
        }
        return high;
    }
}