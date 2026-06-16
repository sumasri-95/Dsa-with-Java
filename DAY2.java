
/*import java.util.*;
class DAY2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
                fact = fact*i;   
        }
        System.out.println(fact);
    }
}*/

//SPY NUMBER:check if the sum of digits equal to prduct of digits for a given number.print all supy number up to N.

/*import java.util.*;
class DAY2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0,product=1;;
        while(a>0){
            int rem = a%10;
            sum=sum+rem;
            product=product*rem;
            a=a/10;
        }
        System.out.println(sum+" "+product);
        if(sum==product){
            System.out.println(" it is spy number");
        }else{
            System.out.println(" it is not spy number");
        }
    }
}*/

//MAGIC NUMBER:A number is magic if recursively suming its digits yields 1.check if N is a magic number or not.

/*import java.util.*;
class DAY2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n>9){
            int sum=0;
            while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        n=sum;
        }
        
        if(n==1){
            System.out.println("magic number");
        }
        else{
            System.out.println("not magic number");
        }
    }
}*/

//HAPPY NUMBER:if sum of its square digits are calculated till the single digit is obtained by recursively 
//              adding sum of its square digits .if the single digit comes as 1 then it tis happy number

/*import java.util.*;
class DAY2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n>9){
            int sq=0;
            while(n!=0){
            int rev=n%10;
            sq=sq+(rev*rev);
            n=n/10;

        }
        n=sq;
        }
        if(n==1){
            System.out.println("happy number");
        }
        else{
            System.out.println("not happy number");
        }
        
    }
}*/

//PERFECT NUMBER:given number is equal to sum of its factors.
/*import java.util.*;
class DAY2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}*/

import java.util.*;
class DAY2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);*/

        /*int n=sc.nextInt();
        int sum=0;
        while(n!=0)
        {
            int rev=n%10;
            sum=rev+(sum*10);
            n=n/10;
        }
        System.out.println(sum);*/

        /*int n=sc.nextInt();
        int sum=0;
        while(n!=0)
        {
            int rev=n%10;
            sum=sum+rev;
            n=n/10;
        }
        System.out.println(sum);*/

        int n=sc.nextInt();
        if(perfect(n)){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not perfect square");
        }
    }
    static boolean perfect(int n){
        for(int i=1;i*i<=n;i++){
                if(i*i == n){
                    return true;
                }
             
        }
           return false;
    }
}


