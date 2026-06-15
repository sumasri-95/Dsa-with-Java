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