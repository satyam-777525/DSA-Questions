class RandomizedSet {  
    HashSet<Integer> set;
    Random rand;
    public RandomizedSet() {
        set=new HashSet<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        set.add(val);
        return true;

    }
    
    public boolean remove(int val) {
        if(!set.contains(val)){
            return false;
        }
        set.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        if(set.size()==0) return 0;
        ArrayList<Integer> list=new ArrayList<>(set);
        int idx=rand.nextInt(list.size());
        return list.get(idx);
       
        
    }
}
