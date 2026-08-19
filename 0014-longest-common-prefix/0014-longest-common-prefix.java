class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        int len=0;
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int n = s1.length()<s2.length()?s1.length():s2.length();
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
                len++;
            else
                break;
        }
        return len>0?s1.substring(0, len):"";
    }
}