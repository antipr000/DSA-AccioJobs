public class StringSearching {

    public static void main(String[] args) {
        String txt = "abcabbcabcdababcabcb";
        String pattern = "abcd";

        for(int i=0; i<txt.length()-pattern.length(); i++){
            boolean isMatch = true;
            for(int j=0; j<pattern.length(); j++){
                if(txt.charAt(i+j) == pattern.charAt(j)){
                    continue;
                } else {
                    isMatch = false;
                    break;
                }
            }

            if(isMatch){
                System.out.println("Matched at " + i);
                break;
            }
        }
    }
}

class KmpAlgorithm{

    private int[] lps(String s){
        //Calculates the lps for a given string s
        int n = s.length();
        int []lps = new int[n];

        int len = 0; //Running lps value
        lps[0] = 0;
        /*
        * aabaa
        * len = 1
        * */
        int idx = 1;

        while(idx < n){
            if(s.charAt(idx) == s.charAt(len)){
                len ++;
                lps[idx] = len;
                idx ++;
            } else{
                if(len != 0){
                    len = lps[len - 1];
                } else{
                    lps[idx] = 0;
                    idx++;
                }
            }
        }
        return lps;
    }

    //aaaa aaa

    public void kmp(String text, String pattern){
        int []lps = lps(pattern);

        int n = text.length();
        int m = pattern.length();

        int i = 0, j = 0;

        while (i < n){
            if(text.charAt(i) == pattern.charAt(j)){
                j++;
                i++;
            }

            if(j == m){
                System.out.println("Found pattern at index: " + (i-j));
                j = lps[j-1];
            }
            else if(i<n && pattern.charAt(j) != text.charAt(i)){
                if(j != 0) j = lps[j-1];
            } else{
                i++;
            }
        }
    }

}


