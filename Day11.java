import java.util.*;
/*class Day11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int zeros = 0;
        int deno=5;
        while(deno<=num){
            zeros+=(num/deno);
            deno*=5;
        }
        System.out.println(zeros);

        sc.close();
    }
}*/

/* class Stack{
    int[] arr;
    int top,capacity;
    public Stack(int size){
        this.arr= new int[size];
        this.top=-1;
        this.capacity=size;
    }
    void push(int element){
        if(this.isFull()) return ;
        this.top++;
        this.arr[this.top] =  element;
    }
    int pop(){
        if(this.isEmpty()) return -1;
        int ele = this.arr[this.top];
        top--;
        return ele;
    }
    int peek(){
        if(this.isEmpty()) return -1;
        return this.arr[this.top];
    }
    boolean isFull(){
        return this.capacity==this.top+1;
    }
    boolean isEmpty(){
        return this.top == -1;
    }
    void display(){
        for(int id=top; id>=0;id--){
            System.out.print(arr[id]+" ");
        }
    }
}
public class Day11{
    public static void main(String[] args){
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.peek());
        s.display();
    }
}*/
/*import java.util.*;
class Day11
{
    public static void main(String[] args)
    {
        List<Integer> s = new ArrayList<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s.isEmpty());//checking for atleast 1 value
        System.out.println(s.size());//printing no.of values
        System.out.println(s.remove(s.size()-1));
        System.out.println(s);
    }
}*/

/*class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Stack
{
    Node head = null;
    public Stack()
    {
        this.head = null;
    }

    boolean isEmpty()
    {
        return this.head == null;
    }

    void push(int e)
    {
        Node new_node = new Node(e);
        new_node.next = this.head;
        this.head = new_node;
    }
    int pop(){
        if(this.isEmpty()) return -1;
        Node del = this.head;
        this.head= this.head.next;
        del.next = null;
        return del.data;
    }
    int peek(){
        if(this.isEmpty()) return -1;
        return this.head.data;
    }
    void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
class Day11
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println(s.pop());
        s.display();
         System.out.println(s.peek());
    }
}*/
// solution1
/*public class Day11{
    public static void main(String args[]){
        String s = "((()))";
        int open=0,closed=0;
        for(char sym : s.toCharArray()){
            if(sym == '(') open++;
            else closed++;
        }
        System.out.print(open==closed);
    }
}*/
public class Day11{
    public static void main(String args[]){
        String s = ")(()))";
        int brace_count=0;
        for(char sym : s.toCharArray()){
            if(sym == '(') brace_count++;
            else brace_count--;
            if(brace_count<0) break;
        }
        System.out.print(brace_count==0);
    }
}

