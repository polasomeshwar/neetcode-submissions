class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int maxLength = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                maxLength = Math.max(maxLength,j-i+1);
                set.add(s.charAt(j));
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
