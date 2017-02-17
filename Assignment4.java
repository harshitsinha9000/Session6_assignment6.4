package java_session6;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a;
		int size,i,elem,search,low,high,index=0,mid,found=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		
		a = new int[size];
		
		System.out.println("Enter the "+size+" elements in ascending order(for array) ");
		
		for(i=0;i<size;i++)
		{
			elem = sc.nextInt();
			a[i] = elem;
			
			sc.reset();
		}
		
		System.out.println("Array elements");
		for(i=0;i<size;i++)
		{
			System.out.print(+a[i]+" "); 
		}
		
		sc.reset();
		System.out.println(" ");
		System.out.println("Enter the element to be searched ");
		search=sc.nextInt();
		
		low=0;
		high=(size-1);
		
		while(low<=high)
		{
			mid = (low+high)/2;
			
			if(search==a[mid])
				{	index=mid;
					found=1;
					break;
				}
			else if(search<=a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		if(found==1)
			System.out.println("Element found at position = "+index); 
		else
			System.out.println("Element not found  ");
	}

}
