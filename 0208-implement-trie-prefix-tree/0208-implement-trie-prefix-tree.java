class Trie {
    HashSet<String> set;
    public Trie() {
        set=new HashSet<>();
        
    }
    
    public void insert(String word) {
        set.add(word);
        
    }
    
    public boolean search(String word) {
        if(set.contains(word)){
            return true;
        }
        return false;
        
    }
    
    public boolean startsWith(String prefix) {
        if(set.contains(prefix)) return true;
        for(String s:set){
            if(s.startsWith(prefix)){
                return true;
            }
        }
        return false;
        
    }
}
