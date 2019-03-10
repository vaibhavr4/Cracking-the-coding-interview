class Trie {

    /** Initialize your data structure here. */
    static final int ALPHABET_SIZE = 26;
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;
        public TrieNode()
        {
            isEndOfWord = false;
            for(int i=0;i<ALPHABET_SIZE;i++)
                children[i] = null;
        }
    }
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int level;
        int length = word.length();
        int index;
        TrieNode crawl = root;
        for(level = 0;level<length;level++)
        {
            index = word.charAt(level) - 'a';
            if(crawl.children[index] == null)
                crawl.children[index] = new TrieNode();
            crawl = crawl.children[index];
        }
        crawl.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int level;
        int length = word.length();
        int index;
        TrieNode crawl = root;
        for(level = 0;level<length;level++)
        {
            index = word.charAt(level) - 'a';
            if(crawl.children[index] == null)
                return false;
            crawl = crawl.children[index];
        }
        return(crawl!=null && crawl.isEndOfWord);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int level;
        int length = prefix.length();
        int index;
        TrieNode crawl = root;
        for(level = 0;level<length;level++)
        {
            index = prefix.charAt(level) - 'a';
            if(crawl.children[index] == null)
                return false;
            crawl = crawl.children[index];
        }
        return(crawl!=null);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
