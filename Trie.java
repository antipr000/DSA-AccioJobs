import java.util.ArrayList;
import java.util.Arrays;

public class Trie {
}

class TrieNode{
    int cnt;
    TrieNode[]child;
    boolean isBlocked;

    TrieNode(){
        cnt = 0;
        child = new TrieNode[26];
        isBlocked = true;
        for(int i = 0; i<26; i++) child[i] = null;
    }

    void visit(){
        cnt += 1;
    }
    void invalidate(){
        isBlocked = false;
    }
}

class TrieMethods{
    TrieNode root;
    ArrayList<String> filters;
    boolean isPossible;

    TrieMethods(){
        filters = new ArrayList<>();
        isPossible = true;
    }

    void insertBlocked(String s){
        TrieNode curr = root;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = c-'a';
            if(curr.child[index] == null){
                curr.child[index] = new TrieNode();
            }

            curr = curr.child[index];
            curr.visit();
        }
    }

    void insertUnblocked(String s){
        TrieNode curr = root;
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (curr.child[index] == null) return;
            curr = curr.child[index];
            curr.invalidate();
        }
    }


    int findNumberOfStringsWithGivenPrefix(String prefix){
        TrieNode curr = root;
        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            int index = c - 'a';
            if(curr.child[index] == null){
                return 0;
            }
            curr = curr.child[index];
        }

        return curr.cnt;
    }
}