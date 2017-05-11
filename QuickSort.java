class QuickSort
{
    int partition(int arr[], int min, int max)
    {
        int pivot= arr[max];
        int i = (min-1);
        for (int j=min;j<=max-1;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;

                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[max];
        arr[max] = temp;

        return i+1;
    }

    void sort(int arr[], int min, int max)
    {
        if(min<max)
        {
            int pi=partition(arr, min, max);

            sort(arr, min, pi-1);
            sort(arr, pi+1, max);
        }
    }

    static void printArray(int arr[])
    {
        for (int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[] = {54,36,2,67,5,3,7,65,89,1,10,15,63,75,57};
        QuickSort qs = new QuickSort();

        qs.sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array is :");
        qs.printArray(arr);    
    }
}