class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans=new ArrayList<>();
        int n=searchWord.length();
        Arrays.sort(products);
        String s="";
        for(int i=0;i<n;i++){
            s=s+searchWord.charAt(i);
            helper(products,s,ans);
        }
        return ans;
    }
    public static void helper(String[]products,String s,List<List<String>>ans){
        List<String> res=new ArrayList<>();
        int n=products.length;
        for(int i=0;i<n;i++){
            if(res.size()==3){
                break;
            }
            if(products[i].startsWith(s)){
                res.add(products[i]);
            }
        }
        ans.add(res);

    } 
}

// ["mobile","moneypot","monitor","mouse","mousepad"]
// m - ["mobile","moneypot","monitor"]
// mo- ["mobile","moneypot","monitor"]
// mou- ["mouse","mousepad"]
// mous-["mouse","mousepad"]
// mouse-["mouse","mousepad"]
