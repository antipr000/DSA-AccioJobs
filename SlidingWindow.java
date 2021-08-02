import Hashing.StringHashing;

class ContainsDuplicate{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        const int N = 1e5+5;
        //0<=Ai<=N
        int []freq = new int[N];

        k+=1;
        //First window
        for(int i=0;i<k; i++){
            freq[nums[i]] += 1;
            if(freq[nums[i]] == 2){
                //Duplicate found in first window
                
                return true;
            }
        }
      /*
        [1, 2, 3, 1, 3, 2]
        K = 3
        i=3, K= 3 i-k = 0
        i = 4-3 = 1
      */
        //Sliding window
        for(int i=k; i<nums.length; i++){
            freq[nums[i-k]] --;
            freq[nums[i]] ++;
            if(freq[nums[i]] == 2)
                return true;
        }
        
        return false;
    }
}

class DNASequence{
    public boolean findRepeatedDnaSequences(String s) {
        StringHashing hash = new StringHashing();
        hash.precompute(s);
        const int N = 1e6+6;
        int k = 10;
        int []freq = new int [N];
        for(int i=k-1;i<s.length;i++){
            int hashval = hash.getSubstringHash(i-k+1, i);
            freq[hashval] += 1;
            if(freq[hashval] == 2){
                return true;
            }
        } 

        return false;
    }
}