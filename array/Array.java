package array;

import java.util.Arrays;

class DefineArray
{
	


}


public class Array {

	
	public static void main(String[] args) {
		
		//way 1
		int a[]   = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		//System.out.println(Arrays.toString(a));
		
		//way 2
		int [] aa = {1,2,3,4,5};
		//System.out.println(Arrays.toString(aa));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int arr[]= {10,20,30,40,50};
		int []aaa= new int[5];
		aaa[0]=1;
		aaa[1]=2;
		aaa[2]=3;
		aaa[3]=4;
		aaa[4]=5;
		System.out.println(Arrays.toString(arr));
		
	//	System.out.println(Arrays.toString(aaa));
		
//		int aliasing []=arr; 
//		//aliasing[0]=15;
//		
//		System.out.println("Aliasing"+Arrays.toString(aliasing));
		
		int clone[]=arr.clone();
		System.out.println("clone"+Arrays.toString(clone));
	}

}

/*1.What is an array ?
 * Array is collection of homogeneous element.Store in continues memory location
 * 
 *2.we can also create single dimensional  and Multi dimensional array
 * 
 *3. Array Declare
 *Array declare in three type:
 * way 1 ---> int a[]   = new int[5];
 * way 2 ---> int [] aa = {1,2,3,4,5}; 
 * way 3 --->  int [] aaa= new int[]{10,20,30,40};
 * 
 * But way 3 is incorrect because you cannot specify both array size and initialize values 
 * explicit at same time
 * 
 * without loop you can also print array 
 * System.out.println(Array.toString()); 
 * 
 *4.Multi dimensional array declarations
 * 
 * way 1 int [][] arr;
 * way 2 int arr[][];
 * way 3 int [] arr[];
 * 
 * Declare + create 
 * 
 * int [][] arr= new int[3][4];
 * 
 * Declare + initialize(direct value)
 * 
 * int [][]arr={{1,2,3},{4,5,6}};
 * 
 * Array when data is arrange in row and column
 * 
 *5.Aliasing 
 *Aliasing in java two different reference variable pointing to the  same object memory location
 *
 *int arr[] = {10,20,30,40,50}
 *
 *int [] aliasing = arr;
 *
 *aliasing[0]=15; // modify
 *
 *6.clone()
 *create duplicate object with same data.And new memory allocation
 *
 *7.Jagged Array
 *	Is 2D where each row  can have different number of column
 *
 *8.3D Array
 *
 *Store data in layer(layer ->row->column)
 * int [][][]= new int[2][3][4];
 * 2--> layer
 * 3--> row
 * 4--> column
 */


