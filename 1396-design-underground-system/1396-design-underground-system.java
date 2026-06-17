class UndergroundSystem {
    HashMap<Integer,String> map1;
    HashMap<Integer,Integer> time;
    HashMap<String,Integer> map2;
    HashMap<String,Integer> count;
    public UndergroundSystem() {
        map1=new HashMap<>();
        time=new HashMap<>();
        map2=new HashMap<>();
        count=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map1.put(id,stationName);
        time.put(id,t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        String s=map1.get(id);
        int t1=time.get(id);
        String key=s+"->"+stationName;
        int val=t-t1;
        map2.put(key,map2.getOrDefault(key,0)+val);
        count.put(key,count.getOrDefault(key,0)+1);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+"->"+endStation;
        return (double)map2.get(key)/count.get(key);
    }
}

