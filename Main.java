//quick sort
/*public class Main{
    private static int partition(int[] arr,int lower,int upper){
        int pivot=arr[lower],low=lower,high=upper;
        while(low<=high){
            while(low<=upper && arr[low]<=pivot) low++;
            while(high>=lower && arr[high]>pivot) high--;
            if(low<high){
                int safe=arr[low];
                arr[low]=arr[high];
                arr[high]=safe;
            }
        }
        int safe=arr[high];
        arr[high]=arr[lower];
        arr[lower]=safe;
        return high;
    }
    public static void  Quick_sort(int[] arr,int lower,int upper){
        if(lower<upper){
            int pivot = partition(arr,lower,upper);
            Quick_sort(arr,lower,pivot-1);
            Quick_sort(arr,pivot+1,upper);
        }
    }
    public static void main(String args[]){
        int[] arr = {5,6,71,86,96,75,95,38,30,100};
        
        Quick_sort(arr,0,arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}*/
//towers of hanoi
/*public class Main {

    public static void toh(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " → " + destination);
            return;
        }

        // Step 1: move n-1 disks from source to auxiliary
        toh(n - 1, source, destination, auxiliary);

        // Step 2: move largest disk to destination
        System.out.println("Move disk " + n + " from " + source + " → " + destination);

        // Step 3: move n-1 disks from auxiliary to destination
        toh(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        toh(n, 'A', 'B', 'C');
    }
}*/
//Quick select
/*public class Main{
    private static int partition(int[] arr,int lower,int upper){
        int pivot=arr[lower],low=lower,high=upper;
        while(low<=high){
            while(low<=upper && arr[low]<=pivot) low++;
            while(high>=lower && arr[high]>pivot) high--;
            if(low<high){
                int safe=arr[low];
                arr[low]=arr[high];
                arr[high]=safe;
            }
        }
        int safe=arr[high];
        arr[high]=arr[lower];
        arr[lower]=safe;
        return high;
    }
    public static int  Quick_sort(int[] arr,int lower,int upper,int target){
        if(lower<=upper){
            int pivot = partition(arr,lower,upper);
            if(target==pivot) return arr[pivot];
            else if(target<pivot)
               return  Quick_sort(arr,lower,pivot-1,target);
            else
               return  Quick_sort(arr,pivot+1,upper,target);
        }   
        return -1;    
    }
    public static void main(String args[]){
        int[] arr = {5,6,71,86,96,75,95,38,30,100};
        int target=4;
        int sol=Quick_sort(arr,0,arr.length-1,target-1);
        System.out.print(sol);
        
    }
}*/
//Dutch national flag method 
/*public class Main{
    private static void swap(int[] array,int first,int second){
        int safe=array[first];
        array[first]=array[second];
        array[second]=safe;
    }
    public static void count(int[] a){
        int low=0,mid=0,high=a.length-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;

            }else if(a[mid]==1){
                mid++;
            }else{
                swap(a,mid,high);
                high--;
            }
        }
    }
    
    public static void main(String args[]){
        int[] a={0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
        count(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}*/
//min heap
import java.util.*;
public class Main{
    private static int min_cost(int[] arr){
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
        for(int val: arr) min_heap.add(val);
        while(min_heap.size() > 1){
            int fi=min_heap.poll();
            int sc=min_heap.poll();
            min_heap.add(fi+sc);
        }

        return min_heap.poll();
    }
    public static void main(String args[]){
        /*PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
        min_heap.add(10);
        min_heap.add(20);
        min_heap.add(30);
        min_heap.add(3);
         min_heap.add(40);
        min_heap.add(2);
        System.out.println(min_heap.poll());
        System.out.println(min_heap);*/
        int[] arr={2,2,1,7,5,3};
        System.out.print(min_cost(arr));

    }
}
