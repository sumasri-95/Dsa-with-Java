public class Main{
    private static void partition(int[] arr,int pivot){
        int low=0,upper=arr.length-1;
        while(low<upper){
            while(arr[low]<=pivot) low++;
            while(upper>low && arr[upper]>pivot) upper--;
            if(low<upper){
                int safe=arr[low];
                arr[low]=arr[upper];
                arr[upper]=safe;
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {5,6,71,86,96,75,95,38,30,100};
        int pivot=53;
        partition(arr,pivot);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}