class unionfind{
    int[]parent;
    int[] size;

    unionfind(int nodes){
        parent=new int[nodes];
        size=new int[nodes];
        for(int i=0;i<nodes;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    int findParentNode(int node){
        if(node==parent[node]){
            return node;
        }
        parent[node]=findParentNode(parent[node]);//path compresion
        return parent[node];

    }
    void unionBySize(int node1,int node2){
        //find the root parent
        int rootP1=findParentNode(node1);
        int rootp2=findParentNode(node2);
        if(rootP1==rootp2){
            return;
        }
        // union of componenets
        if(size[rootP1]<size[rootp2]){
            parent[rootP1]=rootp2;
            size[rootp2]+=size[rootP1];
        } else if (size[rootP1]>size[rootp2]) {
            parent[rootp2]=rootP1;
            size[rootP1]+=size[rootp2];
        }
        else{// rank is same
            parent[rootp2]=rootP1;
            size[rootP1]+=size[rootp2];
        }
    }
    public int getsize(int x){
        return (findParentNode(x)==x)?size[x]:-1;
    }

    
}
class Solution {
    public long countPairs(int n, int[][] edges) {
        unionfind uf=new unionfind(n);
        for(int [] edge:edges){
            uf.unionBySize(edge[0],edge[1]);
        }
        long sum=0;
        long result=0;

        for(int i=0;i<n;i++){
            int unionsize=uf.getsize(i);
            if(unionsize==-1) continue;
            result+=unionsize*sum;
            sum+=unionsize;
        }
        return result;
    }
}