// class MedianFinder {
//     List<Integer> res;
//     public MedianFinder() {
//         res=new ArrayList<>();
//     }
    
//     public void addNum(int num) {
//         res.add(num);
//         Collections.sort(res);
//     }
    
//     public double findMedian() {
//         int n=res.size();
//         if(n%2!=0){
//             return res.get(n/2);
//         }else{
//             int mid=n/2;
//             return  (res.get(mid-1)+res.get(mid))/2.0;
//         }
       
//     }
// }
import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {

        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        left.offer(num);

        right.offer(left.poll());

        if (left.size() < right.size()) {
            left.offer(right.poll());
        }
    }

    public double findMedian() {

        if (left.size() > right.size()) {
            return left.peek();
        }

        return (left.peek() + right.peek()) / 2.0;
    }
}