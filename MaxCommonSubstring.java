class Solution {
    
    
    public int lengthOfLongestSubstring(String s) {
        int []freq = new int[256];
        if(s.length() == 0) return 0;
        int ptr1 = 0, ptr2 = 0;
        freq[s.charAt(ptr1)]++;
        int ans = 1;
        
        boolean isDuplicate = false;
        
        while(ptr2<s.length()){
            if(isDuplicate){
                freq[s.charAt(ptr1)] --;
                ptr1++;
                if(freq[s.charAt(ptr1-1)] == 1){
                    ans = Math.max(ans, ptr2 - ptr1 + 1); //[l, r]
                    isDuplicate = false;
                }
                
            } else{
                ptr2++;
                if(ptr2 == s.length()) break;
                freq[s.charAt(ptr2)]++;
                if(freq[s.charAt(ptr2)] == 2){
                    isDuplicate = true;
                } else{
                    ans = Math.max(ans, ptr2 - ptr1 + 1);
                }
            }
        }
        
        return ans;
    }
}

/*
Solution set is size of substrings

P(x) => Whether there is a substring of length x that has all unique characters

P(x) is True P(y) is True for y<x

TTTTTTFFFFFFFF
*/