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
    Node left, right;
    
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class Tree{
    Node root;
    
    public Tree(){
        this.root = null;
    }
    
    public void Insert(int data){
        if(this.root==null){
            this.root = new Node(data);
            return ;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        while(!Q.isEmpty()){
            Node current = Q.poll();
            //left
            if(current.left != null){
                Q.offer(current.left);
            }else{
                current.left = new Node(data);
                return ;
            }
            //right
            if(current.right != null){
                Q.offer(current.right);
            }else{
                current.right = new Node(data);
                return ;
            }
        }
   }
   
    public void Level_order(){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            Node current = Q.poll();
            System.out.print(current.data+ " ");
            if(current.left != null) Q.offer(current.left);
            if(current.right != null) Q.offer(current.right);
        }
    }
    
    public void in_order(){
        in_order_helper(this.root);
    }
    private void in_order_helper(Node node){
        if(node != null){
            in_order_helper(node.left);
            System.out.print(node.data+ " ");
            in_order_helper(node.right);
        }
    }
    
    public void pre_order(){
        pre_order_helper(this.root);
    }
    
    private void pre_order_helper(Node node){
        if(node == null) return ;
        System.out.print(node.data+" ");
        pre_order_helper(node.left);
        pre_order_helper(node.right);
    }
    
    public void pre_order_using_stack(){
        Stack<Node> st = new Stack<>();
        st.push(this.root);
        while(!st.isEmpty()){
            Node current = st.pop();
            if(current != null) {
                System.out.print(current.data+" ");
                st.push(current.right);
                st.push(current.left);
            }
        }
    }
    
    public void post_order(){
        post_order_helper(this.root);
    }
    
    private void post_order_helper(Node node){
        if(node == null) return ;
        post_order_helper(node.left);
        post_order_helper(node.right);
        System.out.print(node.data+" ");
    }
    
    public void delete(int value){
        if(root==null) return ;
        if(root.left == null && root.right == null){
            if(root.data == value){
                this.root = null;
                return ;
            }
            return ;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        Node current=null, target=null;
        while(!Q.isEmpty()){
            current = Q.poll();
            if(current.data == value) target = current;
            if(current.left != null) Q.offer(current.left);
            if(current.right != null) Q.offer(current.right);
        }
        if(target != null){
            target.data = current.data;
            Q.offer(this.root);
            while(!Q.isEmpty()){
                Node present = Q.poll();
                if(present.left!= null){
                    if(present.left == current){
                        present.left = null;
                        return ;
                    }else{
                        Q.offer(present.left);
                    }
                }if(present.right != null){
                    if(present.right == current){
                        present.right = null;
                        return;
                    }else{
                        Q.offer(present.right);
                    }
                }
            }
        }
    }
}
public class Main{
	public static void main(String[] args){
	    Tree t =  new Tree();
	    t.Insert(10);
	    t.Insert(20);
	    t.Insert(30);
	    t.Insert(40);
	    t.Insert(50);
	    t.Insert(60);
	    t.in_order();
	    t.delete(70);
	    System.out.println();
	    t.in_order();
	}
}