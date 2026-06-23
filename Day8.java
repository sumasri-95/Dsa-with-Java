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

    public static int merge(int[] arr, int low, int high)
    {
        int ans=0;
        if(low < high)
        {
            int mid = (low + high) / 2;
            ans+= merge(arr, low, mid);
            ans+=merge(arr, mid + 1, high);
            ans+=mergeSort(arr, low, mid, high);
        }
        return ans;
    }
    public static int mergeSort(int[] arr, int low , int mid, int high)
    {
        int size = high - low + 1;
        int[] dummy = new int[size];
        int i = low, j = mid + 1, k = 0,count=0;
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                dummy[k++] = arr[i++];
            }
            else
            {
                count+=(mid-i+1);
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
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int sol=merge(arr, 0, arr.length - 1);
        
         System.out.print(sol+ " ");
        
    }

}