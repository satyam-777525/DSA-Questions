class CombinationIterator {
    List<String> res=new ArrayList<>();
    int idx=0;
    public CombinationIterator(String characters, int combinationLength) {
        generate(characters,combinationLength,0,"");
    }
    public void generate(String s,int len,int l,String curr){
        if(curr.length()==len){
            res.add(curr);
            return;
        }
        for(int i=l;i<s.length();i++){
            generate(s,len,i+1,curr+s.charAt(i));
        }
    }
    public String next() {
        String x=res.get(idx);
        idx++;
        return x; 
        
    }
    
    public boolean hasNext() {
        return idx<res.size();
    }
}
