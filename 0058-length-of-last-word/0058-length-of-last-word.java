class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        int num = arr.length-1;
        return arr[num].length();
    }
}