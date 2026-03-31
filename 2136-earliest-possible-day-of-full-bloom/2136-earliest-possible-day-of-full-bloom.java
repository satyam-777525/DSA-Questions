class Pair{
    int plant;
    int grow;
    Pair(int plant,int grow){
        this.plant=plant;
        this.grow=grow;
    }
}
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;
        Pair flower[]=new Pair[n];
        for(int i=0;i<n;i++){
            flower[i]=new Pair(plantTime[i],growTime[i]);
        }
        Arrays.sort(flower,(a,b)->b.grow-a.grow);
        int plant=0;
        int total=0;
        for(Pair p:flower){
           total=Math.max(total,plant+p.plant+p.grow);
           plant+=p.plant;
        }
        return total;
        
    }
}