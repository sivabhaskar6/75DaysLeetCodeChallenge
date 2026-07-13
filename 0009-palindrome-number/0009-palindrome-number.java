class Solution {
    public boolean isPalindrome(int x) 
    {
        int rev=0, rem=0,d=x;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==d)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}