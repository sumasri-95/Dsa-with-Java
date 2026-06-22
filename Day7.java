import java.util.*;
import java.lang.*;
class Day7{
    /*public static int check_left(int[] arr,int target){
        int low=0,high=arr.length-1;
        int possible=-1;
        while(low<=high){
            int mid=low+((high-low)>>1);
            if(arr[mid]==target){
                possible=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return possible;
    }
    public static int check_right(int[] arr,int target){
        int low=0,high=arr.length-1;
        int possible=-1;
        while(low<=high){
            int mid=low+((high-low)>>1);
            if(arr[mid]==target){
                possible=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return possible;
    }
    public static void main(String args[]){
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int left=check_left(arr,target);
        int right=check_right(arr,target);
        System.out.print(left);
        System.out.print(right);
    }*/

   
}