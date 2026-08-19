class Solution {
    public int maxNumberOfFamilies(int n, int[][] reserved) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] r:reserved) {
            if(!map.containsKey(r[0])){
                map.put(r[0],new HashSet<>());
            }
            map.get(r[0]).add(r[1]);
        }
        int ans =(n-map.size())*2;
        for (Set<Integer> seats: map.values()) {
            boolean left =true;
            boolean middle =true;
            boolean right =true;
            for (int seat =2;seat<=5;seat++){
                if (seats.contains(seat)) {
                    left =false;
                    break;
                }
            }
            for (int seat=4;seat<=7;seat++){
                if (seats.contains(seat)) {
                    middle =false;
                    break;
                }
            }
            for (int seat=6;seat<=9;seat++){
                if (seats.contains(seat)) {
                    right =false;
                    break;
                }
            }

            if (left&&right) {
                ans+=2;
            } else if(left || middle || right) {
                ans+=1;
            }
        }

        return ans;
    }
}