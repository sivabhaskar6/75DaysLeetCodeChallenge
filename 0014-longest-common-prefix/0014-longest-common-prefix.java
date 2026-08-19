class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        int len=0;
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int n = Math.min(s1.length(), s2.length());
        int i=0;
        while (i < n && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return s1.substring(0, i);
    }
}