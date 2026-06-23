public class Day8{
    /*private static int[] merge(int[] a1,int[] a2){
        int a1_size = a1.length;
        int a2_size = a2.length;
        int[] result = new int[a1_size+a2_size];
        int i=0,j=0,k=0;
        while(i<a1_size && j<a2_size){
            if(a1[i]<=a2[j]){
                result[k++]=a1[i++];
            }else{
                result[k++]=a2[j++];
            }
        }
        while(i<a1_size){
            result[k++]=a1[i++];
        }
        while(j<a2_size){
            result[k++]=a2[j++];
        }
        return result;
    }
    public static void main(String args[]){
        int[] m={1,2,3};
        int[] n={4,5,6,7,8,9};
        int[] sol=merge(m,n);
        for(int ele:sol){
            System.out.print(ele+" ");
        }
    }*/

    public static void merge(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;
            merge(arr, low, mid);
            merge(arr, mid + 1, high);
            mergeSort(arr, low, mid, high);
        }
    }
    public static void mergeSort(int[] arr, int low , int mid, int high)
    {
        int size = high - low + 1;
        int[] dummy = new int[size];
        int i = low, j = mid + 1, k = 0;
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                dummy[k++] = arr[i++];
            }
            else
            {
                dummy[k++] = arr[j++];
            }
        }
        while(i <= mid)
        {
            dummy[k++] = arr[i++];
        }
        while(j <= high)
        {
            dummy[k++] = arr[j++];
        }
        for(int ind = 0; ind < size; ind++)
        {
            arr[low + ind] = dummy[ind];
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 7, 15, 3, 16, 8};
        merge(arr, 0, arr.length - 1);
        for(int i=0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}