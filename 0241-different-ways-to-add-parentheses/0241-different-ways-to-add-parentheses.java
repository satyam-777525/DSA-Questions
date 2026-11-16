class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        int n=expression.length();
        return helper(expression,0,n-1);
        
    }
    public List<Integer> helper(String exp,int st,int end){
        List<Integer> res=new ArrayList<>();
        if(st==end){
            int n=exp.charAt(st)-'0';
            res.add(n);
            return res;
        }
        if(end-st==1&&Character.isDigit(exp.charAt(st))){
            int n=Integer.parseInt(exp.substring(st,end+1));
            res.add(n);
            return res;
        }
        for(int i=st;i<=end;i++){
            if(Character.isDigit(exp.charAt(i))){
                continue;
            }
            char op=exp.charAt(i);
            List<Integer> left=helper(exp,st,i-1);
            List<Integer> right=helper(exp,i+1,end);
            for(int l:left){
                for(int r:right){
                    if(op=='*'){
                        res.add(l*r);
                    }else if(op=='+'){
                        res.add(l+r);
                    }else{
                        res.add(l-r);
                    }
                }
            }

        }
        return res;
    }
}