/*import java.util.*;
class Day13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dev=2;
        while(num>1){
            while(num%dev==0){
                num=num/dev;
                System.out.print(dev+" ");
            }
            dev++;
        }
    }
}*/
//brute force approach
/*class Day13{
    public static void main(String args[]){
        int a[]={56,29,73,27,11,13,17,12};
        int k=3;
        for(int i=0;i<a.length-k+1;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=a[i+j];
            }
            System.out.print(sum+" ");
        }
    }
}*/
//sliding window approach
/*class Day13{
    public static void main(String args[]){
        int a[]={56,29,73,27,11,13,17,12};
        int k=3;
        int sum=0;
        int left=0;
        for(int right=0;right<a.length;right++){
            sum+=a[right];
            if(right>=k-1){
                System.out.print(sum+" ");
                sum-=a[left];
                left++;
            }
            
        }
    }
}*/
//brute force approach  for maximum element in a subarray of size k
/*class Day13{
    public static void main(String args[]){
        int a[]={11,29,73,27,56,13,17,12};
        int k=3;
        for(int i=0;i<a.length-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<k;j++){
                //max=Math.max(max,a[i+j]);
                if(a[i+j]>max){
                    max=a[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
}*/
//optimal approach for maximum element in a subarray of size k
/*import java.util.Deque;
import java.util.LinkedList;
class Day13{
    public static void main(String args[]){
        int a[]={11,29,73,27,19,43,17,39            };
        int k=3;
        Deque<Integer> dq = new LinkedList<>();
        for(int right=0;right<a.length;right++){
            while(!dq.isEmpty() && dq.peekFirst()<=right-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && a[right]>=a[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(right);
            if(right>=k-1){
                System.out.print(a[dq.peekFirst()]+" ");
            }
        }
    }
}*/
//Tree insertion and traversal in level order
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left= this.right=null;
    }
}
class Tree{
    Node root;
    public Tree(){
        this.root=null;
    }
    public void insert(int data){
        if(this.root==null){
            this.root=new Node(data);
            return;
        }else{
            Queue<Node> q = new LinkedList<>();
            q.offer(this.root);
            while(!q.isEmpty()){
                Node temp=q.poll();
                if(temp.left==null){
                    temp.left=new Node(data);
                    return;
                }else{
                    q.offer(temp.left);
                }
                if(temp.right==null){
                    temp.right=new Node(data);
                    return;
                }else{
                    q.offer(temp.right);
                }
            }
        }
    }
    public void levelOrderTraversal(){
        if(this.root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(this.root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }   
}
class Day13{
    public static void main(String args[]){
        Tree t = new Tree();
        t.insert(10);
        t.insert(20);
        t.insert(30);   
        t.insert(40);
        t.insert(50);   
        t.insert(60);
        t.levelOrderTraversal();
    }
}
