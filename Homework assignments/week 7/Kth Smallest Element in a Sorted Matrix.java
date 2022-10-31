class Solution {
    class Node{
        int val;
        int row;
        int col;
        
        Node(int val,int row,int col){
            this.val=val;
            this.row=row;
            this.col=col;
        }
    }
    
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        PriorityQueue<Node> q= new PriorityQueue<>(n,(a,b)->a.val-b.val);
        
        for(int i=0;i<n;i++){
            q.add(new Node(matrix[i][0],i,0));
        }
        
        for(int i=0;i<k-1;i++){
            Node temp=q.poll();
            
            if(temp.col<n-1){
                q.add(new Node(matrix[temp.row][temp.col+1],temp.row,temp.col+1));
            }
        }
        return q.poll().val;
    }
}