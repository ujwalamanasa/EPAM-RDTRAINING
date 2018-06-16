
import java.util.Scanner;
 

public class MergeSort 
{
    public static void sort(int[] a, int low, int high) 
    {
        int y = high - low;         
        if (y <= 1) 
            return; 
        int mid = low + y/2; 
       
        sort(a, low, mid); 
        sort(a, mid, high); 
        
        int[] temp = new int[y];
        int i = low, j = mid;
        for (int k = 0; k < y; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < y; k++) 
            a[low + k] = temp[k];         
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner( System.in );        
       
        int n, i;
        
        System.out.println("Enter number of integer elements");
        n = sc.nextInt();
       
        int arr[] = new int[ n ];
       
        System.out.println("Enter integer elements");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
       
        sort(arr, 0, n);
      
               
        for (i = 0; i < n; i++)
            System.out.println(arr[i]);            
                  
    }    
}