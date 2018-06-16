import java.util.Scanner;

class QuickSort
{
    
    int partition(int arr[], int l, int h)
    {
        int pivot = arr[h]; 
        int i = (l-1); 
        for (int j=l; j<h; j++)
        {
            
            if (arr[j] <= pivot)
            {
                i++;

              
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return i+1;
    }


   
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
          
            int pi = partition(arr, low, high);

          
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

  
  
  
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        int arr[]=new int[n];
for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
}
        QuickSort q = new QuickSort();
        q.sort(arr, 0, n-1);

       
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
        
    }
}