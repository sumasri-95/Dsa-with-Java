//basic queue methods
/*import java.util.*;
class Day12{
    public static void main(String args[]){
        Queue<Integer> eg = new LinkedList<>();
        eg.offer(10);
        eg.offer(20);
        eg.offer(30);
        eg.offer(40);
        eg.poll();
        System.out.print(eg.peek());
        System.out.print(eg);
    }
}*/
// basic method of deque
/*import java.util.*;
class Day12{
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerLast(30);
         dq.offerLast(40);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        }
}*/

class Node{
    int data;
    Node prev,next;
    public Node(int data){
        this.data=data;
        this.next=this.prev=null;
    }
}
class Deque{
    Node head,tail;
    public Deque(){
        this.head=this.tail=null;
    }
    public void addFirst(int data){
        Node new_node=new Node(data);
        if(this.head == null){
            this.head=this.tail=new_node;
        }else{
            new_node.next=this.head;
            this.head.prev=new_node;
            this.head=new_node;
        }
       
        
    }
    public void addLast(int data){
        Node new_node = new Node(data);
        
        if(this.tail==null){
            this.head=this.tail=new_node;
        }else{
            new_node.prev=this.tail;
            this.tail.next=new_node;
            this.tail = new_node;
        }
    }
    public void pollFirst(){
        if(this.head==null){
            return;
        }else{
            this.head=this.head.next;
            this.head.prev=null;
        }
    }
    public void pollLast(){
        if(this.head == null){
            return ;
        }else{
            this.tail=this.tail.prev;
            this.tail.next=null;
        }
    }
    public void add(int data){
        addLast(data);
    }
    public void remove(){
        pollLast();
    }
    public void display(){
        if(this.head == null){
            return ;
        }
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
class Day12{
    public static void main(String args[]){
        Deque dq =new Deque();
        dq.addFirst(20);
        dq.addLast(10);
        dq.addLast(30);
        dq.addLast(40);
        dq.addFirst(50);
        dq.add(50);
        dq.remove();
        dq.pollFirst();
        dq.pollLast();
        dq.display();
    }
}