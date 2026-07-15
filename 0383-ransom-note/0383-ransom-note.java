class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int n = ransomNote.length();
        int m = magazine.length();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<m;i++)
        {
            char ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n;i++)
        {
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0)
            {
                map.put(ch, map.get(ch) - 1);
            }
            else
            {
                return false;
            }
        }

        return true;
        
    }

    
}