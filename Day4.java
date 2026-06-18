//Arrays 
//sum of array
/*import java.util.*;
class Day4{
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println(sum);

    }
}*/

//largest value of array
/*import java.util.*;
class Day4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        int max=a[0];
        int scmax=a[0];
        int thmax=a[0];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
             if(a[i]>max){
                thmax=scmax;
                scmax=max;
                max=a[i];
             }
             else {
                thmax=a[i];
             }
              
        }
       
       System.out.println(thmax);
        

    }
}*/

//Rotation of array by k position
/*import java.util.*;
class Day4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        /*int n=sc.nextInt();
        int res[] = new int[n];
        int a[]=new int[10];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("enter th k position value:");
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<n;i++){
                res[(i+k)%n]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }*/
       /*int n=sc.nextInt();
        int res[] = new int[n];
        int a[]=new int[10];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("enter th k position value:");
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<n;i++){
                res[i]=a[(i+k)%n];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }*/
        /*

    }
}*/

//Zero moves to end of the array
/*import java.util.*;
class Day4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,0,2,3,0,4,7,0,0};
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index++]=a[i];
            }
        }
        while(index<a.length){
            a[index++]=0;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}*/

//subarray sum
import java.util.*;
class Day4{
    public static void main(String args[]){
        int a[]={1,2,3};
        int sum=5;
        for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    if(a[j]+a[j+1]==sum){
                        
                    }
                }
        }
        System.out.println("false");
    }
}