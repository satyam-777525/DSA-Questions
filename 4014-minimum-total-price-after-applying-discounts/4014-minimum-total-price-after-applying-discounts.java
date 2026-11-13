class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        PriorityQueue<Integer> discount=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> price=new PriorityQueue<>(Collections.reverseOrder());

        int n=prices.length;
        int m=discounts.length;
        double ans=0;
        for(int x:prices){
            price.add(x);
        }
        for(int x:discounts){
            discount.add(x);
        }
        while(!price.isEmpty()){
            int x=price.poll();
            int y=0;
            if(!discount.isEmpty()){
                y=discount.poll();
            }
            double curr=(x*(100.0-y))/100.0;
            ans+=curr;
        }
        return ans;
    }
}