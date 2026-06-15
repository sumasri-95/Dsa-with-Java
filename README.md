# Dsa-with-Java
about java with dsa
DSA:
        Array
        linkedlist
        stack
        queue
        trees
        graph
        sorting techniques
        searching techniques
        algorithm
---program for numerical to binary form---
import java.util.*;
class DAY1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String Binary = " ";
        while(n>0){
            int rem = n%2;
            Binary = rem +Binary;
            n = n/2;

        }
       System.out.println(Binary);
    }
}

DAY 1 ---- basic of java 
        control statements 
        operators 
        string with methods and function 
        function 
        oops 
        mutltithreading array
