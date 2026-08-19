class Solution {
    public int lengthOfLastWord(String s) {
        // String arr[] = s.split(" ");
        // int num = arr.length-1;
        // return arr[num].length();
        int len=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                len++;
            }
            else
            {
                if(len>0) return len;
            }
        }
        return len;
    }
}