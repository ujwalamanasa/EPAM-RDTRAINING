import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array"); 
	int n=sc.nextInt();
	System.out.println("Enter array elements");
  int array[]=new int[n];
  boolean f;
	for(int i=0;i<n;i++) {
		array[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++) {
		f=false;
		for(int j=0;j<n-1-i;j++) {
			if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
                 f=true;		
			}
		}
		if(f==false)break;
	}
	System.out.println("Sorted array is");
	for(int i=0;i<n;i++) {
		System.out.println(array[i]);
	}
		
	

	}

}
