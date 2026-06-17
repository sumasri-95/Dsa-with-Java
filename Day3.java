
import java.util.*;

class Day3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Square pattern
       /* int num=sc.nextInt();
        for(int col=0;col<=num;col++){
            for(int row=0;row<=num;row++){
                System.out.print(" 1");
                
            }
            System.out.println();
        }*/

       //Right angle triangle
       /*int num=sc.nextInt();
       char ch='A';
       for(int col=1;col<=num;col++){
        ch='A';
        for(int j=1;j<=col;j++){
            System.out.print(ch+"");
            ch++;
        }
        
        System.out.println();
       } */

      //TRIANGLE
        /*int num=sc.nextInt();
        char ch='A';
        for(int i=1;i<=num;i++){
            ch='A';
            for(int j=1;j<=num-i;j++){
                System.out.print("");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
            ch='A';
            for(int j=1;j<=num-i;j++){
                System.out.print("");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        */

       //Halo Square
       /*int n=sc.nextInt();
       char ch='A';
       for(int i=1;i<=n;i++)
       {
            ch='A';
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print(ch+" ");
                    ch++;
                }
                else{
                    System.out.print("  ");
                }
             
            }
            System.out.println();
       }*/

      //halo right angle
      /*int n=sc.nextInt();
      for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            if(i==0||j==0||j==i||i==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
      }*/

     //helo inverted right angle triangle
    /* int n=sc.nextInt();
     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            if(i==1||j==1||j==i||i==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
     }*/
    
        //hallow diamond
       /* int n=sc.nextInt();
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if(j==1||j==2*i-1){
                        System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if(j==1||j==2*i-1){
                        System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }*/

       //rhombus
       /*int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }*/
        int num=sc.nextInt();
    
       for(int col=1;col<=num;col++){
            for(int row=1;row<=num;row++){
                System.out.print(row*row+" ");
            
            }
            System.out.println();
        }

    }
}

    
