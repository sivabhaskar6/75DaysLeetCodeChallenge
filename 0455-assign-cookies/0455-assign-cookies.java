

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0; // Pointer for children (g)
        int j = 0; // Pointer for cookies (s)
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // Cookie satisfies child, move to next child
            }
            j++; // Move to next cookie regardless
        }
        
        return i; // Total satisfied children
    }
}