import java.util.*;
class DAY1{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       for(int i=0;i<n;i++){
        System.out.println("enter number:");
            int a=sc.nextInt();
            if((a&1)==0){
            System.out.println("even");
        } 
        else{
            System.out.println("odd");
        }
       }
       
    }
}